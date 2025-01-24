package pkg03_constructor;

public class Member {
	String id;
	
	// 반환타입 : 존재하지 않는다.
	// 메소드명 : Class 와 같은 이름
	// 매개변수 : 일반 메소드와 동일하다.
	
	Member() {
		System.out.println(id + "를 가진 객체 생성");
	}
	
	Member(String id){
		this.id = id;
		System.out.println(this.id + "를 가진 객체 생성");
	}
	
}
