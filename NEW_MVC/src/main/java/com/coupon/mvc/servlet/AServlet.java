package com.coupon.mvc.servlet;

import java.io.IOException;

import com.coupon.mvc.controller.AController;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri=req.getRequestURI();
		System.out.println(uri);
		if(uri.contains("/NEW_MVC/a/uuid")) {AController.a(req);
		req.getRequestDispatcher(AController.a(req)).forward(req, resp);}
	}
}
