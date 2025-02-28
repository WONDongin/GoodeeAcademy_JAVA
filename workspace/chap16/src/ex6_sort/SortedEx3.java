package ex6_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import chap16.Student;

public class SortedEx3 {
	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
					new Student("김삿갓", 1, 85, 88, 80),
					new Student("김길동", 1, 89, 56, 66),
					new Student("김삿갓", 1, 80, 88, 80),
					new Student("김삿갓", 1, 90, 88, 80),
					new Student("이몽룡", 2, 90, 78, 95),
					new Student("임꺽정", 3, 60, 56, 88),
					new Student("임꺽정", 1, 90, 72, 72));
		studentStream.sorted(
		Comparator.comparing(Student::getBan) //반별 정렬. 1차정렬. 메서드 참조 방식
		.thenComparing(Comparator.naturalOrder()))
		.forEach(System.out::println);
		//예외 발생 : Stream은 한번 조회하고 나면 close됨.
	}

}
