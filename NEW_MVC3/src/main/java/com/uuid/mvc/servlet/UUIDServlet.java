package com.uuid.mvc.servlet;

import java.io.IOException;

import com.uuid.mvc.controller.UUIDController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/")
public class UUIDServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	this.doPost(req, resp);}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri=req.getRequestURI();
		String view=UUIDController.uuid(req);
		if("/NEW_MVC3/uuid".equals(uri)) {req.getRequestDispatcher(view).forward(req, resp);}
	}
}
