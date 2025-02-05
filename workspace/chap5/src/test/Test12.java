package test;

import java.util.Scanner;
/*
삼각형의 높이를 입력하세요
5
15	14	13	12	11	
	10	9	8	7	
		6	5	4	
			3	2	
				1
*/
public class Test12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 사용자로부터 삼각형의 높이 입력받기
        System.out.print("삼각형의 높이를 입력하세요: ");
        int n = scanner.nextInt();

        // 삼각형 출력하기
        int currentNumber = n * (n + 1) / 2; // 삼각형의 첫 번째 줄에 시작되는 숫자
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < i; j++) {
        		System.out.print("\t");
        	}
        	for(int j = 0; j < n - i; j++) {
        		System.out.print(currentNumber-- + "\t");
        	}
        	System.out.println();
        }

        scanner.close();
	}
}
