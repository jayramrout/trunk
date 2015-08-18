import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class signin extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	Connection con;
	int check=1;
	Statement stmt;
	//ResultSet rs;
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		stmt=con.createStatement();
		String usrid="'"+req.getParameter("txtuid")+"'";
		String passwd="'"+req.getParameter("txtpwd")+"'";
		String qry="select * from reges where userid="+usrid+" and passward = "+passwd;
		pw.println(qry);
                                pw.println("Hello");
		ResultSet rs=stmt.executeQuery(qry);
		pw.println(qry +" is executed");
		if(rs==null)
		{
			pw.println("\nInvalid Userid");
			check=0;
		}
		/*if(check==1)
                                  {*/
                                 qry="update reges set reges.flag='y' where userid="+usrid;
		  pw.println(qry);
		int r=stmt.executeUpdate(qry);
		pw.println(qry);
		//}
}
catch(ClassNotFoundException e){System.out.println("In catch1");}
catch(SQLException e){System.out.println("In catch2");
}
/*finally
{
	try
	{ if (con!=null)
	 con.close();
	}catch(SQLException e){}}*/
}
}