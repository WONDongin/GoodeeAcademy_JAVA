package chap4;

import java.util.Scanner;

/*
 	삼각형의 높이를 입력 받아서 *로 삼각형 출력하기
 	[결과]
 	삼각형의 높이 : 3
 	
 	1 :    i       j
 	*      1      1
 	**    2      2
 	***   3      3
 	==============

 	2 :      i       j
 	***      3     123
 	**       2     12
 	*        1      1
       
 	==============
 	3 :      i       j
 	*        3     3
 	**       2     23
 	***      1      123
 	if (i <= j) *출력 , else 공백
 	
 	==============
 	3 :      i       j
 	***     3      123
 	 **      2     23
 	  *      1      3
 	if (i <= j) *출력 , else 공백
 
       
 */
public class Exam07 {
	public static void main(String[] args) {
		
		System.out.print("삼각형의 높이 : ");
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		
		for(int i = 1; i <= h; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========");
		
		for(int i = h; i > 0; i--) {
			for(int j =1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========");
		
		for(int i = h; i > 0; i--) {
			for(int j = 1; j <= h; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("=========");
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= h; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
}
