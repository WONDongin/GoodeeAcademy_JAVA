package test;
/*
 * 학생클래스의 객체중 학번과 이름이 같다면 같은 학생이 되도록 Student 클래스 수정하기
 [결과]
[학번=100, 이름=홍길동,전공=경영]과 [학번=100, 이름=홍길동,전공=컴공]는 다른 객체입니다.
[학번=100, 이름=홍길동,전공=경영]과 [학번=100, 이름=홍길동,전공=컴공]학생은 같은 학생입니다. 
 */
class Student {
	int studno;
	String name;
	String major;
	public Student(int studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student  s = (Student) obj;
			return studno == s.studno && name == s.name; 
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	
	
}
public class Test02 {
	public static void main(String[] args) {
		Student s1 = new Student(100,"홍길동","경영");
		Student s2 = new Student(100,"홍길동","컴공");
		if(s1 == s2) {
			System.out.println(s1+"과 "+s2+"는 같은 객체입니다.");
		} else {
			System.out.println(s1+"과 "+s2+"는 다른 객체입니다.");
		}
		if(s1.equals(s2)) {
			System.out.println(s1+"과 "+s2+"학생은 같은 학생입니다.");
		} else {
			System.out.println(s1+"과 "+s2+"학생은 다른 학생입니다.");
		}
	}
}
