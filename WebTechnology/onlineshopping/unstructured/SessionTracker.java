import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SessionTracker extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession(true);
		Integer count=(Integer)session.getValue("tracker.count");
		if(count==null)
			count=new Integer(1);
		else
			count=new Integer(count.intValue()+1);
		session.putValue("tracker.count",count);
		out.println("<html><head><title>SessionTracker</title></head>");
		out.println("<body><h1>Session Tracking Demo</h1>");
		out.println("You've visited this page "+count+((count.intValue()==1)?"time.":" times."));
		out.println("<p>");
		out.println("<h2>Here is your session data:</h2>");
		String[] names=session.getValueNames();
		for(int i=0;i<names.length;i++)
		{
			out.println(names[i]+":"+session.getValue(names[i])+"<br>.");
		}
		out.println("</body></html>");
}
}
