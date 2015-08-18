import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ssh extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		stmt=con.createStatement();
		String alph=req.getParameter("ssrh");
		String qry="select title,type,artist1,artist2,s1,s2,rate from music where s1 like '"+alph+"%' or s2 like'"+alph+ "%'";
		rs=stmt.executeQuery(qry);
		pw.println("<center><u>"+"<font size=5><b>"+"SELETED SONGS" +"</b></u></center></font>");
		pw.println("<form action=\"http://localhost:8080/servlet/addcart\" method=post>");
		pw.println("<br><font size=4><b>");
		pw.println("<pre>"+"TITLE\t\t\t\tTYPE    ARTISTS\t\t\t \t\t\tSONGS\t\t\t\t\t\tRATE"+"</pre></font></b>");
		//pw.println("<pre><select name=selectbk size=5>");
		while(rs.next())
		{
		String t=rs.getString(1);
		int len=t.length();
		len=40-len;
		String s="     ";s=s.concat(t);
		len=t.length();
		for(int i=len;i<40;i++)
			s=s.concat(".");
		t=rs.getString(2);
		s=s.concat(t);
		len=t.length();
		for(int i=len;i<8;i++)
			s=s.concat(".");
		t=rs.getString(3);
		len=t.length();
		s=s.concat(t);
		s=s.concat(",");
		t=rs.getString(4);
		s=s.concat(t);
		len=len+t.length();
		for(int i=len;i<60;i++)
			s=s.concat(".");
		t=rs.getString(5);
		len=t.length();
		s=s.concat(t);
		s=s.concat(",");
		t=rs.getString(6);
		s=s.concat(t);
		len=len+t.length();
		for(int i=len;i<60;i++)
			s=s.concat(".");
		t=rs.getString(7);
		s=s.concat(t);
		pw.println("<option>"+s+"</option><br>");
		}
		pw.println("</pre></select></font>");
		
		pw.println("NOTE: Type a = ALBUM, m = MOVIE");
		pw.println("<pre>               Selected items</pre>");
		pw.println("<pre><label>		Item name:        </label><input type=text name=txtinm></pre>");
		pw.println("<pre><label>		Item Quantity:   </label><input type=text name=txtq></pre>");
		pw.println("<pre><label>		Item type:        </label><input type=text name=txtr></pre>");
		pw.println("<pre><label> 		Please enter H/h for Hardware  S/s for Software M/m for Music   B/b for Books</pre></label>");
		pw.println("<font size=3><br><br><input type=submit value=Add_to_Cart></font></form>");
}
catch(ClassNotFoundException e){}
catch(SQLException e){}
finally
{
	try
	{ if (con!=null)
	 con.close();
	}catch(SQLException e){}}
}
}