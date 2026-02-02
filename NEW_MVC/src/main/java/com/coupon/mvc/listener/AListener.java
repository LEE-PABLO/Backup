package com.coupon.mvc.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AListener implements ServletContextListener{
@Override
public void contextInitialized(ServletContextEvent sce) {
	System.out.println(this);
	ServletContextListener.super.contextInitialized(sce);
	}
}
