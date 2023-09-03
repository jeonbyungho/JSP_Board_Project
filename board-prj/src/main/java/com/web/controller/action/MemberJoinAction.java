package com.web.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberJoinAction implements Action{

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("userid");
		req.getParameter("password");
		req.getParameter("name");
		req.getParameter("birthday");
		req.getParameter("gender");
		req.getParameter("email");
		req.getParameter("photo");
	}

}
