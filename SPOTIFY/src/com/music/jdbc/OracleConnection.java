package com.music.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnection {
	public static Connection getConnection() {
		Connection conn=null;
		try {Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Success");
		conn=DriverManager.getConnection(
		"jdbc:oracle:thin:@192.168.0.27:1521:xe","MUSIC", "TOWN");
		System.out.println(conn);}
		catch(Exception e){e.printStackTrace();}
		return conn;}}
