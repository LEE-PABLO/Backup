package java_Dungeon;

import java.util.Scanner;

public class Dungeon_Map {
	int[][] tile=new int[5][5]; 
	int x=3; int y=3;
	boolean flag=true;
	void setPosition() {
			Scanner sc = new Scanner(System.in);
			System.out.print("WASD를 이용해서 이동하세요:");
			String input=sc.next();
			if(input.equalsIgnoreCase("W")) {if(y<5) {y+=1; System.out.printf("현재 위치는 %d,%d입니다%n",x,y);} 
			else {System.out.println("벽에 부딫히셨습니다");} }
			else if(input.equalsIgnoreCase("A")) {if(x>1) {x-=1;System.out.printf("현재 위치는 %d,%d입니다%n",x,y);} 
			else {System.out.println("벽에 부딫히셨습니다");}}
			else if(input.equalsIgnoreCase("S")) {if(y>1) {y-=1; System.out.printf("현재 위치는 %d,%d입니다%n",x,y);} 
			else {System.out.println("벽에 부딫히셨습니다");}}
			else if(input.equalsIgnoreCase("D")) {if(x<5) {x+=1; System.out.printf("현재 위치는 %d,%d입니다%n",x,y);} 
			else {System.out.println("벽에 부딫히셨습니다");}}
			else {System.out.println("WASD로만 이동해 주세요");}}
	
		int[] getPosition() {int[] a={x,y}; return a;}
}			

