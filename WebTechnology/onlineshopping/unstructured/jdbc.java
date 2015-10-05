import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class jdbc extends HttpServlet
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
		pw.println("Driver Loaded");	
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		pw.println("Connection Established");
		stmt=con.createStatement();
		pw.println("Statement Prepared");
		String qry="select * from books where title like 'a%' ";
		pw.println(qry);
		pw.println("Statement Under Execcution.....");
		rs=stmt.executeQuery(qry);
		pw.println("<ul>");
		while(rs.next())
		{
		pw.println("<li>"+rs.getString("title")+"    "+rs.getString("author"));
		}
		pw.println("<ul>");
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