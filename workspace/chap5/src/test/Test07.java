package test;

import java.util.Scanner;
/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
*/
public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삼각형의 높이를 입력하세요");
		int h = scan.nextInt();
		
		for(int i = h; i >= 1; i--) {
			
			for(int j = 0; j < h - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
}
