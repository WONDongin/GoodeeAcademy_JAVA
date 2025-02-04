package chap4;

import java.util.Scanner;

/*
 	if 조건문 
 	
 	if(조건식){
 		조건식의 결과 참인 경우 - 실행되는 문장
 	}
 	
 	실행되는 문장이 한개인 경우 {} 생략 할 수 있다.
 */
public class IfEx01 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score >= 60) { // 조건식의 결과 참
			System.out.println("합격을 축하합니다.");
		}
		
		if(score >= 60)
		System.out.println("합격을 축하합니다.");
		// System.out.println("자격증을 받아 가세요."); - 조건문 상관없이 실행
		
	}
}
