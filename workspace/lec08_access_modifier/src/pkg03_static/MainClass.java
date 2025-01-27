package pkg03_static;

public class MainClass {
	public static void main(String[] args) {
		
		// User 타입의 user 객체 생성
		User user = new User();
		user.setId("admin");
		System.out.println(user.getId());
		
		// 인스턴스 : 메모리 공간을 할당 받은 객체
		// 인스턴스를 이용해서 호출하는 멤버
		
		// 정적 멤버 확인
		System.out.println(Calculator.MAKER);
		Calculator.add(1, 2);
	}
}
