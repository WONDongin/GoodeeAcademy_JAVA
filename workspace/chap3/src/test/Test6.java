package test;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요.");
		int num = scanner.nextInt();
		
		double pi = 3.141592;
		
		double result1 = 2* pi * num;
		double result2 = num * num * pi;
		
		System.out.println("원의 둘레 : " + result1);
		System.out.println("원의 넓이 : " + result2);
	}
}
