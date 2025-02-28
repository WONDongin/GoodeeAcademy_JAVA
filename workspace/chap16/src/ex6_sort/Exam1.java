package ex6_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import chap16.Student;

/*
 * SortedEx3.java 소스의 내용을 반별, 총점순으로 정렬하기
 */
public class Exam1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("김삿갓", 1, 85, 88, 80),
				new Student("김길동", 1, 89, 56, 66),
				new Student("김삿갓", 1, 80, 88, 80),
				new Student("김삿갓", 1, 90, 88, 80),
				new Student("이몽룡", 2, 90, 78, 95),
				new Student("임꺽정", 3, 60, 56, 88),
				new Student("임꺽정", 1, 90, 72, 72));
		//반별 총점순으로 내림 정렬하기
		list.stream().sorted(
		Comparator.comparing(Student::getBan)//1차정렬. 메서드 참조방식
		.thenComparing(s -> (s.getEng()+s.getMath()+s.getKor())*-1))
		.forEach(System.out::println);
		//반별 영어점수의 내림차순으로 정렬하기
		System.out.println("반별 영어점수의 내림차순 정렬하기 =======");
		list.stream().sorted(
		Comparator.comparing(Student::getBan) //1차정렬. 메서드 참조방식
		.thenComparing(s ->(s.getEng())* -1))//정렬 기준값
		.forEach(System.out::println);
		//반별 수학점수의 내림차순으로 정렬하기
		System.out.println("반별 수학점수의 내림차순 정렬하기 =======");
		list.stream().sorted(
		Comparator.comparing(Student::getBan)//1차정렬. 메서드 참조방식
		.thenComparing(s ->(s.getMath())* -1))//정렬 기준값
		.forEach(System.out::println);
		//반별 국어점수의 내림차순으로 정렬하기
		System.out.println("반별 국어점수의 내림차순 정렬하기 =======");
		list.stream().sorted(
		Comparator.comparing(Student::getBan)//1차정렬. 메서드 참조방식
		.thenComparing(s ->(s.getKor())* -1))//정렬 기준값
		.forEach(System.out::println);

	}

}
