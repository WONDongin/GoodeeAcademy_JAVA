package ex5_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
}
public class FlatMapEx3 {
	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(
				new Student("홍길동", 80), new Student("강나라", 90),
				new Student("장일동", 85));
		List<Student> list2 = Arrays.asList(
				new Student("나자바", 70), new Student("신용권", 100),
				new Student("유미선", 60));
		List<List<Student>> stu = new ArrayList<List<Student>>();
		//stu[0] : 1반 ...
		//stu[1] : 2반 ...
		stu.add(list1);
		stu.add(list2);
//		stu.stream().forEach(System.out::println);
//		stu.stream().flatMap(List::stream).forEach(System.out::println);
		/*
		 * stu.stream() : Stream<List<Student>>
		 * flatMap(1 -> 1.stream()) : List<Student> => Stream<Student> 변경
		 */
		stu.stream().flatMap( l -> l.stream()).forEach(System.out::println);


	}

}
