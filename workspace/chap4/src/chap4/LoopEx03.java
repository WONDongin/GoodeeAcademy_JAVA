package chap4;

import java.util.Scanner;

/*
 	화면에서 숫자를 999 값이 입력될때까지 여러개의 숫자를 입력 받아 합계를 구하시오. 
 */
public class LoopEx03 {
	public static void main(String[] args) {
		System.out.println("숫자를 여러개 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			int num = scanner.nextInt();
			
			if(num == 999) {
				break; // 반복문 중지
			}
			
			sum += num;
		}
		
		System.out.println("입력된 수의 합 : " + sum);
	}
}
