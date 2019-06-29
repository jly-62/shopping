package com.yc.shopping.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("uri="+arg0.getRequestURI());
		// 首页路径以及登录放行
		if ("/".equals(arg0.getRequestURI()) ||"/index".equals(arg0.getRequestURI()) || "/login".equals(arg0.getRequestURI()) || "/reg".equals(arg0.getRequestURI())) {
			return true;
		}
		// 重定向
		Object object = arg0.getSession().getAttribute("loginedUser");
		if (null == object) {
			arg1.sendRedirect("/login");
			return false;
		}
		return true;
	}
}
