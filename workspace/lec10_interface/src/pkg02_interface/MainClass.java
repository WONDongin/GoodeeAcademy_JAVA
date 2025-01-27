package pkg02_interface;

public class MainClass {
	public static void main(String[] args) {
		
		MemberServicce memberServicce = new MemberServiceImpl();
		memberServicce.logIn();
		memberServicce.logOut();
		memberServicce.method1();
		
		MemberServicce.method2();
	}
}
