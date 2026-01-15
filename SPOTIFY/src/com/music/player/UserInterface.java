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
		System.out.println("Press 1 to update your list");
		System.out.println("Press 2 to check your list");
		String menu = sc.nextLine();
		if("1".equals(menu)) {addMusic();}
		if("2".equals(menu)) {showMusic();}
		System.out.println();}}
	private void addMusic() {try{System.out.println("==============================");
	System.out.println("Please insert singername");
	String singer=sc.nextLine();
	System.out.println("Please insert title");
	String title=sc.nextLine();
	System.out.println("Please insert release company");
	String releaseCom=sc.nextLine();
	System.out.println("Please insert release date");
	String releaseDate=sc.nextLine();
	conn=mp.addMusic(conn,singer,title,releaseCom,releaseDate);
	System.out.println("Good to go?(Y/N)");
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
}
