package com.shiro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;

public class LoginServlet extends HttpServlet {
	public static String LOGIN_TYPE="login-in";

	private static final long serialVersionUID = 6164825538857134973L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		
		String username = request.getParameter("username");
		
		String password = request.getParameter("password");
		
		Subject subject = SecurityUtils.getSubject();
		
		AuthenticationToken token = new UsernamePasswordToken(username, password);
		
		try {
			subject.login(token);
			response.sendRedirect("success");
		} catch (AuthenticationException e) {
			if(StringUtils.hasText(type)&&LOGIN_TYPE.equals(type)){
				request.setAttribute("error", "用户名或密码错误！");
			}
			request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
//			e.printStackTrace();
		}
		
	}
}
