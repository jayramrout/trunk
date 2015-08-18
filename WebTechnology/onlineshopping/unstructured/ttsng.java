import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ttsng extends HttpServlet
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
		String qry="select s1 from music group by s1 order by sum(nocs) desc ";
		rs=stmt.executeQuery(qry);
		pw.println("<br>");
		pw.println("<pre><b><font size=6>"+"\t\t\t"+"<u>"+"TOP TEN SONGS"+"</pre></u></b></font>");
		pw.println("<form  action=http://localhost:8080/servlet/ttsng1 method=get>");
		pw.println("<br><font size=4><b>");
		//pw.println("<pre>"+"TITLE\t\t\t\tAUTHOR\t\t\t\tPUBLISHER NAME\t\t\t SUBJECT\t\t\tRATE"+"</pre></font></b>");
		pw.println("<pre><select name=selectbk size=5>");
		while(rs.next())
		{
		String t=rs.getString(1);
		pw.println("<option>"+t+"</option><br>");
		}
	
		pw.println("</pre></select></font>");
		pw.println("<font size=3><br><br><input type=submit value=\"Show the list\"></font></form>");}
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