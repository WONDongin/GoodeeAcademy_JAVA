package test;
/*
 * 다음 결과가 나오도록 School,Student, Score 클래스를 완성하시오
 * [결과]
================================
학번 : 10101
이름 : 정숙
국어 : 100
영어 : 90
수학 : 80
================================
학번 : 10101
이름 : 정숙
국어 : 100
영어 : 90
수학 : 80
================================
학번 : 10101
이름 : 정숙
국어 : 100
영어 : 90
수학 : 80
 */
class School {
    String name;
    Student2[] students; // 배열타입
}


class Student2 {
    String stuNo;
    String name;
    Score score; // 점수를 객체로
}


class Score {
    int kor;
    int eng;
    int math;
}
public class Test05 {
	public static void main(String[] args) {
		// School 객체 생성
        School school = new School();
        school.name = "구디초";
        school.students = new Student2[3]; //Student2 객체가 아님, Student2 참조 변수의 배열

        for (int i = 0; i < school.students.length; i++) {
            // Student2 객체 생성
            school.students[i] = new Student2();
            school.students[i].name = "정숙";
            school.students[i].stuNo = "10101";

            // Score 객체 생성
            school.students[i].score = new Score();
            school.students[i].score.kor = 100;
            school.students[i].score.eng = 90;
            school.students[i].score.math = 80;

            // 출력
            System.out.println("================================");
            System.out.println("학번 : " + school.students[i].stuNo);
            System.out.println("이름 : " + school.students[i].name);
            System.out.println("국어 : " + school.students[i].score.kor);
            System.out.println("영어 : " + school.students[i].score.eng);
            System.out.println("수학 : " + school.students[i].score.math);
        }
	    
	}
}
