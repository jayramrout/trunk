package jrout.tutorial.struts.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class InboxAction extends ActionSupport {

	private Map<String, Object> sessionMap;

	public String inbox() {
		ActionContext.getContext().get("application");
		ActionContext.getContext().get("request");
		
		Map<String, Object> sessionMap = (Map)ActionContext.getContext().get("session");
		Date date = (Date)sessionMap.get("date");
		System.out.println("InboxAction.inbox() 1" + date);

		HttpSession session = ServletActionContext.getRequest().getSession();
		
		session.setAttribute("inboxData", "Message from Jayram");
		
		date = (Date)session.getAttribute("date");
		System.out.println("InboxAction.inbox() 2" + date);
		System.out.println("InboxAction.inbox()" + session.getId());
		System.out.println("InboxAction.inbox()" + session.getLastAccessedTime());
		return SUCCESS;
	}
}