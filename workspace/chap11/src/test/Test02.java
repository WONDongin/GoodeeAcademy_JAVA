package test;

import java.util.Objects;

/*
 * 학생클래스의 객체중 학번과 이름이 같다면 같은 학생이 되도록 Student 클래스 수정하기
 [결과]
[학번=100, 이름=홍길동,전공=경영]과 [학번=100, 이름=홍길동,전공=컴공]는 다른 객체입니다.
[학번=100, 이름=홍길동,전공=경영]과 [학번=100, 이름=홍길동,전공=컴공]학생은 같은 학생입니다. 
 */
class Student {
    // 학생의 학번, 이름, 전공을 저장하는 멤버 변수 선언
    int studno;  // 학번
    String name; // 이름
    String major; // 전공
    
    // 생성자: 학생 객체를 초기화하는 역할
    public Student(int studno, String name, String major) {
        this.studno = studno; // 학번 초기화
        this.name = name; // 이름 초기화
        this.major = major; // 전공 초기화
    }
    
    // equals 메서드 오버라이딩: 학번과 이름이 같으면 동일한 학생으로 판단
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) { // 객체가 Student 타입인지 확인
            Student student = (Student) obj; // Student 타입으로 변환
            return this.studno == student.studno && this.name.equals(student.name); // 학번과 이름 비교
        }
        return false; // 타입이 다르면 false 반환
    }
    
    // hashCode 메서드 오버라이딩: equals 메서드와 일관성을 유지하기 위해 학번과 이름을 기준으로 해시 코드 생성

    
    @Override
    public int hashCode() {
        return Objects.hash(studno, name);
    } 
    
    
    // toString 메서드 오버라이딩: 학생 객체의 정보를 보기 좋게 출력하도록 설정
    @Override
    public String toString() {
        return "[학번=" + studno + ", 이름=" + name + ", 전공=" + major + "]";
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


