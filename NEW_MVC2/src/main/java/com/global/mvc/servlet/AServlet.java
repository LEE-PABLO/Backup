package com.global.mvc.servlet;

import java.io.IOException;

import com.global.mvc.controller.AController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/" )
public class AServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doPost(req, resp);	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri=req.getRequestURI();
		System.out.println(uri);
		if(uri.contains("/NEW_MVC2/redirect")){AController.a(req); 
		resp.sendRedirect("/NEW_MVC2/uuid");
		req.getRequestDispatcher(AController.a(req)).forward(req, resp);}
	}
}
