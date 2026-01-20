package com.music.player;

import java.sql.Connection;

import java.util.List;
import java.util.Scanner;

import com.music.jdbc.OracleConnection;

public class UserInterface {
	private Connection conn;
	private Scanner sc;
	private MusicPlayer mp;
	
	public UserInterface() {
		conn = OracleConnection.getConnection();
		sc = new Scanner(System.in);
		mp= new MusicPlayer(false);}
	public void start() {while(true) {
		System.out.println("==============================");
		System.out.println("Welcome to Spotify");
		System.out.println("1: Add song to your list");
		System.out.println("2: Check your list");
		System.out.println("3: Delete music from your list");
		System.out.println("4: Update song infomation on your list");
		System.out.print("Choice: ");
		String menu = sc.nextLine();
		if("1".equals(menu)) {addMusic();}
		if("2".equals(menu)) {showMusic();}
		if("3".equals(menu)) {deleteMusic();}
		if("4".equals(menu)) {updateMusic();}
		System.out.println();}}
	
	private void addMusic() {try{System.out.println("==============================");
	System.out.print("Insert Artist: ");
	String singer=sc.nextLine();
	System.out.println("==============================");
	System.out.print("Insert title: ");
	String title=sc.nextLine();
	System.out.println("==============================");
	System.out.print("Insert release company: ");
	String releaseCom=sc.nextLine();
	System.out.println("==============================");
	System.out.print("Insert release date: ");
	String releaseDate=sc.nextLine();
	conn=mp.addMusic(conn,singer,title,releaseCom,releaseDate);
	System.out.println("==============================");
	System.out.print("Good to go?(Y/N): ");
	String answer=sc.nextLine();
	if("y".equalsIgnoreCase(answer)) {conn.commit();}
	if("n".equalsIgnoreCase(answer)) {conn.rollback();}}
	catch(Exception e) {e.printStackTrace();}
	try{conn.rollback();}catch(Exception e1) {e1.printStackTrace();}}
	
	private void showMusic() {System.out.println("==============================");
	List<Music> musiclist=mp.getMusicList(conn);
	for(int i=0;i<musiclist.size();i++) {
		Music music=musiclist.get(i);
		System.out.printf("[%s] %s (%s %s %s)"
				,music.getMusicNo()
				,music.getTitle()
				,music.getVocal()
				,music.getReleaseComp()
				,music.getReleaseDate());
		System.out.println();}}
	
	private void deleteMusic() {try{this.showMusic();
	System.out.println("==============================");
	System.out.print("Insert the music number you want to delete: ");
	int answer=sc.nextInt();
	sc.nextLine();
	conn=mp.removeMusic(conn,answer);
	System.out.println("==============================");
	System.out.print("Good to go?(Y/N): ");
	String answer1=sc.nextLine();
	if("y".equalsIgnoreCase(answer1)) {conn.commit();}
	if("n".equalsIgnoreCase(answer1)) {conn.rollback();}}
	catch(Exception e) {e.printStackTrace();}
	try{conn.rollback();}catch(Exception e1) {e1.printStackTrace();}}
	
	private void updateMusic() {try{this.showMusic();
	System.out.println("==============================");
	System.out.print("Insert the music number you want to update: ");
	int answer=sc.nextInt();
	sc.nextLine();
	while(true){
		System.out.println("==============================");
		System.out.print("1: Update Title\n2: Update Artist Name\n3: Update Company Name\n4: Update Release Date\n5: Quit Update\n");
		System.out.print("Choice: ");
		int answer1=sc.nextInt();
		sc.nextLine();
		System.out.println("==============================");
		if(1==answer1) {
		System.out.print("Insert new Title: ");
		String title=sc.nextLine();
		conn=mp.updateTitle(conn,title,answer);}
	else if(2==answer1) {
		System.out.print("Insert new Artist name: ");
		String vocal=sc.nextLine();
		conn=mp.updateVocal(conn,vocal,answer);}
	else if(3==answer1) {
		System.out.print("Insert new Company name: ");
		String comp=sc.nextLine();
		conn=mp.updateReleasComp(conn,comp,answer);}
	else if(4==answer1) {
		System.out.print("Insert new Release Date: ");
		String date=sc.nextLine();
		conn=mp.updateReleasDate(conn,date,answer);}
	else if(5==answer1) { break;}
	else {System.out.println("Choose between 1 to 5!;");}}
	System.out.println("==============================");
	System.out.print("Good to go?(Y/N): ");
	String answer2=sc.nextLine();
	if("y".equalsIgnoreCase(answer2)) {conn.commit();}
	if("n".equalsIgnoreCase(answer2)) {conn.rollback();}}
	catch(Exception e) {e.printStackTrace();}
	try{conn.rollback();}catch(Exception e1) {e1.printStackTrace();}}
}
	


