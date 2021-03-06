package com.zr.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zr.service.RegisterService;
import com.zr.service.impl.RegisterServiceImpl;

import net.sf.json.JSONObject;

@WebServlet(name="RegisterAction",urlPatterns="/register")
public class RegisterAction extends HttpServlet{

	private RegisterService rService = new RegisterServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = req.getParameter("uname");
		String password = req.getParameter("password");
		int result = rService.registerUser(uname, password);
		
		resp.setCharacterEncoding("utf-8");
		JSONObject json = new JSONObject();
		json.put("result",result);
		PrintWriter  pw =  resp.getWriter();
		pw.write(json.toString());
	}
}
