package chap4;

import java.util.Scanner;

/*
 	숫자를 입력 받아서
 	1. 양수, 음수, 영 출력
 	2. 짝수, 홀수 출력하기
 	
 	if 조건문으로 구현하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("영");
		}
		
		// 조건 연산자
		// System.out.println((num > 0) ? "양수" : (num < 0) ? "음수" : "영");
		
		if(num  % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 조건 연산자
		// System.out.println((num % 2 == 0) ? "짝수" : "영");
	}
}
