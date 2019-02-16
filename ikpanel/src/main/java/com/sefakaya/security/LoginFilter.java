package com.sefakaya.security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sefakaya.entity.HRManager;
//component springe devret.
@Component
@Scope("session")
public class LoginFilter implements Filter {

	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest req= (HttpServletRequest) request;
		HttpServletResponse res=  (HttpServletResponse) response;
		HRManager hrmanager= (HRManager) req.getSession().getAttribute("HRManager");
		
		if(req.getRequestURI().contains("login")) {
			chain.doFilter(request, response);
			return;
			
		}
		
		if(hrmanager!=null) {
			chain.doFilter(request, response);
			return;
		}else {
			
			res.sendRedirect("http://localhost:8080/ikpanel/login");
		}
		
	
	}


	public void init(FilterConfig fConfig) throws ServletException {

		
	}

}
