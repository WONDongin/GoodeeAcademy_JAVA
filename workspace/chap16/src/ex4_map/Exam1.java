package ex4_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Student {
	String name;
	int eng;
	int math;
	public Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
}
public class Exam1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90,80),
										   new Student("김삿갓", 95,80),
										   new Student("이몽룡", 95,80));
		//Stream 을 이용하여 영어점수합, 수학점수합, 전체 점수 합 출력하기
		// s: Student형 객체
		IntStream esum = list.stream().mapToInt(s->s.eng);
		System.out.println("영어점수합:"+esum.sum()+"점");
		IntStream msum = list.stream().mapToInt(s->s.math);
		System.out.println("수학점수합:"+msum.sum()+"점");
		IntStream totsum = list.stream().mapToInt(s->s.eng+s.math);
		System.out.println("전체점수합:"+totsum.sum()+"점");
		System.out.println("메서드 참조 방식");
		System.out.print("영어점수합:");
		System.out.println(list.stream().mapToInt(Student::getEng).sum());
		System.out.print("수학점수합:");
		System.out.println(list.stream().mapToInt(Student::getMath).sum());
		System.out.print("영어점수 평균");
		System.out.println(list.stream().mapToInt(Student::getEng).average().getAsDouble());
		System.out.print("수학점수 평균");
		System.out.println(list.stream().mapToInt(Student::getMath).average().getAsDouble());
	}
}
