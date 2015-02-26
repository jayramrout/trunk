<%@page contentType="text/html" pageEncoding="UTF-8" 
		import="org.hibernate.SessionFactory, 
		org.hibernate.cfg.Configuration, 
		org.hibernate.Session, 
		org.hibernate.Transaction, 
		java.util.List, 
		java.util.Iterator, info._7chapters.hibernate.ch01.Guestbook" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%!
    SessionFactory sessionFactory;
    org.hibernate.Session hibSession;
    List<Guestbook> guestbook;
%>

<%
    sessionFactory = new Configuration().configure().buildSessionFactory();
    hibSession = sessionFactory.openSession();
    Transaction tx = null;

    String submit = request.getParameter("btnSubmit");
    if(submit != null && ("Submit").equals(submit)) {
        Guestbook gb = new Guestbook();
        try {
            tx = hibSession.beginTransaction();

            String guest = request.getParameter("guest");
            String message = request.getParameter("message");
            String messageDate = new java.util.Date().toString();
            gb.setVisitorName(guest);
            gb.setMessage(message);
            gb.setMessageDate(messageDate);

            hibSession.save(gb);
            tx.commit();
        }
        catch (RuntimeException e) {
            if(tx != null) tx.rollback();
            throw e;
        }
        response.sendRedirect("GuestBookView.jsp");
    }

    try {
        hibSession.beginTransaction();
        guestbook = hibSession.createQuery("from Guestbook").list();
    }
    catch (RuntimeException e) {
        throw e;
    }

   hibSession.close();
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
		<title>Guest Book</title>
	</head>
	<body bgcolor="pink">
		<table border="0" cellpadding="0" cellspacing="0" align="center" width="760">
			<tr>
				<td>
					<table border="0" cellpadding="0" cellspacing="0" width="100%">
						<tr>
							<td width="60%" valign="top" align="left" style="padding-right:0px; padding-left:0px; padding-bottom:0px; font:24px/30px Georgia; width:228px; color:#786e4e; padding-top:0px; height:37px;">
								View the Guest Book
							</td>
							<td valign="bottom" align="right" style="font:12px/16px Georgia, serif; color:#786e4e;">
								<b>Click <a href="<%=request.getContextPath()%>/JSP/GuestBookEntry.jsp"> here</a> to sign the guestbook.</b>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr align="left" valign="top">
				<td height="20">
					<hr />
				</td>
			</tr>
			<tr>
				<td>
					<table border="0" cellpadding="0" cellspacing="0" align="center" width="100%">
                    <%
                        Iterator iterator = guestbook.iterator();
                        while (iterator.hasNext()) {
                            Guestbook objGb = (Guestbook) iterator.next();
                    %>
                        <tr>
                            <td style="font:12px/16px Georgia; color:#786e4e;">
                                On <%=objGb.getMessageDate()%>,<br />
								<b><%=objGb.getVisitorName()%>:</b>
                                <%=objGb.getMessage()%>
								<br /><br />
                            </td>
                        </tr>
                    <%
                        }
                    %>
                    </table>
				</td>
			</tr>
		</table>
	</body>
</html>