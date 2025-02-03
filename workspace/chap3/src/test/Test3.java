package test;

import java.util.Scanner;

/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		System.out.println(score >= 90 ? "A학점" : score >= 80 ? "B학점" : score > 70 ? "C학점" : score >= 60 ? "D학점" : "F학점" );
	}
}
