package jrout.tutorial.struts.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogInOutAction extends ActionSupport implements SessionAware, ServletRequestAware {
	
	private Map<String, Object> sessionMap;
	private String userName;
	private String password;

	public String login() {
		String loggedUserName = null;
		System.out.println("LogInOutAction.login() 1 ");
		if (sessionMap.containsKey("userName")) {
			loggedUserName = (String) sessionMap.get("userName");
		}
		if (loggedUserName != null && loggedUserName.equals("admin")) {
			return SUCCESS;	// return welcome page
		}
		
		// if no userName stored in the session, 
		// check the entered userName and password
		if (userName != null && userName.equals("jayram") 
				&& password != null && password.equals("jayram")) {
			
			// add userName to the session
			sessionMap.put("userName", userName);
			
			return SUCCESS;	// return welcome page
		}
		
		// in other cases, return login page
		return INPUT;
	}
	
	public String logout() {
		System.out.println("LogInOutAction.logout() 3");
		// remove userName from the session
		if (sessionMap.containsKey("userName")) {
			sessionMap.remove("userName");
		}
		// Ways to invalidate the session
		/*
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.invalidate();
		*/
		if (sessionMap instanceof org.apache.struts2.dispatcher.SessionMap) {
		    try {
		        ((org.apache.struts2.dispatcher.SessionMap) sessionMap).invalidate();
		    } catch (IllegalStateException e) {
		       System.err.println(e.getMessage());
		    }
		}
		
		return SUCCESS;
	}

	/**
	 * NOTE
	 * Implementing SessionAware and overriding setSession method is a recommended approach
	 * Instead of Implementing ServletRequestAware::setServletRequest.
	 */
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		System.out.println("LogInOutAction.setSession() 2");
		this.sessionMap = sessionMap;
	}
	/**
	 * NOTE
	 * This approach is not recommended because it makes the action class ties to the servlet API 
	 * and difficult for unit testing.
	 */
	@Override
	public void setServletRequest(HttpServletRequest request) {
		System.out.println("LogInOutAction.setServletRequest()");
		HttpSession session = request.getSession();
		session.setAttribute("date", new Date());
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}