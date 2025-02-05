package chap5;

import java.util.Scanner;

/*
 	10진수 입력 받아서 8진수 변경
 */
public class Exam02 {
	public static void main(String[] args) {
		int[] octal = new int[10];
		
		System.out.println("8진수로 변환활 10진수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int divnum = num;
		int index = 0;
		
		while(divnum > 0) {
			octal[index++] = divnum%8; // 값을 집어넣고 index 값 추가
			divnum /= 8;
		}
		
		System.out.print(num + "의 8진수 : ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
		
		System.out.println();
		System.out.println(Integer.toOctalString(num)); // 8진수 변환
	}
}
