package com.tutorial.servlet.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter(filterName = "LogFilter", urlPatterns = { "/*" }, initParams = { @WebInitParam(name = "connectionName", value = "oracle.jdbc.driver.OracleDriver") })
public class LogFilter implements Filter {
	private static Logger log = Logger.getLogger(LogFilter.class);
	private ServletContext context;

	/**
	 * Default constructor.
	 */
	public LogFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String ipAddress = request.getRemoteAddr();
		log.info("IP " + ipAddress + ", Time " + new Date().toString());
//		request.setAttribute("fname", request.getParameter("fname") + "Shree");
		this.context.log("IP " + ipAddress + ", Time " + new Date().toString());
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		String testParam = fConfig.getInitParameter("connectionName");
		log.info("Test Param in LogFilter........: " + testParam);
		this.context = fConfig.getServletContext();
		this.context.log("RequestLoggingFilter initialized");
		
	}
}
