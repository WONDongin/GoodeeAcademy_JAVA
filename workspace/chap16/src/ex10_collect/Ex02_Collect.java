package ex10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import chap16.Student;
/*
 * collect(Collector 인터페이스) : Collection 객체로 변경.
 * Collectors 클래스 : Collector 인터페이스 구현클래스
 * 		toList() : List 객체로 변경
 * 		toMap(key,value) : Map 객체로 변경
 * 		
 */
public class Ex02_Collect {
	public static void main(String[] args) {
		Student stuArr [] = {
				new Student("이자바", 3, 34, 55, 80),
				new Student("김자바", 1, 60, 45, 90),
				new Student("안자바", 2, 80, 95, 60),
				new Student("박자바", 2, 75, 85, 70),
				new Student("소자바", 1, 65, 65, 90),
				new Student("나자바", 3, 60, 85, 50),
				new Student("감자바", 3, 40, 75, 60)};
		System.out.println("1. 학생 이름만 뽑아서 List<String>에 저장한다");
		//Stream<Student> Stream.of(stuArr)
		//map(Student::getName) : Stream<Student> => String<String>
		List<String> names = Stream.of(stuArr)
				.map(Student::getName) //이름들만 Stream 객체로 생성
				.collect(Collectors.toList());
		System.out.println(names);
		System.out.println("2. 학생 이름만 뽑아서 String[] 에 저장한다.");
		String arrnames [] = Stream.of(stuArr)
				.map(Student::getName) //String 형 Stream으로 변경
				.toArray(String[]::new); //String형 배열로 변경
		System.out.println(Arrays.asList(arrnames)); 
		System.out.println("3 Map<String, Student>로 변환한다 key는 name");
		Map<String, Student> map =Stream.of(stuArr)
		//s : Student 자료형
		//s.getName() : key 부분
		//s-> : value 부분
/*
 * toMap(Function <? super Student, ? extends String> keyMapper, : 
 * 												Student 객체를 매개변수입력. String 리턴
 * 		 Function <? super Student, ? extends Student> valueMapper) :
 * 												Student 객체를 매개변수입력. Student 리턴
 *
 */
		.collect(Collectors.toMap(s -> s.getName(), s->s));
		for(String name : map.keySet()) {
			System.out.println(name+":"+map.get(name));
		}
		System.out.println("4 Stream의 요소의 갯수 출력하기");
		/*
		 * long count()
		 * int 	sum()
		 */
		long cnt =Stream.of(stuArr).count();
		System.out.println("요소의 갯수:"+cnt);
		cnt = Stream.of(stuArr).collect(Collectors.counting());
		System.out.println("요소의 갯수:"+cnt);
				}
	}


