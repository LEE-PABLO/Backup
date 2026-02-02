package com.coupon.mvc.service;

import java.util.UUID;

public class AService {
	public static String uuid() {
		return UUID.randomUUID().toString();
	}
}
