package chap3;

import java.util.Scanner;

/*
 	화면에서 3자리의 정수를 입력 받아서 100자리 미만을 버리고 출력하기
 	
 	[결과]
 	세자리 정수를 입력하세요
 	321
 	300
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세자리 정수를 입력하세요");
		int input = scanner.nextInt();
	
		System.out.println((input/100) * 100);
		
	}
}
