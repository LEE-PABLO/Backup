package team;

import java.util.Scanner;

public class Prob_1 {

	public static void main(String[] args) {
		while(true) {Scanner sc=new Scanner(System.in);
		System.out.print("가지고 계신 농구공의 개수를 입력해 주십시오:");
		int input=sc.nextInt();
		System.out.print("상자의 크기를 지정해 주세요:");
		int boxsize=sc.nextInt();
		if(0==input%boxsize) {System.out.printf("필요한 상자의 갯수는 %d개입니다%n", (input/boxsize));} 
		else {System.out.printf("필요한 상자의 갯수는 %d개입니다%n", (input/boxsize)+1);}
	}}
}
