package pkg02_access_modifier;

public class Member {
	
	//private      - 같은 클래스 내부
	//default      - 기본사용 (동일 패키지)
	//protected - 상속 관계 + 같은 클래스
	//public        - 모두
	
	// 필드
	private String id;
	
	// 메소드
	public void info() {
		System.out.println(id);
	}
	
	// Getter 메소드 : 필드값을 반환하는 메소드
	public String getId() {
		return id;
	}
	// Setter 메소드 : 필드에 값을 저장하는 메소드
	public void setId(String id) {
		this.id = id;
	}
}
