package test;

import java.util.Scanner;
/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
public class Test06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("삼각형의 높이를 입력하세요");
        int height = scanner.nextInt();
        scanner.close();
        
        int num = height * height;
        
        for(int i = 1; i <= height; i++) {
        	for(int j = 0; j < height - i; j++) {
        		System.out.print("\t");
        		// System.out.printf("%4d", num);
        		
        		// %4d : 출력서식문자. %nd : n자리를 확보해서 10진 정수 출력
        		// %4c : %nc :  n자리만큼 문자출력
        		// %4s : %ns :  n자리를 확보해서 문자열출력
        	}
        	for(int j = 0; j < 2 * i - 1; j++) {
        		System.out.print(num-- + "\t");
        	}
        	System.out.println();
        }
	}
}
