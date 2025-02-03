package chap3;

import java.util.Scanner;

/*
 	조건 연산자(삼항 연산자) : 조건 문으로 변경이 가능
 	(조건문) ? 참 : 거짓
 	
 	조건문 : 결과가 boolean인 문장
 */

public class OpEx6 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		System.out.println(score + "점: " + ((score >= 60) ? "합격" : "불합격"));
		
		// 70점은 합격, 60점대 : 재시험, 60점미만 : 불합격
		String result = (score >= 70) ? "합격" : (score >= 60) ? "재시험" : "불합격";
		System.out.println(score + "점: " + result);
		System.out.println(score + "점: " + ((score >= 70) ? "합격" : (score >= 60) ? "재시험" : "불합격"));
	
	}
}
