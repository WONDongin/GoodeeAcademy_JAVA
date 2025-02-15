package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
화면에서 1~10사이의 숫자를 입력받아, 숫자만큼 * 출력하기
입력값이 숫자 아닌경우 InputMismatchException 예외가 발생함.
예외 발생시 숫자만 입력하세요. 메세지 출력하기. 다시 숫자입력받기
catch scan.next(); 추가

1 ~ 10사이의 숫자가 아닌 경우 NumberInputException 클래스의 예외를 강제 발생하고
다시 숫자를 입력받기
*/
class NumberInputException extends RuntimeException{
	 NumberInputException(String msg) {
		 super(msg);
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~10 사이의 숫자 입력: ");
		
		while(true) {
			try {
				int num = scan.nextInt();
				if(num < 1 || num > 10) {
					throw	new NumberInputException("1에서 10사이의 숫자만 입력하세요");
				}
				
				System.out.print(num + ": ");
					
				for(int i = 0; i < num; i++) {
					System.out.print("*");
				}
				System.out.println();
				 break;
				 
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				 scan.next();
			} catch (NumberInputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
