package com.global.coupon;

import java.util.UUID;

import jakarta.servlet.http.HttpServletRequest;

public class Model {
	public static void coupon(HttpServletRequest req) {
		String str=String.format("쿠폰이 한장 발행 되었습니다\n 쿠폰번호는 %s입니다", UUID.randomUUID().toString());
		req.setAttribute("msg", str);
	}
}
