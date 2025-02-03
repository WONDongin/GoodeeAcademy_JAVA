package test;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 */
public class Test1 {
	public static void main(String[] args) {
		
		System.out.println("금액을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		
		System.out.println("500원: " + (sum / 500) + "개");
		System.out.println("100원: " + (sum % 500) / 100 + "개");
		System.out.println("50원: " + (sum % 100) / 50 + "개");
		System.out.println("10원: " + (sum % 50) / 10 + "개");
		System.out.println("1원: " + (sum % 10) / 1 + "개");
	}
}
