package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleConnection {
	public static Connection getConnection(String id, String password) {
		Connection conn=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.0.27:1521:xe",id, password);
		System.out.println(conn);
		System.out.println("Success");}
		catch(SQLException e){e.printStackTrace();
		int errorcode=e.getErrorCode();
		if (errorcode==1017) {System.out.println("invalid username/password");}
		if (errorcode==28000) {System.out.println("the account is locked");}
		if (errorcode==17002) {System.out.println("IO Exception");}
		else{e.printStackTrace();}}
		catch(ClassNotFoundException e) {System.out.println("Failed to load driver");}
		return conn;}}

