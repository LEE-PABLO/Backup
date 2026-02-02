package com.coupon.mvc.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
@WebFilter
public class AFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String ip= request.getRemoteAddr();
		System.out.println(ip);
		chain.doFilter(request, response);
		if("192.168.0.7".equals(ip)) {
		PrintWriter pw=response.getWriter();
		pw.print("<h1>GoodBye Jungun~</h1>");
		pw.close();}
		else {
		PrintWriter pw=response.getWriter();
		pw.print("<h1>Go Home~</h1>");
		pw.close();}
	}

}
