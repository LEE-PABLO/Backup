package intermediate;

import java.util.Arrays;

/**
 * 중급
 * -Nested loop, Array[][]
 */
public class A {
	String[] string=new String[3];
	String[] string2={"a","b","c"};
	String[] string3=new String[]{"a","b","c"};
	
		void a() {
			for(int i=2;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					System.out.printf("%dX%d=%d%n",i,j,i*j);
				}
			}
		}
		void a2() {
			for(int i=0;i<string2.length;i++) {
				System.out.println(string2[i]);
			}
		}
		void a3() {
			int count=1;
			int count2=0;
			for(int i=0;i<9;i++) {
				if(0==(i+1)%2) {count++;}
			}
			int[] s=new int[count];
			for(int a=0;a<=9;a++) {
				if(0==(a+1)%2) {
					s[count2]=a+1;
					count2++;}
				}
			System.out.println(Arrays.toString(s));
			}
		void a4() {
			int[][] a=new int[][] {
									{7,8}
									,{9,10}
									,{11,12}
									};
							
		 for(int c=0;c<a.length;c++) {
			for(int d=0;d<a[c].length;d++) {
				System.out.println(a[c][d]);
			}
		}
		}
		void a5() {
			int[] arr = {5,4,3,2,1};
			while(true) {
				for(int i=0;i<arr.length-1;i++) {
				int temp=0;
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}System.out.println(Arrays.toString(arr));
			if (arr[0]==1) break;
			}
		}
}

