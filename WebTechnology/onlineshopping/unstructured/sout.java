import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class sout extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	Connection con;
	Statement stmt;
	ResultSet rs;
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		//pw.println("Connection Established and Driver Loaded");
		stmt=con.createStatement();
		pw.println("<body bgcolor=#08aaaa>");
		pw.println("<table >");
		pw.println("<tr><td align=center bgcolor=pink>");
		pw.println("<pre><font face=impact size=50 color=black>           A TO Z            <br></font><font size=10 color=balck><i>ONLINE SHOPPING</i></FONT></td></tr></PRE>");
pw.println("<tr><td align=\"center\" bgcolor=#dddddd><font face=\"script\" size=4 color=yellow>SURF THE SITE WITH ALL THE DISCOUNT PRICES</td></tr></font></table></center>");
		pw.println("<pre>\n\n\n\n\n</pre>");
		pw.println("<marquee><b><pre><font size=6>"+"\t"+"THANKS FOR VISITING OUR SITE"+"<BR>\t    "+"PLEASE VISIT US AGAIN"+"</pre></b></font></marquee>");
		pw.println("<br><font size=4><b>");
		pw.println("</body>");
		int r=stmt.executeUpdate("delete cart");
		r=stmt.executeUpdate("update reges set flag='n' where flag='y'");
}
catch(ClassNotFoundException e){}
catch(SQLException e){}
/*finally
{
	try
	{ if (con!=null)
	 con.close();
	}catch(SQLException e){}}*/
}
}