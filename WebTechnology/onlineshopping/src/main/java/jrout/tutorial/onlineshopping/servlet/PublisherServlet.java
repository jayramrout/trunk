package jrout.tutorial.onlineshopping.servlet;

import jrout.tutorial.onlineshopping.service.BooksService;
import jrout.tutorial.onlineshopping.service.BooksServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Jayram on 8/16/2015.
 */
@WebServlet(name = "PublisherServlet", urlPatterns = { "/tpublish" })
public class PublisherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BooksService booksService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String alph = request.getParameter("selectpub");
        booksService = new BooksServiceImpl();
        PrintWriter pw = response.getWriter();

        pw.println("<pre><b><font size=6>" + "\t\t\t" + "<u>" + " LIST OF BEST SELLERS" + "</pre></u></b></font>");
        pw.println("<form action=\"addcart\" method=post>");
        pw.println("<br><font size=4><b>");
        pw.println("<pre>" + "TITLE\t\t\t\tAUTHOR\t\t\t\tPUBLISHER NAME\t\t\t SUBJECT\t\t\tRATE" + "</pre></font></b>");



        pw.println("<pre>               Selected items</pre>");
        pw.println("<pre><label>		Item name:        </label><input type=text name=txtinm></pre>");
        pw.println("<pre><label>		Item Quantity:   </label><input type=text name=txtq></pre>");
        pw.println("<pre><label>		Item type:        </label><input type=text name=txtr></pre>");
        pw.println("<font size=3><br><br><input type=submit value=Add_to_Cart></font></form>");
        pw.println("<pre><label> 		Please enter H/h for Hardware  S/s for Software M/m for Music   B/b for Books</pre></label>");
        pw.println("<font size=3><br><br><input type=submit value=Add_to_Cart></font></form>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
