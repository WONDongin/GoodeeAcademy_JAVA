package pkg01_field;

public class MainClass {
	public static void main(String[] args) {
		
		// Member 타입의 member 객체 생성
		Member member = new Member();
		
		// Member 객체를 이용한 필드 접근, 메소드 호출
		member.id = "master";
		System.out.println(member.id);
		
		member.method();
	}
}
