package com.tutorial.struts.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AutherizationInterceptor implements Interceptor{

	public void destroy() {}

	public void init() {}

	public String intercept(ActionInvocation invokation) throws Exception {
		ActionContext context=invokation.getInvocationContext();
		Map session=context.getSession();
		String user=(String)session.get("user");
		if(user==null)
			return "invalidSession";
		else
			return invokation.invoke();
	}
}
