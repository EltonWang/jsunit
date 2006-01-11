package net.jsunit.interceptor;

import com.opensymphony.xwork.Action;
import com.opensymphony.xwork.ActionInvocation;
import com.opensymphony.xwork.interceptor.Interceptor;

public abstract class InterceptorSupport implements Interceptor {

	public void destroy() {
	}

	public void init() {
	}
	
	public String intercept(ActionInvocation invocation) throws Exception {
		execute(invocation.getAction());
		return invocation.invoke();
	}

	protected abstract void execute(Action targetAction);

}
