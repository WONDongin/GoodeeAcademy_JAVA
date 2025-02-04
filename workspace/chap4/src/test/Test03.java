package test;

import java.util.Iterator;
import java.util.Scanner;

/*
삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 [결과]
 삼각형의 높이
 3
 
  *
 ***
*****
*/
public class Test03 {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이: ");
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		
		for(int i = h;  i <= 5; i-- ) {
			for(int j = 1; j <= i; j++) {
				if(i <= j) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			
			}
		}
		
		
	}
}
