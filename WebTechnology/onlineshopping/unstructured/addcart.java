import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
public class addcart extends HttpServlet
{	PrintWriter pw;	
	char myflag='y';
	public void doPost (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Connection con=null;
		pw=res.getWriter();
		Statement stmt=null;
		ResultSet rr=null;
		ResultSetMetaData rsmd;
		res.setContentType("text/html");
		
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		stmt=con.createStatement();
		String inm="'"+req.getParameter("txtinm")+"'";
		String q="'"+req.getParameter("txtq")+"'";
		String t=req.getParameter("txtr");
		char type=t.charAt(0);
                                System.out.println((char)type);
		pw.println("Item name "+inm);
                                pw.println("Quantity "+q);
		pw.println("Item Type "+t);
		pw.println((char)type);
		String qry1=null;
		switch(type)
		{
			case 'H':
			case 'h':
				qry1="select rate,iname from hware where iname="+inm;
				pw.println(qry1);
				// rr=stmt.executeQuery("select rate from hware where iname="+inm);
				rr=stmt.executeQuery(qry1);
				pw.println("Query is Executed...");
				break;
			case 'S':
			case 's':      qry1="select rate,iname from sware where iname="+inm;
				pw.println(qry1);
				break;
			
			case 'M':
			case 'm':   rr=stmt.executeQuery("select rate,title from music where title="+inm);
				break;
			
			case 'B':
			case 'b': rr=stmt.executeQuery("select rate,title from books where title="+inm);
				break;
			default:
				{
				pw.println("Invalid choice");
				 myflag='n';
				}
                                                           
		}
		        pw.println("Concerned Statement Prepared and Executed...");
						
                                pw.println((char)type+" Valid item type "+myflag);
		
		/*rsmd=rr.getMetaData();
                                int col=rsmd.getColumnCount();
                                pw.println("The Above Query has fetched "+col+ " Columns");*/
		String name="";
		while(rr.next())	
                                {
		String rate=rr.getString(1);
		int amount=Integer.parseInt(rate);
                                name=rr.getString(2);
                                  System.out.println(" "+rate+" "+name);
		pw.println(" "+amount+" "+name);
		pw.println("\n"+myflag);
		System.out.println("Valid item name "+rr.getString(2)+"     "+myflag);
		}
		pw.println(" "+myflag);
                                 if(myflag=='y')
                                  {
			pw.println("\nOK");
		pw.println("Valid item name "+name+"     "+myflag);
		if(rr==null)
		{
			pw.println("Not a valid item");
			myflag='n';
		}
		pw.println("Valid item name "+name+"     "+myflag);
                                  if(myflag=='y')
                                  {
                                        pw.println(" "+inm+" "+q);
                                       rr=stmt.executeQuery("select * from reges where flag='y'");
		if(rr==null)
		{
			pw.println("\nSign in first");
			//System.exit(0);
                                                 myflag='n';
		}
		pw.println("Signed in "+rr.getString(1)+"     "+myflag);
                                    if(myflag=='y')
                                   {
		String data="'"+rr.getString(1)+"'";	
		String qry="insert into cart values("+inm+","+q+","+data+")";
		pw.println("Query is "+qry);
		int rs=stmt.executeUpdate(qry);
		pw.println("1 row inserted");
                          } 
                           }  
                            }
	           	}		

		catch(ClassNotFoundException e){}
		catch(SQLException e){}
	}
}
