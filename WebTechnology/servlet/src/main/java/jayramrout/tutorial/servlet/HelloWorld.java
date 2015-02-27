package jayramrout.tutorial.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @author Jayram
 *
 */
@WebServlet(name="HelloWorld" ,description = "My Hello World", urlPatterns = { "/helloWorld" })
public class HelloWorld extends HttpServlet {
	private static Logger logger = Logger.getLogger(HelloWorld.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Inside Service Method of HelloWorld");
	}
}