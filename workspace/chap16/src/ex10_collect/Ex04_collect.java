package ex10_collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import chap16.Student2;

public class Ex04_collect {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("홍길동", 50, Student2.Gender.MALE),
				new Student2("김길순", 70, Student2.Gender.FEMALE),
				new Student2("박자바", 85, Student2.Gender.MALE),
				new Student2("이순영", 75, Student2.Gender.FEMALE)
				);
		System.out.println("1.List로 생성하여 남학생의 이름, 점수 출력하기.");
		List<Student2> malelist = list.stream()
				.filter(s-> s.getGender() == Student2.Gender.MALE)
				.collect(Collectors.toList());
		malelist.stream().forEach(s->System.out.println(s.getName()+","+s.getScore()));
		System.out.println("2.List로 생성하여 여학생의 이름, 점수 출력하기.");
		List<Student2> femalelist = list.stream()
				.filter(s-> s.getGender() == Student2.Gender.FEMALE)
				.collect(Collectors.toList());
		femalelist.stream().forEach(s->System.out.println(s.getName()+","+s.getScore()));
		System.out.println("3.set로 생성하여 여학생의 이름, 점수 출력하기.");
		Set<Student2> femaleset = list.stream()
				.filter(s-> s.getGender() == Student2.Gender.FEMALE)
//				.collect(Collectors.toCollection(HashSet<Student2>::new));
				.collect(Collectors.toCollection(()->new HashSet<Student2>()));
		femaleset.stream().forEach(s->System.out.println(s.getName()+","+s.getScore()));
		System.out.println("4. list중 score 값의 최대값 출력하기");
		Optional<Student2> stu = list.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(s->s.getScore())));
		System.out.println("점수가 가장 높은 학생:"+stu.get().getName());
		System.out.println("5. list중 score 값의 최소값 출력하기");
		stu = list.stream()
  			.collect(Collectors.minBy(Comparator.comparingInt(s -> s.getScore())));
		System.out.println("점수가 가장 낮은 학생:"+stu.get().getName());
		System.out.println("6. list 학생의 이름들을 출력하기");
		String names = list.stream().map(Student2::getName)
				.collect(Collectors.joining(",","[","]"));
		System.out.println(names);
		/*
		 * Collectors.joining(구분자,시작문자,종료문자)
		 * Stream의 요소를 연결하여 문자열 리턴
		 * 구분자: 문자열 사이의 구분 표시
		 * 시작문자 : 문자의 첫번쨰 문자
		 * 종료문자 : 문자의 마지막 문자
		 */
	}

}
