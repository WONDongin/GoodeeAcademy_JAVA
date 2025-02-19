package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

1.  Student 클래스 구현하기
    멤버변수 : 이름,국어점수, 영어점수, 수학점수
    멤버메서드 
         String toString() : 각멤버변수값,총점,평균 출력
         int getTotal() : 점수의 합 리턴
         int compareTo() : 이름의 오름차순으로 정렬되도록 구현
2. 구동 클래스 완성하기
    다음 결과가 나오도록 구동 클래스 구현하기    
        
[결과]
기본정렬방식
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)

총점기준 내림차순 정렬
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)
국어 점수내림차순 정렬
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)
영어 점수내림차순 정렬
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)
수학 점수내림차순 정렬
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
 */
class Student{
	String name;
	int kor, eng, math;

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// Getter 메서드
	public int getTotal() { return kor + eng + math; }
	public double getAvg() { return getTotal() / 3.0; }
    public String getName() { return name; }
    public int getKor() { return kor; }
    public int getEng() { return eng; }
    public int getMath() { return math; }

	@Override
	public String toString() {
		return String.format("%s, 국어(%d), 영어(%d), 수학(%d), 총점(%d), 평균(%.02f)", 
                name, kor, eng, math, getTotal(), getAvg());
	}
}	
	

public class Test01 {
	public static void main(String[] args) {
		// Arrays.asList() : 객체를 한번에 추가
		List<Student> list = new ArrayList<>(Arrays.asList(
				new Student("홍길동", 90, 80, 70),
		        new Student("김삿갓", 95, 85, 75),
		        new Student("이몽룡", 80, 95, 95),
		        new Student("임꺽정", 60, 75, 100)
		));
		// Comparator.comparing(Student::getName):이름 기준으로 오른차순정렬
		System.out.println("기본정렬방식");
		list.sort(Comparator.comparing(Student::getName));
		list.forEach(System.out::println);

		System.out.println("총점기준 내림차순 정렬");
		// Comparator.comparing() 사용 : 불필요한 compare() 메서드 구현 없이 간결한 정렬 가능
		list.sort(Comparator.comparingInt(Student::getTotal).reversed());
		
		// 간단한 비교 기준이 1개일 때
		// list.sort((s1, s2) -> Integer.compare(s2.getTotal(), s1.getTotal()));
		
		list.forEach(System.out::println);
		// for 루프 없이 한 줄로 출력
		// for(Student s : list) System.out.println(s);

		System.out.println("국어 점수내림차순 정렬");
		list.sort(Comparator.comparingInt(Student::getKor).reversed());
		list.forEach(System.out::println);

		System.out.println("영어 점수내림차순 정렬");
		list.sort(Comparator.comparingInt(Student::getEng).reversed());
		list.forEach(System.out::println);

		System.out.println("수학 점수내림차순 정렬");
		list.sort(Comparator.comparingInt(Student::getMath).reversed());
		list.forEach(System.out::println);
	}
}
