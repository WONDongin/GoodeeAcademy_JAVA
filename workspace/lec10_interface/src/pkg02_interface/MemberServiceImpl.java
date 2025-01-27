package pkg02_interface;

// 인터페이스를 구현하는 구현 클래스

public class MemberServiceImpl implements MemberServicce {

	@Override
	public void logIn() {
		System.out.println("로그인");
	}

	@Override
	public void logOut() {
		System.out.println("로그아웃");
	}
	
}
