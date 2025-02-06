package test;

import java.util.Scanner;
/*
10진수를 2,8,10,16 진수로 변경하기
[결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10
*/
public class Test11 {
	public static void main(String[] args) {
		System.out.println("1~100 사이의 숫자를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(num +"의 2진수 : " +  Integer.toBinaryString(num)); 
		System.out.println(num +"의 8진수 : " +  Integer.toOctalString(num)); 
		System.out.println(num +"의 10진수 : " +  Integer.toString(num)); 
		System.out.println(num +"의 16진수 : " +  Integer.toHexString(num)); 
		
		
		
		/*
		int[] digit = {2,8,10,16};
		char[] numarr = "0123456789ABCDEF".toCharArray();
		char[] arr;
		
		System.out.println("10진수 값을 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int divnum = num, index=0;
		for (int d : digit) {  // 진수 변하기
			divnum = num;
			index = 0;
			arr = new char[32]; 
			while (divnum > 0) {
				arr[index++] = numarr[divnum % d];
				divnum /= d; 
			}
			
			System.out.print(num + "의 " + d + "진수 :"); 
			
			for(int i=index-1;i>=0;i--)
				 System.out.print(arr[i]);
			System.out.println();
		}
		 */
	}
}
