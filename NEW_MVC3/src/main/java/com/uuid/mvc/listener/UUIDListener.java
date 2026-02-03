package com.uuid.mvc.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;
@WebListener(value = "/")
public class UUIDListener implements ServletRequestListener{
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest req=(HttpServletRequest)sre.getServletRequest();
		String ip=req.getRemoteAddr();
		System.out.println(ip);
	}
}
