package chap3;

import java.util.Scanner;

/*
 	숫자를 입력 받아서 양수인 경우 "양수", 음수인 경우 "음수", 0인 경우 "0" 출력
 	짝수인지, 홀수인지 출력하기
 	[결과]
 	숫자를 입력하세여
 	10
 	10 : 양수
 	
 */
public class Exam3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		if(num > 0) {
			System.out.println(num + " : 양수");
		} else if (num < 0) {
			System.out.println(num + " : 음수");
		} else {
			System.out.println("0");
		} 
		
		System.out.println(num + ((num % 2== 0) ? " : 짝수" : " : 홀수"));
			
	}
}
