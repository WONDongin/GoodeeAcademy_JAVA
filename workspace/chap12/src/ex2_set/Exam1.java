package ex2_set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Student 클래스 구현하기
1. 멤버변수 : 학번(studno), 이름(name), 전공(major)
2. 멤버메서드 : 학생정보 출력하도록 toString() 메서드 구현하기
3. comparto() 메서드에서 기본정렬방식이 학번순으로 정렬되도록 설정
4. 이름과 학번이 같은 경우 같은 학생으로 인식하도록 설정 
5. 생성자 : 구동클래스에 맞도록 설정
*/
class Student implements Comparable<Student>{
	int studno;
	String name, major;
	public Student(int studno, String name, String major) {
		super();
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	
	// 동일한 조건 =  hashCode, equals 오버라이딩
	@Override
	public int hashCode() {
		return name.hashCode() + studno;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && studno == s.studno;
		}
		return false;
	}

	@Override
	public String toString() {
		return studno + ", 이름=" + name + ", 전공=" + major;
	}
	
	@Override
	public int compareTo(Student n) {
		return n.studno - studno;
	}
	
}
public class Exam1 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "홍길동", "경영"));
		set.add(new Student(2, "홍길순", "경영"));
		set.add(new Student(2, "홍길순", "컴공"));
		set.add(new Student(1, "홍길동", "통계"));
		set.add(new Student(3, "홍길동", "컴공"));
		System.out.println("정렬 전:" +  set);
		List<Student> list = new ArrayList<Student>(set);
		
		Collections.sort(list);
		System.out.println("정렬 후:" + list);
	}
}
