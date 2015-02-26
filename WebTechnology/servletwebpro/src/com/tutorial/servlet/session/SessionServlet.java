package com.tutorial.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="SessionServlet" ,description = "SessionServlet", urlPatterns = { "/SessionServlet" })
public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException
					{
		// Create a session object if it is already not  created.
		HttpSession session = request.getSession(true);

		ServletContext context = getServletContext();

		session.setMaxInactiveInterval(60); // in seconds

		// Get session creation time.
		Date createTime = new Date(session.getCreationTime());
		// Get last access time of this web page.
		Date lastAccessTime = 
				new Date(session.getLastAccessedTime());

		String title ="";
		Integer visitCount = new Integer(0);
		Integer requestCount = new Integer(0);
		String visitCountKey = new String("visitCount");
		String userIDKey = new String("userID");
		String userID = new String("ABCD");

		// Check if this is new comer on your web page.
		if (session.isNew()){

			title = "Welcome to my website";
			session.setAttribute(userIDKey, userID);

			requestCount = (Integer)context.getAttribute("totalRequestServed");
			requestCount = (requestCount != null ? requestCount : 0) + 1;
			//RequestDispatcher
		} else {
			title = "You are in the same Session !!!";
			visitCount = (Integer)session.getAttribute(visitCountKey);
			visitCount = (visitCount != null ? visitCount : 0) + 1;
			userID = (String)session.getAttribute(userIDKey);

			requestCount = (Integer)context.getAttribute("totalRequestServed");
			requestCount = (requestCount != null ? requestCount : 0) + 1;


		}
		session.setAttribute(visitCountKey,  visitCount); // 1
		context.setAttribute("totalRequestServed", requestCount);

		String logoutRequest = request.getParameter("logout");
		System.out.println("SessionServlet.doGet() logoutRequest :: "+ logoutRequest);

		if("logout".equals(logoutRequest)){
			title = "Good Bye";
			System.out.println("Logging Out");
			session.invalidate();
			//			session.removeAttribute(arg0);
			//			context.removeAttribute("totalRequestServed");

			//			session.setAttribute(visitCountKey,  new Integer(0));
			visitCount = new Integer(0);
		}


		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String docType =
				"<!doctype html public \"-//w3c//dtd html 4.0 " +
						"transitional//en\">\n";
		String logout = "<form action='SessionServlet' method='POST'> " +
				"<input type='submit' name ='logout' value='logout' /> " +
				"</form>";

		out.println(docType +
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body bgcolor=\"#f0f0f0\">\n" +
				"<h1 align=\"center\">" + title + "</h1>\n" +
				"<h2 align=\"center\">Session Infomation</h2>\n" +
				"<table border=\"1\" align=\"center\">\n" +
				"<tr bgcolor=\"#949494\">\n" +
				"  <th>Session info</th><th>value</th></tr>\n" +
				"<tr>\n" +
				"  <td>id</td>\n" +
				"  <td>" + session.getId() + "</td></tr>\n" +
				"<tr>\n" +
				"  <td>Creation Time</td>\n" +
				"  <td>" + createTime + 
				"  </td></tr>\n" +
				"<tr>\n" +
				"  <td>Time of Last Access</td>\n" +
				"  <td>" + lastAccessTime + 
				"  </td></tr>\n" +
				"<tr>\n" +
				"  <td>User ID</td>\n" +
				"  <td>" + userID + 
				"  </td></tr>\n" +
				"<tr>\n" +
				"  <td>Number of visits</td>\n" +
				"  <td>" + visitCount + "</td></tr>\n" +
				"<tr>\n" +
				"  <td>Total Request Served</td>\n" +
				"  <td>" + requestCount + "</td></tr>\n" +
				"</table>\n" +
				logout+
				"</body></html>");
					}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}

