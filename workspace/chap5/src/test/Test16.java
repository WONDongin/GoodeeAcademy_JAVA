package test;

import java.util.Scanner;

/*
[결과]
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>1
학생수>5
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>2
scores[0]>100
scores[1]>50
scores[2]>80
scores[3]>75
scores[4]>95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>3
score[0]:100
score[1]:50
score[2]:80
score[3]:75
score[4]:95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>4
최고 점수:100
평균 점수:80.0
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>5
프로그램 종료
*/
public class Test16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = null;
		int mam = 0;
		int max = 0;

		System.out.println("--------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------");


		while(true) {
			System.out.print("선택> ");
			
			int menu = scan.nextInt();
			scan.nextLine();
			
			if(menu == 1) {
				System.out.print("학생수: ");
				int man = scan.nextInt();
				score = new int[man];

			} else if (menu == 2) {
				for(int i = 0; i <= score.length; i++) {
					System.out.print("score[" + i + "]: ");
					int scores = scan.nextInt();
				}
			} else if (menu == 3) {
				for(int i= 0; i <= score.length; i++) {
					System.out.print( score[i]);
				}
			} else if (menu == 4) {
				int sum = 0;
				
			} else if (menu == 5) {
				System.out.println(5);
			} else {
				System.out.println("다시 입력해주세요.");
			}			
		}

		
	}
}
