package com.global.controller;

import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;

public class Model {
	
	public static void coupongen(HttpServletRequest req) {
		UUID uuid=UUID.randomUUID();
		String msg=String.format("쿠폰이 한장 발급 되었습니다\n 쿠폰은 %s 입니다", uuid.toString());
		req.setAttribute("msg", msg);
	}
}
