package test;

import java.util.Scanner;

/*
다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.

[결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.

*/
public class Test10 {
	public static void main(String[] args) {
		
		System.out.println("숫자만 입력하세요");
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		
		char[] arr = new char[num.length()];
		
		for(int i = 0; i < num.length(); i++) {
			if('1' < i &&  i < '9' ) {
				System.out.println("숫자");
			} else {
				System.out.println("숫자가 아닙니다.");
			}
		}
		
	}
}
