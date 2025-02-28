package ex4_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class Student {
	private String name;
	private int eng;
	private int math;
	public Student(String name, int eng, int math) {
		super();
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", eng=" + eng + ", math=" + math + "]";
	}
	
}

public class OperatorEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90, 96),
				new Student("김삿갓", 95, 93),
				new Student("이몽룡", 100, 90));
		
		System.out.println("영어 점수 최고점: " + minOrMax(list,(a,b)->a.getEng() >= b.getEng() ? a : b));
		System.out.println("수학 점수 최고점: " + minOrMax(list,(a,b)->a.getMath() >= b.getMath() ? a : b));
		System.out.println("영어 점수 최저점: " + minOrMax(list,(a,b)->a.getEng() <= b.getEng() ? a : b));
		System.out.println("수학 점수 최저점: " + minOrMax(list,(a,b)->a.getMath() <= b.getMath() ? a : b));
		System.out.println("합계 점수 최고점: " + minOrMax(list,(a,b)->a.getEng()+a.getMath() >= b.getMath() + b.getEng() ? a : b));
		System.out.println("합계 점수 최저점: " + minOrMax(list,(a,b)->a.getMath()+a.getEng() <= b.getMath() + b.getEng() ? a : b));
	}

	private static Student minOrMax(List<Student> list, BinaryOperator<Student> f) {
		Student result = list.get(0);
		for(Student s : list) {
			result = f.apply(result, s);
		}
		return result;
	}
}
