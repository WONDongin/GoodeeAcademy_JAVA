package ex3_FunctionEx1;

import java.util.function.Function;
import java.util.function.ToIntFunction;
/*
Function 계열 인터페이스
 R applyXXX(T) : 매개변수 존재, 리턴값 존재
 
 Function<T,R>     : R apply(T)
 BiFunction<T,U,R> : R apply(T,U)
 IntFunction<R>    : R apply(int v) 
 DoubleFunction<R> : R apply(double v)
 ToIntFunction<T>  : int applayAsInt(T)
 ToDoubleFuction<T>: double applyAsDouble(T)
*/
class Student{ // Bean 클래스
	private String name;
	private int eng;
	private int math;
	private String major;
	
	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	// getter : 멤버변수의 값을 리턴 String getName() => name Get 프로퍼티(property)
	// setter : 멤버변수의 값을 저장 void setName(String name) => name Set 프로퍼티(property)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}

public class FunctionEx1 {
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계"),
	};
	
	public static void main(String[] args) {
		//
		System.out.print("학생의 이름: ");
		for(Student s : list) {
			System.out.print(s.getName() + ",");
		}
		System.out.println();
		
		//
		System.out.print("학생의 이름: ");
		Function<Student, String> f1 = s -> s.getName(); 
		for(Student s : list) {
			System.out.print(f1.apply(s) + ",");
		}
		System.out.println();
		//s : Student
		System.out.print("전공명: ");
		printstring(s -> s.getMajor());
		
		// printstring : 문자열, 문자열
		System.out.println();
		System.out.print("수학점수: ");
		printstring(s -> s.getMath() + "");
		System.out.println();
		System.out.print("영어점수: ");
		printstring(s -> s.getEng() + "");
		
		// ToIntFunction : 정수형
		System.out.println();
		System.out.print("수학점수: ");
		printInt(s -> s.getMath());
		System.out.println();
		System.out.print("영어점수: ");
		printInt(s -> s.getEng());
		
		// 문자열 + 정수 
		System.out.println();
		System.out.print("학생이름(영어점수): ");
		printstring(s -> s.getName() + "(" + s.getEng() + ")");
		System.out.println();
		System.out.print("학생이름(수학점수): ");
		printstring(s -> s.getName() + "(" + s.getMath() + ")");
		
		
	}
	
	static void printstring(Function<Student, String> f){
		for(Student s : list) {
			System.out.print(f.apply(s) + ",");
		} 
	}
	static void printInt(ToIntFunction<Student> f){
		for(Student s : list) {
			System.out.print(f.applyAsInt(s) + ",");
		} 
	}
	
}
