package test;

import java.util.Scanner;

/*
 *  화면에서 두수를 입력받아서 더큰수를 출력하기 
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int f = scanner.nextInt();
		int d = scanner.nextInt();
		
		if(f > d) {
			System.out.println(f);
		} else {
			System.out.println(d);
		}
		
	}
}
