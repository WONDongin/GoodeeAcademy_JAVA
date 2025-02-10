package test;
/*
 * 다음의 결과가 나오도록 Student 클래스 구현하기
 * [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
	=====================
 */
class Student{
	String name;
	int id, kor, eng, math;
	static int pluss;
	
	// 첫 번째 생성자: 이름과 학번만 받음
	Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.kor = 0;
        this.eng = 0;
        this.math = 0;
		id = pluss++;
	}
	// 두 번째 생성자: 이름, 학번과 국어, 영어, 수학 점수까지 받음
	Student(String name, int id, int kor, int eng, int math ) {
		this(name, id);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 총점
	int sum() {
		return kor + eng + math;
	}
	// 평균
	double avg() {
		return (kor + eng + math) / 3.0;
	}
	// 학생 정보 출력 메서드
	void info() {
		System.out.println( "학번:" + id + "\n이름:" + name + "\n국어:" + kor + "\n영어:" + eng + "\n수학:" + math + "\n총점:" + sum() + "\n평균:" + avg() + "" + "\n=====================");
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	}
}
