package chap4;

import java.util.Scanner;

/*
 	화면에서 한개의 문자를 입력 받아서 대문자, 소문자, 숫자, 기타 문자인지 출력하기
 	[결과]
 	한개의 문자를 입력 : A
 	대문자
 	
 	대문자 조건 : 'A' <= x <= 'z';
 	소문자 조건 : 'a; <= x <= 'z';
 	숫자 조건 : '0' <= x <= '9';
 	그 외 기타문자
 	
 	문자열 입력 함수 : next()
 	문자열에서 첫번째 문자 추출 : charAt(0)
 	Scanner 생각숫자 맞추기, 별그리기, 피라미드
 */
public class Exam02 {
	public static void main(String[] args) {
		System.out.print("한개의 문자 입력 : ");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0); // 입력된 문자의 첫번째 문자
		
		if('A' <= ch && ch <= 'Z' ) {
			System.out.println("대문자");
			System.out.println("소문자: " + (char) (ch + 32));
		} else if ('a' <= ch && ch <= 'z') {
			System.out.println("소문자");
			System.out.println("대문자: " + (char) (ch - 32));
		} else if ('0' <= ch && ch <= '9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
		
		System.out.println("A: " + (int) 'A');
		System.out.println("B: " + ( 'A' + 1));
		System.out.println("Z: " + (int) 'Z');
		System.out.println("Z: " + ( 'A' + 25));
	}
}
