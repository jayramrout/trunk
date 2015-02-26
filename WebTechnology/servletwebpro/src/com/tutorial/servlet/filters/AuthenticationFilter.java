package com.tutorial.servlet.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter(filterName="AuthenticationFilter" , urlPatterns={"/*"},initParams={
		@WebInitParam(name="dbName",value="Oracle")
		})
public class AuthenticationFilter implements Filter {
	private static Logger log = Logger.getLogger(AuthenticationFilter.class);

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		log.info("Destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String ipAddress = request.getRemoteAddr();
		
		log.info("IP "+ ipAddress + ", Time " + new Date().toString());
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String uri = req.getRequestURI();
		log.info("URI Name ="+ uri);
		String firstName = req.getParameter("fname");
		
		if(firstName!= null && firstName.equals("danger")){
			res.sendRedirect("danger.html");
		}else {
			chain.doFilter(request, response);
		}
		/*if(!(uri.endsWith("html") || uri.endsWith("LoginServlet"))){
			res.sendRedirect("login.html");
		}else{
			chain.doFilter(request, response);
		}*/
//		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		String testParam = fConfig.getInitParameter("dbName"); 
		log.info("Test Param in AutFilter.......: " + testParam); 
	}

}
