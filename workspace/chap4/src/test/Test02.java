package test;

import java.util.Scanner;

/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
     소문자 = 대문자 + 32
     대문자 = 소문자 - 32
     
     '0'  : 48
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
*/
public class Test02 {
	public static void main(String[] args) {
		System.out.print("한개의 문자를 입력하세요:  ");
		
		Scanner scanner = new Scanner(System.in);
		char  num =  scanner.next().charAt(0);
		
		if('A' <= num && num <= 'Z') {
			System.out.println("대문자");
			System.out.println("소문자: " + (char) (num + 32));
		}else if ('a' <= num && num <= 'z') {
			System.out.println("소문자");
			System.out.println("대문자: " + (char) (num - 32));
		}else if ('0' <= num && num <= '9') { // '0' 코드 값 + 20 값 출력
			System.out.println((num - '0') + 20); // (초 - '0') : 숫자 데이터 변경
		} else {
			System.out.println("기타문자");
		}
	}
}
