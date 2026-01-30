package com.global.coupon;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

public class CouponModel {
	public static String getCoupon() throws UnknownHostException {
		InetAddress localaddress=InetAddress.getLocalHost();
		String ip=localaddress.getHostAddress();
		return UUID.randomUUID().toString()+"-"+ip;
	}
}
