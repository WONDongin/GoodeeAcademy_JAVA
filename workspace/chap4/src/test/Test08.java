package test;

import java.util.Scanner;

/*
사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.
만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.

[결과]
한개의 숫자 입력 : 5
1, 2, 3, 4, 5

*/
public class Test08 {
	public static void main(String[] args) {
		System.out.print("한개의 숫자 입력: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		}  else {
			for(int i = 1; i <= num; i++) {
				if(num <= i) {
					System.out.print(i + "");
				} else {
					System.out.print(i + ",");
				}
			} 
		}
		
	}
}
