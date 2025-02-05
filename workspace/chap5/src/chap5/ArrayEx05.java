package chap5;

import java.util.Scanner;

/*
 	10진수16진수 변경
 	0 ~ 9 10 11 12 13 14 15
 	          A  B C  D  E   F
 */
public class ArrayEx05 {
	public static void main(String[] args) {
		// String 문자열 > char 형  data 배열에 넣기(toCharArray)
		char[] data = "0123456789ABCDEF".toCharArray(); 
		char[] hex = new char[8];
		System.out.println("16진수로 변환할 10진수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		
		while(true) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;
			if(divnum == 0) {break;}
		}
		
		System.out.print(num + "의 16진수 : ");
		for(int i = index - 1; i >= 0; i--) {System.out.println(hex[i]);}
		System.out.println();
	}
}
