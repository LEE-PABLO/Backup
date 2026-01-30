package com.global.backend;

import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;

public class Model {
	public static void coupon(HttpServletRequest req) {
		String st=String.format("쿠폰이 발급 되었습니다(%s)", UUID.randomUUID().toString());
		req.setAttribute("msg", st);
	}
}
