package test;

import java.util.Scanner;
/*
삼각형의 높이를 홀수로 입력하세요
5

*****
 ***
  *
 ***
*****

*/
public class Test08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 사용자로부터 홀수 입력 받기
        System.out.print("삼각형의 높이를 홀수로 입력하세요: ");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("홀수만 입력해주세요.");
            return;
        }

        // 위쪽 
        for(int i = 0; i < height / 2 + 1; i++) {
        	for(int j = 0; j < i; j++) {
        		System.out.print(" ");
        	}
        	
        	for(int j = 0; j < height - 2 * i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }

        // 아래쪽 
        for (int i = height / 2 - 1; i >= 0; i--) {
            // 공백 출력
        	for(int j = 0; j < i; j++) {
        		System.out.print(" ");
        	}
            // 별 출력
           for(int j = 0; j < height - 2 * i; j++) {
        	   System.out.print("*");
           }
           System.out.println();
        }
	}
}
