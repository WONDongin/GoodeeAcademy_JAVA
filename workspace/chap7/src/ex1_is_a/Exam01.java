package ex1_is_a;
/*
 	Student, Person 클래스 구현하기
 	
 	Student 클래스(자손)
 	void study() : 공부한다 를 화면에 출력함
 	
 	Person 클래스(부모)
 	void eat() : 먹는다 를 화면에 출력함
 	void sleep() : 잔다 를 화면에 출력함
 */
public class Exam01 {
	public static void main(String[] args) {
		Student st = new Student();
		st.eat();
		st.sleep();
		st.study();
	}
}
