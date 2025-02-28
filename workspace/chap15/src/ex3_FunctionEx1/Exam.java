package ex3_FunctionEx1;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
Student 클래스에서 영어점수 합계와 수학점수 합계 출력하기 
*/

public class Exam {
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 25, 64, "컴공"),
			new Student("이몽룡", 85, 75, "통계"),
	};
	
	public static void main(String[] args) {
		System.out.print("학생들의 영어 점수 합계: ");
		printTot(s -> s.getEng());
		System.out.print("학생들의 수학 점수 합계: ");
		printTot(s -> s.getMath());
		System.out.println("학생들의 영어 점수 합계:" + getTot(s -> s.getEng()));
		System.out.println("학생들의 수학 점수 합계:" + getTot(s -> s.getMath()));
		System.out.println("학생들의 영어 점수 평균:" + getAvg(s -> s.getEng())); // 소숫점 출력
		System.out.println("학생들의 수학 점수 평균:" + getAvg(s -> s.getMath())); // 소숫점 출력
	
	}
	// ToDoubleFunction (applyAsDouble): double
	private static double getAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) sum += f.applyAsDouble(s);
		return sum / list.length;
	}
	
	// ToIntFunction (applyAsInt): int
	private static int getTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) sum += f.applyAsInt(s);
		System.out.print(sum);
		return sum;
	}
	private static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) sum += f.applyAsInt(s);
		System.out.println(sum);
	}
}
