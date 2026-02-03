package com.uuid.mvc.controller;

import com.uuid.mvc.service.UUIDService;

import jakarta.servlet.http.HttpServletRequest;

public class UUIDController {
	public static String uuid(HttpServletRequest req) {
		String uuid=UUIDService.uuid();
		req.setAttribute("uuid", uuid);
		return "/WEB-INF/views/a.jsp";
	}
}
