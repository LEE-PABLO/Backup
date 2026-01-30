package com.global.mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Model {
	public static void hello(HttpServletRequest req) {String query=req.getParameter("query");
		String msg= String.format("입력하신 글자는 %s입니다", query);
		req.setAttribute("msg", msg);}
}
