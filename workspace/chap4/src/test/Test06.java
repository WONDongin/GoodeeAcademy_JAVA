package test;

import java.util.Scanner;

/*
점수를 입력받아 
    95점 이상인 경우 A+ 90 ~ 94 : A0  
    89 ~ 85점 이상인 경우 B+ 80 ~ 84 : B0 
    79 ~ 75점 이상인 경우 C+ 70 ~ 74 : C0 
    69 ~ 65점 이상인 경우 D+ 60 ~ 64 : D0 
       그외는 F 로 출력하기.
    중첩 조건문을 이용하여 구현하기 
*/
public class Test06 {
	public static void main(String[] args) {
System.out.print("점수를 입력하세요: ");
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String grade;
		
		if (score >= 95) {
		    grade = "A+";
		} else if (score >= 90) {
		    grade = "A0";
		} else if (score >= 85) {
		    grade = "B+";
		} else if (score >= 80) {
		    grade = "B0";
		} else if (score >= 75) {
		    grade = "C+";
		} else if (score >= 65) {
		    grade = "D+";
		} else if (score >= 60) {
		    grade = "D0";
		} else {
		    grade = "F";
		}
		
		System.out.println(grade);
	}
}
