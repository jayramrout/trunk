import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class sware extends HttpServlet
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
		String qry="select iname,make,rate from sware where iname ='"+ alph+"'";
		rs=stmt.executeQuery(qry);
		pw.println("<pre><b><font size=6>"+"\t\t\t"+"<u>"+" LIST OF SELECTED SOFTWARE PRODUCTS"+"</pre></u></b></font>");
		pw.println("<form action=\"http://localhost:8080/servlet/addcart\" method=post>");
		pw.println("<br><font size=4><b>");
		pw.println("<pre>"+"ITEM- NAME\t\tSPECIFICATIONS\t\tRATE"+"</pre></font></b>");
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
		for(int i=len;i<40;i++)
			s=s.concat(".");
		t=rs.getString(3);
		s=s.concat(t);
		pw.println("<option>"+s+"</option><br>");
		}
	
		//pw.println("</pre></select></font>");
		pw.println("<pre>               Selected items</pre>");
		pw.println("<pre><label>		Item name:        </label><input type=text name=txtinm></pre>");
		pw.println("<pre><label>		Item Quantity:   </label><input type=text name=txtq></pre>");
		pw.println("<pre><label>		Item type:        </label><input type=text name=txtr></pre>");
		pw.println("<pre><label> 		Please enter H/h for Hardware  S/s for Software M/m for Music   B/b for Books</pre></label>");
		pw.println("<font size=3><br><br><input type=submit value=Add_to_Cart></font></form>");
}
catch(ClassNotFoundException e){}
catch(SQLException e){System.out.println("In catch2");
}
finally
{
	try
	{ if (con!=null)
	 con.close();
	}catch(SQLException e){}}
}
}