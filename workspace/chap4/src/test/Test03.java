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
*****  바닦의 * 갯수 : h * 2 - 1
*/
public class Test03 {
	public static void main(String[] args) {
System.out.print("삼각형의 높이: ");
		
		Scanner scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		
		for (int i = 1; i <= height; i++) {
          
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
		
	}
}
