package pkg02_access_modifier;

public class MaiClass {
	public static void main(String[] args) {
	
		Member member = new Member();
		
		// 필드 접근 불가
		// member.id = "admin";
		
		// 메소드 접근 가능
		member.info();
		
		// setter 호출
		member.setId("admin");
		member.info();
		
		// getter 호출
		System.out.println((member.getId()));
	}
}
