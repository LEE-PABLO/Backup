package checker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Functions {
	private List<Employee> employeeList;
	public Functions(boolean change) {
		if(change) {employeeList=new LinkedList<Employee>();}
		else {employeeList=new ArrayList<Employee>();}
	}
	public Connection addEmployee(
	Connection conn, String name, String position, String address, String birthday) 
	throws Exception{conn.setAutoCommit(false); StringBuffer sb= new StringBuffer();
	sb.append(" INSERT INTO EMPLOYEE (EMPLOYEE_NO, NAME, POSITION) "); 
	sb.append(" VALUES (SEQ_EMPLOYEE.NEXTVAL, ?, ?) ");
	PreparedStatement pstmt =conn.prepareStatement(sb.toString());
	pstmt.setObject(1, name);
	pstmt.setObject(2, position);
	pstmt.executeUpdate();
	sb= new StringBuffer();
	sb.append(" INSERT INTO EMPLOYEE_DETAIL (EMPLOYEE_DETAIL_NO, ADDRESS, BIRTHDAY, EMPLOYEE_NO) "); 
	sb.append(" VALUES (SEQ_EMPLOYEE_DETAIL.NEXTVAL, ?, ?, SEQ_EMPLOYEE.CURRVAL) ");
	pstmt =conn.prepareStatement(sb.toString());
	pstmt.setObject(1, address);
	pstmt.setObject(2, birthday);
	pstmt.executeUpdate();
	return conn;}
	
	public List<Employee> getEmployeeList(Connection conn){
		try {Statement stmt=conn.createStatement();
		StringBuffer sb= new StringBuffer();
		sb.append(" SELECT E.EMPLOYEE_NO ");
		sb.append("        ,E.NAME ");
		sb.append("        ,E.POSITION ");
		sb.append("        ,D.ADDRESS ");
		sb.append("        ,TO_CHAR(D.BIRTHDAY, 'YYYY/MM/DD') AS BIRTHDAY ");
		sb.append(" FROM EMPLOYEE E");
		sb.append(" INNER JOIN EMPLOYEE_DETAIL D ");
		sb.append(" ON E.EMPLOYEE_NO = D.EMPLOYEE_NO ");
		sb.append(" ORDER BY D.EMPLOYEE_NO ASC ");
		ResultSet rs= stmt.executeQuery(sb.toString());
		employeeList.clear();
		while(rs.next()) {Employee employee=new Employee();
		employee.setEmployeeNo(rs.getString("EMPLOYEE_NO"));
		employee.setName(rs.getString("NAME"));
		employee.setPosition(rs.getString("POSITION"));
		employee.setAddress(rs.getString("ADDRESS"));
		employee.setBirthday(rs.getString("BIRTHDAY"));
		employeeList.add(employee);}}
		catch(Exception e) {e.printStackTrace();}
		return employeeList;}
	
	public Connection removeEmployee(Connection conn,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" DELETE FROM EMPLOYEE WHERE EMPLOYEE_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, idx);
		pstmt.executeUpdate();
		sb= new StringBuffer();
		sb.append(" DELETE FROM EMPLOYEE_DETAIL WHERE EMPLOYEE_NO=? ");
		pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, idx);
		pstmt.executeUpdate();
		return conn;}
		
	public Connection updateName(Connection conn, String name ,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE EMPLOYEE SET NAME=?WHERE EMPLOYEE_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, name);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection updatePosition(Connection conn, String position ,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE EMPLOYEE SET POSITION=? WHERE EMPLOYEE_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, position);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection updateAddress(Connection conn,String address,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE EMPLOYEE_DETAIL SET ADDRESS=? WHERE EMPLOYEE_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, address);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection updateBirthday(Connection conn,String birthday,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE EMPLOYEE_DETAIL SET BIRTHDAY=? WHERE EMPLOYEE_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, birthday);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
}
