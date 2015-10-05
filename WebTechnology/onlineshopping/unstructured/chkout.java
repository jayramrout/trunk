import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class chkout extends HttpServlet
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
		String qry="select * from cart";
		rs=stmt.executeQuery(qry);
		//pw.println("Statement Prepared and Executed...");
		pw.println("<pre><b><font size=6>"+"\t\t\t"+"<u>"+"BILL"+"</pre></u></b></font>");
		//pw.println("<form action=\"http://localhost:8080/servlet/addcart\" method=post>");
		pw.println("<br><font size=4><b>");
		pw.println("<pre>"+"ITEM NAME\t\t\tQUANTITY\t\tRATE\t\tVALUE"+"</pre></font></b>");
		
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
		pw.println(s);
		for(int i=len;i<8;i++)
			s=s.concat(".");
		int n1=Integer.parseInt(rs.getString(2));
                                       int n2=Integer.parseInt(rs.getString(3));
                                       int n=n1*n2;
                                       pw.println(s); 
		/*s=s.concat(String.valueOf(n));
                                        pw.println(s+"\t "+n);
		pw.println(s+"<br>");*/
		}
		int r=stmt.executeUpdate("delete cart");
		pw.println("Now your cart is empty");
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