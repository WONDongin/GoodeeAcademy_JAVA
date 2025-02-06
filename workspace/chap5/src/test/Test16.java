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
		Scanner scanner = new Scanner(System.in);
        int[] scores = null;
        int studentCount = 0;
        
        while (true) {
            System.out.println("--------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------");
            System.out.print("선택>");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("학생수>");
                studentCount = scanner.nextInt();
                // 학생수 만큼 배열생성
                scores = new int[studentCount];
            } else if (choice == 2) {
                if (scores == null) {
                    System.out.println("먼저 학생 수를 입력하세요.");
                    continue;
                }
                // 점수저장
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = scanner.nextInt();
                }
            } else if (choice == 3) {
            	// 배열출력
                if (scores == null) {
                    System.out.println("점수를 먼저 입력하세요.");
                    continue;
                }
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("score[" + i + "]: " + scores[i]);
                }
            } else if (choice == 4) {
                if (scores == null) {
                    System.out.println("점수를 먼저 입력하세요.");
                    continue;
                }
                // 최대 점수
                int maxScore = scores[0];
                int sum = 0;
                for (int score : scores) {
                    if (score > maxScore) {
                        maxScore = score;
                    }
                    sum += score;
                }
                // 평균
                double avgScore = (double) sum / scores.length;
                System.out.println("최고 점수:" + maxScore);
                System.out.println("평균 점수:" + avgScore);
            } else if (choice == 5) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("올바른 선택이 아닙니다. 다시 입력하세요.");
            }
        }
        scanner.close();

	}
}
