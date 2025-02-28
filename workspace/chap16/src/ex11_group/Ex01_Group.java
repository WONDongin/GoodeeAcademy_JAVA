
package ex11_group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import chap16.Student2;
import chap16.Student2.City;

public class Ex01_Group {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("홍길동", 50, Student2.Gender.MALE, City.Seoul),
				new Student2("김길순", 70, Student2.Gender.FEMALE,City.Seoul),
				new Student2("박자바", 85, Student2.Gender.MALE, City.Busan),
				new Student2("이순영", 75, Student2.Gender.FEMALE, City.Busan )
				);
		double male = list.stream().filter(s->s.getGender()==Student2.Gender.MALE)
				.mapToInt(Student2::getScore).average().getAsDouble();
		double female = list.stream().filter(s->s.getGender()==Student2.Gender.FEMALE)
				.mapToInt(Student2::getScore).average().getAsDouble();
		System.out.println("남자평균점수 :"+male+"\n여학생평균:"+female);
		//groupingBy(그룹기준컬럼, 값)
		//averagingDouble(Student2::getScore) : score 값의 평균
		Map<Student2.Gender, Double> map1 = list.stream()
				.collect(Collectors.groupingBy(
						Student2::getGender, Collectors.averagingDouble(Student2::getScore)
						));
		System.out.println(map1);
		System.out.println("도시별로 이름 출력");
		//mapping : (Student2::getName  : 데이터들을 변환하기 위한 함수.) => 데이터 선택
		//			Collectors.joining(",","[","]") => 선택된 데이터를 수집하는 함수
		Map<Student2.City, String> map2 = list.stream()
				.collect(Collectors.groupingBy(
						Student2::getCity, //구분컬럼
						Collectors.mapping(Student2::getName, Collectors.joining(",")))
		);
		System.out.println(map2);
	}
}