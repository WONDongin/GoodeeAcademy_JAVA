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
		Scanner scanner = new Scanner(System.in);

	    // 입력 받기
	    System.out.print("숫자만 입력하세요: ");
	    String value = scanner.nextLine();

	    // 숫자 여부 확인
	    boolean isNumeric = true;
	    for (int i = 0; i < value.length(); i++) {
	    	if (!Character.isDigit(value.charAt(i))) {
	    		isNumeric = false;
	        	break;
	        }
	    }

	    // 결과 출력
	    if (isNumeric) {
	    	System.out.println(value + "는 숫자 입니다.");
	    } else {
	         System.out.println(value + "는 숫자가 아닙니다.");
	    }

	    scanner.close();
	}
}
