package com.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.controller.action.Action;
import com.web.controller.action.MemberJoinAction;

@WebServlet("/member/*")
public class MemberFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Action memberJoinAc;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.memberJoinAc = new MemberJoinAction();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.print("Context : "+ req.getContextPath());
		System.out.print(", Servlet : " + req.getServletPath());
		System.out.print(", Info : " + req.getPathInfo());
		System.out.println(", Query : " + req.getQueryString());
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pathInfo = req.getPathInfo();
		RequestDispatcher rd = null;
		
		switch (pathInfo) {
		case "/login":
			rd = req.getRequestDispatcher("../member-page/login.jsp");
			break;
		case "/join":
			rd = req.getRequestDispatcher("../member-page/join.jsp");
			break;
		}
		
		if(rd != null) {
			System.out.println("forward!");
			rd.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pathInfo = req.getPathInfo();
		switch (pathInfo) {
		case "/login":
			
			break;
		case "/join":
			memberJoinAc.excute(req, resp);
			break;
		}
		
	}
}
