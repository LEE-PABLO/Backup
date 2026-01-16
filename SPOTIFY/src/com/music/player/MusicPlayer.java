package com.music.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MusicPlayer {
	private List<Music> musicList;
	public MusicPlayer(boolean change) {
		if(change) {musicList=new LinkedList<Music>();}
		else {musicList=new ArrayList<Music>();}}
	
	public Connection removeMusic(Connection conn,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" DELETE FROM MUSIC WHERE MUSIC_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, idx);
		pstmt.executeUpdate();
		sb= new StringBuffer();
		sb.append(" DELETE FROM MUSIC_DETAIL WHERE MUSIC_NO=? ");
		pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection updateTitle(Connection conn, String title ,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE MUSIC SET Title=?WHERE MUSIC_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, title);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection updateVocal(Connection conn, String vocal ,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE MUSIC SET VOCAL=? WHERE MUSIC_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, vocal);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection updateReleasComp(Connection conn,String releasComp,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE MUSIC_DETAIL SET RELEASE_COMP=? WHERE MUSIC_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, releasComp);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection updateReleasDate(Connection conn,String releasDate,int idx) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" UPDATE MUSIC_DETAIL SET RELEASE_DATE=? WHERE MUSIC_NO=? ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, releasDate);
		pstmt.setObject(2, idx);
		pstmt.executeUpdate();
		return conn;}
	
	public Connection addMusic(
	Connection conn, String vocal,String title, String releasComp, String releasDate) 
	throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb= new StringBuffer();
		sb.append(" INSERT INTO MUSIC (MUSIC_NO, TITLE, VOCAL) ");
		sb.append(" VALUES (SEQ_MUSIC.NEXTVAL, ?, ?) ");
		PreparedStatement pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, title);
		pstmt.setObject(2, vocal);
		pstmt.executeUpdate();

		sb= new StringBuffer();
		sb.append(" INSERT INTO MUSIC_DETAIL (MUSIC_DETAIL_NO, RELEASE_COMP, RELEASE_DATE, MUSIC_NO) ");
		sb.append(" VALUES (SEQ_MUSIC_DETAIL.NEXTVAL, ?, ?, SEQ_MUSIC.CURRVAL) ");
		pstmt =conn.prepareStatement(sb.toString());
		pstmt.setObject(1, releasComp);
		pstmt.setObject(2, releasDate);
		pstmt.executeUpdate();
		return conn;}
	
	public List<Music> getMusicList(Connection conn){
		try {Statement stmt=conn.createStatement();
		StringBuffer sb= new StringBuffer();
		sb.append(" SELECT M.MUSIC_NO ");
		sb.append("        ,M.TITLE ");
		sb.append("        ,M.VOCAL ");
		sb.append("        ,D.RELEASE_COMP ");
		sb.append("        ,TO_CHAR(D.RELEASE_DATE, 'YYYY/MM/DD') AS RELEASE_DATE ");
		sb.append(" FROM MUSIC M ");
		sb.append(" INNER JOIN MUSIC_DETAIL D ");
		sb.append(" ON M.MUSIC_NO = D.MUSIC_NO ");
		sb.append(" ORDER BY D.RELEASE_DATE DESC ");
		ResultSet rs= stmt.executeQuery(sb.toString());
		musicList.clear();
		while(rs.next()) {Music music=new Music();
		music.setMusicNo(rs.getString("MUSIC_NO"));
		music.setVocal(rs.getString("VOCAL"));
		music.setTitle(rs.getString("TITLE"));
		music.setReleaseComp(rs.getString("RELEASE_COMP"));
		music.setReleaseDate(rs.getString("RELEASE_DATE"));
		musicList.add(music);}}
		catch(Exception e) {e.printStackTrace();}
		return musicList;}
}	
	

