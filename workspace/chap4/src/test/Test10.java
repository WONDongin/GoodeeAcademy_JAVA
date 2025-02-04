package test;

import java.util.Scanner;

/*
 * 화면에서 2~9까지의 숫자를 입력받아 입력된 수의 구구단을 출력하기
 * [결과]
 * 출력 구구단 : 3
 * 3*2=6
 * 3*9=9
 * ...
 * 3*9=27 
 */
public class Test10 {
	public static void main(String[] args) {
		System.out.print("출력 구구단 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = num; i <= num; i++) {
			System.out.println("===" + num + "단 ===");
			for(int j = 2;  j <= 9; j++) {
				System.out.println(num + "*" + j + "=" + (num * j) );
			}
		}
	}
}
