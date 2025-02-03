package chap3;

import java.util.Scanner;

/*
 	가로, 세로 값을 입력 받아서 직사각형의 넓이, 둘레, 정사각형 여부를 출력합니다.
 	[결과]
 	
 	가로, 세로를 입력하세요
 	10, 20
 	넓이 : 200 (가로 x 세로)
 	둘레 : 60 (가로+세로 * 2)
 	직사각형 
 */
public class Exam4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로를 입력하세요.");
		int w = scan.nextInt();
		
		System.out.println("세로를 입력하세요.");
		int h = scan.nextInt();
		
		System.out.println("넓이 : " + (w * h));
		System.out.println("둘레 : " + (w + h) * 2);
		System.out.println(w == h ? "정사각형" : "직사각형");
		
	}
}
