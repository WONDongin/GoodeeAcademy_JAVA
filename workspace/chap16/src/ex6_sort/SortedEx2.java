package ex6_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import chap16.Student;
/*
 * Student 클래스의 기본 정렬 방식 구현 : 이름순으로
 * Sorted() : Stream의 요소들을 정렬하여 Stream으로 리턴. 기본정렬방식 정렬.
 * 		 => 요소들은 Comparable 객체로 형변환 가능해야함.
 * 		 => 요소들은 Comparable 인터페이스를 구현해야함.
 * sorted(Comparator) => Comparator 객체가 구현된 형태로 정렬함.
 */
public class SortedEx2 {
	public static void main(String[] args) {
		List<Student> list =Arrays.asList(
				new Student("홍길동", 1, 89, 56, 66),
				new Student("김삿갓", 1, 85, 56, 80),
				new Student("이몽룡", 2, 90, 78, 95),
				new Student("임꺽정", 3, 60, 56, 88));
		//이름으로 정렬
		list.stream().sorted().forEach(System.out::println);
		System.out.println("총점순으로 정렬하기");
		list.stream().sorted((s1,s2) -> 
		(s2.getEng()+s2.getMath()+s2.getKor()) - (s1.getEng()+s1.getKor()+s1.getMath())
		).forEach(System.out::println);
	}

}
