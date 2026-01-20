package checker;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import jdbc.OracleConnection;

public class Ui {
	private Connection conn;
	private Scanner sc;
	private Functions f;
	public Ui() {
		sc = new Scanner(System.in);
		System.out.print("ユーザーIDを入力してください: ");
		String id=sc.nextLine();
		System.out.println("==============================");
		System.out.print("パスワードを入力してください: ");
		String password=sc.nextLine();
		System.out.println("==============================");
		conn = OracleConnection.getConnection(id, password);
		sc = new Scanner(System.in);
		f= new Functions(false);}
	
	public void start() {while(true) {
		System.out.println("==============================");
		System.out.println("スタッフ管理プログラムです");
		System.out.println("1: スタッフ情報追加");
		System.out.println("2: スタッフ情報確認");
		System.out.println("3: スタッフ情報削除");
		System.out.println("4: スタッフ情報修正");
		System.out.print("タスクを選択してください: ");
		String menu = sc.nextLine();
		if("1".equals(menu)) {addEmployee();}
		if("2".equals(menu)) {showEmployeeInfo();}
		if("3".equals(menu)) {deleteEmployeeInfo();}
		if("4".equals(menu)) {updateEmployeeInfo();}
		System.out.println();}}
	
	private void addEmployee() {try{System.out.println("==============================");
	System.out.print("名前を入力してください: ");
	String name=sc.nextLine();
	System.out.println("==============================");
	System.out.print("職位を入力してください: ");
	String position=sc.nextLine();
	System.out.println("==============================");
	System.out.print("住所を入力してください: ");
	String address=sc.nextLine();
	System.out.println("==============================");
	System.out.print("生年月日を入力してください: ");
	String birthday=sc.nextLine();
	conn=f.addEmployee(conn,name,position,address,birthday);
	System.out.println("==============================");
	System.out.print("このまま進めますか？(Y/N): ");
	String answer=sc.nextLine();
	if("y".equalsIgnoreCase(answer)) {conn.commit();}
	if("n".equalsIgnoreCase(answer)) {conn.rollback();}}
	catch(Exception e) {e.printStackTrace();}
	try{conn.rollback();}catch(Exception e1) {e1.printStackTrace();}}
	
	private void showEmployeeInfo() {System.out.println("==============================");
	List<Employee> employeelist=f.getEmployeeList(conn);
	for(int i=0;i<employeelist.size();i++) {
		Employee employee=employeelist.get(i);
		System.out.printf("[%s] %s (%s %s %s)"
				,employee.getEmployeeNo()
				,employee.getName()
				,employee.getPosition()
				,employee.getAddress()
				,employee.getBirthday());
		System.out.println();}}
	
	private void deleteEmployeeInfo() {try{this.showEmployeeInfo();
	System.out.println("==============================");
	System.out.print("情報を削除したい職員の職員番号を入力してください: ");
	int answer=sc.nextInt();
	sc.nextLine();
	conn=f.removeEmployee(conn,answer);
	System.out.println("==============================");
	System.out.print("このまま進めますか？(Y/N): ");
	String answer1=sc.nextLine();
	if("y".equalsIgnoreCase(answer1)) {conn.commit();}
	if("n".equalsIgnoreCase(answer1)) {conn.rollback();}}
	catch(Exception e) {e.printStackTrace();}
	try{conn.rollback();}catch(Exception e1) {e1.printStackTrace();}}
	
	private void updateEmployeeInfo() {try{this.showEmployeeInfo();
	System.out.println("==============================");
	System.out.print("情報を更新したい職員の職員番号を入力してください: ");
	int answer=sc.nextInt();
	sc.nextLine();
	while(true){
		System.out.println("==============================");
		System.out.print("1: 名前修正\n2: 職位情報更新\n3: 住所情報更新\n4: 生年月日修正\n5: Exit \n");
		System.out.print("タスクを選択してください: ");
		int answer1=sc.nextInt();
		sc.nextLine();
		System.out.println("==============================");
		if(1==answer1) {
		System.out.print("修正された名前を入力してください: ");
		String name=sc.nextLine();
		conn=f.updateName(conn,name,answer);}
	else if(2==answer1) {
		System.out.print("修正された職位を入力してください: ");
		String position=sc.nextLine();
		conn=f.updatePosition(conn,position,answer);}
	else if(3==answer1) {
		System.out.print("修正された住所を入力してください: ");
		String address=sc.nextLine();
		conn=f.updateAddress(conn,address,answer);}
	else if(4==answer1) {
		System.out.print("修正された生年月日を入力してください: ");
		String birthday=sc.nextLine();
		conn=f.updateBirthday(conn,birthday,answer);}
	else if(5==answer1) { break;}
	else {System.out.println("1から5の間から選んでください");}}
	System.out.println("==============================");
	System.out.print("このまま進めますか？(Y/N): ");
	String answer2=sc.nextLine();
	if("y".equalsIgnoreCase(answer2)) {conn.commit();}
	if("n".equalsIgnoreCase(answer2)) {conn.rollback();}}
	catch(Exception e) {e.printStackTrace();}
	try{conn.rollback();}catch(Exception e1) {e1.printStackTrace();}}
}
