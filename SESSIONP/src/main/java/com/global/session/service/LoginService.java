package com.global.session.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.http.HttpServletRequest;

public class LoginService {
	public static boolean login(HttpServletRequest req) {
		String userId=req.getParameter("userId");
		String userPw=req.getParameter("userPw");
		if(userId.equals("Pablo")&&userPw.equals(LocalDate.now().format(DateTimeFormatter.ofPattern("MMdd")))) {
			req.getSession().setAttribute("userId", userId);
			return true;}
		else {return false;}
	}
	public static void logout(HttpServletRequest req) {
		req.getSession().invalidate();
	}
}
