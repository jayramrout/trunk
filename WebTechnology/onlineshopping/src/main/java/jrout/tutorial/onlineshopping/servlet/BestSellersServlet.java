package jrout.tutorial.onlineshopping.servlet;

import jrout.tutorial.onlineshopping.service.BooksService;
import jrout.tutorial.onlineshopping.service.BooksServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BestSellersServlet
 */
@WebServlet(name = "BestSellersServlet", description = "Best Sellers", urlPatterns = { "/bestSellers" })
public class BestSellersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BooksService booksService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BestSellersServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		booksService = new BooksServiceImpl();
		List<String> publishers = booksService.getPublishers();
		PrintWriter pw=response.getWriter();
		pw.println("<br>");
		pw.println("<form action=tpublish method=get>");
		pw.println("<pre><font size=5>"+"\t\t"+"<u><b>LIST OF BEST SELLERRS"+"</U></FONT></pre></b>");
		pw.println("<pre><select name=selectpub size=5>");
		for(String publisher : publishers) {
			pw.println("<option>"+publisher+"</option><br>");
		}
		pw.println("</select></pre>");
		pw.println("<input type=submit value=Display_publications>");
		pw.println("</form></font>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
