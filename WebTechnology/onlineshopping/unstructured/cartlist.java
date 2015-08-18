import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class cartlist extends HttpServlet
{
	public void doGet (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String qry="select * from cart";
		
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		stmt=con.createStatement();
		rs=stmt.executeQuery(qry);
		out.println(qry);
		if(rs.next())
		{
			out.println("Your cart is empty");
			System.exit(0);
		}
		out.println("You currently have the following items in your cart:<br>");
		out.println("<ul>");
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
		len=t.length();
		s=s.concat(t);
		s=s.concat("\t");
		t=rs.getString(3);
		s=s.concat(t);
		out.println("<li>"+s+"</li>");
		}
		out.println("</ul>");
		//out.println("<form action=\"http://localhost:8080/servlet/addcart\" method=post>");
	out.println("Would you like to <br>");
//	out.println("<input type=submit value=\"Add More Items\"></form>");
	out.println("<form action='http://localhost:8080/servlet/chkout' method=get>");
	out.println("<input type=submit value=\"Check Out\">");
	out.println("</form>");
	out.println("</body></html>");
}
catch(ClassNotFoundException e){System.out.println("In catch1");}
catch(SQLException e){System.out.println("In catch2");}
}
}
