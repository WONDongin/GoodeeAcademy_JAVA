package ex10_collect;
//reducing() 함수 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import chap16.Student;

public class Ex03_collect {
	public static void main(String[] args) {
		Student stuArr [] = {
				new Student("이자바", 3, 34, 55, 80),
				new Student("김자바", 1, 60, 45, 90),
				new Student("안자바", 2, 80, 95, 60),
				new Student("박자바", 2, 75, 85, 70),
				new Student("소자바", 1, 65, 65, 90),
				new Student("나자바", 3, 60, 85, 50),
				new Student("감자바", 3, 40, 75, 60)};
		System.out.println("1. eng 점수의 합 Collectors.reducing()");
		/*
		 * 10000, Student::getEng, Integer::sum
		 *  10000: 초기값
		 *  Student::getEng : 선택 컬럼
		 *  Integer::sum : 함수
		 */
		int engTotal = Stream.of(stuArr)
				.collect(Collectors.reducing(10000, Student::getEng, Integer::sum));
		System.out.println("영어 점수 합:"+engTotal);
		List<Integer> numbers =Arrays.asList(1,2,3,4,5);
		//BinaryOperator로 숫자를 더하는 연산을 정의
		Optional<Integer> sum = numbers.stream()
								.collect(Collectors.reducing((a, b) -> a + b));
		//Optional : 값이 없을 가능성이 있음
		//ifPresent : 값이 존재하면
		sum.ifPresent(System.out::println);
		numbers = Arrays.asList();
		Optional sum2 = numbers.stream().collect(Collectors.reducing((a, b) -> a + b ));
		sum2.ifPresent(System.out::println);
	}

}
