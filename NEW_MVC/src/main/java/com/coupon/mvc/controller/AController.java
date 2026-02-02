package com.coupon.mvc.controller;

import com.coupon.mvc.service.AService;

import jakarta.servlet.http.HttpServletRequest;

public class AController {
	public static String a(HttpServletRequest req) {
		req.setAttribute("uuid", AService.uuid());
		return "/WEB-INF/views/a.jsp";
	}
}
