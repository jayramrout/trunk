package com.tutorial.servlet.communication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculateServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
		
		/*RequestDispatcher rd1 = request.getRequestDispatcher("header.jsp");
		rd1.include(request, response);
		
		RequestDispatcher rd = request.getRequestDispatcher("AdditionServlet");
		rd.forward(request, response);
		
		RequestDispatcher rd3 = request.getRequestDispatcher("footer.html");
		rd3.include(request, response);
		*/
		int ffield = Integer.parseInt(request.getParameter("ffield"));
		request.setAttribute("newValue", new Integer(ffield+5));
		
		RequestDispatcher rd = request.getRequestDispatcher("AdditionServlet");
		rd.forward(request, response);
		
		//rd.forward(request, response);
//		request.setAttribute("name", "Jayram");
//		request.setAttribute("place", "HYD");
		
//		response.sendRedirect("AdditionServlet?ffield="+request.getParameter("ffield")+"&sfield="+request.getParameter("sfield"));
		
	}
}
