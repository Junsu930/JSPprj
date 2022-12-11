package com.newlecutre.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class calc extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		
		PrintWriter out = resp.getWriter();
		
		int x = 0;
		int y = 0;
		
		String bt = req.getParameter("button");
		
		String x_ = req.getParameter("x");
		x = Integer.parseInt(x_);
		
		String y_ = req.getParameter("y");
		y = Integer.parseInt(y_);
		
		int result = 0;
		if(bt.equals("덧셈")) {
			result = x + y;
		} else {
			result = x - y;
		}
		
		out.print("결과 : " + result);
		
		
	}

}
