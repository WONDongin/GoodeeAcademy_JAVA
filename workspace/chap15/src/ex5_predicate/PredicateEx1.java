package ex5_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Predicate 인터페이스
	boolean test(T) : 매개변수 존재, 리턴타입은 boolean
	
Predicate<T>    : boolean test(T)
IntPredicate    : boolean test(int)
LongPredicate   : boolean test(long)
DoublePredicate : boolean test(double)

*/
class Student{
	private String name;
	private String gender;
	private int eng;
	private int math;
	
	public Student(String name, String gender, int eng, int math) {
		super();
		this.name = name;
		this.gender = gender;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {return name;}
	public String getGender() {return gender;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
public class PredicateEx1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", "남자", 70, 85),
				new Student("성춘향", "여자", 75, 100),
				new Student("이몽룡", "남자", 55, 95),
				new Student("향단이", "여자", 80, 95));
		
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균: " + avg(list,s-> s.getEng() >= 60));
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균: " +
		// s : Student 
		avg(list, s ->{
			return s.getEng() >= 60;
		}));
		
		System.out.println("여학생 영어 평균:" + avg(list,s-> s.getGender().equals("여자")));
		System.out.println("남학생 영어 평균:" + avg(list,s-> s.getGender().equals("남자")));
	}
											// f : s.getEng() >= 60
	private static double avg(List<Student> list, Predicate<Student> f ) {
		int sum = 0, cnt = 0;							
		for(Student s : list) {
			// f.test(s) : 
			if(f.test(s)) {
				sum += s.getEng();
				cnt++;
			}
		}
		return (double) sum / cnt;
	}
}

