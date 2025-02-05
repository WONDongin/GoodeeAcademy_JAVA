package test;

import java.util.Scanner;

/*
 *  농장에 강아지,병아리가 있음.
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  20
 *  강아지 병아리 전체 다리수를 입력하세요
 *  30
 *  
 *  강아지 : xx마리
 *  병아리 : yy마리
 *  
 *  x + y = 전체 마리수
 *  4x + 2y = 전체 다리수
 *  방정식
 *  
 *  
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  10
 *  강아지 병아리 전체 다리수를 입력하세요
 *  10
 *   
 *  계산안됨 
 */
public class Test01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("강아지 병아리 마리수를 입력하세요"); 
		int num1 = scanner.nextInt();
		
		System.out.println("강아지 병아리 전체 다리수를 입력하세요");
		int num2 = scanner.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if((2*i) + (4*j) == 10  ) {
					System.out.println("x=" + i + ", y=" + j );
				}
			}
		}
			
		
	}
}
