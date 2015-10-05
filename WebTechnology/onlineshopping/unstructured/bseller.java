import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class bseller extends HttpServlet
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
		String qry="select pname from books group by pname order by sum(nocs) desc ";
		rs=stmt.executeQuery(qry);
		pw.println("<br>");
		pw.println("<form action=http://localhost:8080/servlet/tpublish method=get>");	
		pw.println("<pre><font size=5>"+"\t\t"+"<u><b>LIST OF BEST SELLERRS"+"</U></FONT></pre></b>");

		pw.println("<pre><select name=selectpub size=5>");
		while(rs.next())
		{
		/*String t=rs.getString("sum(nocs)");
		int len=t.length();
		len=40-len;
		String s="     ";s=s.concat(t);
		//for(int i=0;i<len;i++)
			s=s.concat(" - ");*/
		String s=rs.getString("pname");
		pw.println("<option>"+s+"</option><br>");
		}
		pw.println("</select></pre>");
		pw.println("<input type=submit value=Display_publications>");
		pw.println("</form></font>");
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