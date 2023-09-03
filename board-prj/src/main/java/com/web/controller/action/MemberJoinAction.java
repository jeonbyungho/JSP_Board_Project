package com.web.controller.action;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.web.dto.MemberDTO;

public class MemberJoinAction implements Action{

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse resp) {
		
		MemberDTO member = new MemberDTO();
		member.setUserid(req.getParameter("userid"));
		member.setPassword(req.getParameter("password"));
		member.setName(req.getParameter("name"));
		member.setBirthday(req.getParameter("birthday"));
		member.setGender(req.getParameter("gender"));
		member.setEmail(req.getParameter("email"));
		
		try {
			Part photoPart = req.getPart("photo");
			
			if(photoPart.getSize() > 0) {
				InputStream ins = photoPart.getInputStream();
				ByteArrayOutputStream by = new ByteArrayOutputStream();
				
				byte[] buf = new byte[1024];
				while(ins.read(buf) != -1) by.write(buf);
				ins.close();
				
				member.setPhoto(by.toByteArray());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
		System.out.println(member.toString());
	}

}
