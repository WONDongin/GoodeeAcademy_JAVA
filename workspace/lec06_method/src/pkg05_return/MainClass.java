package pkg05_return;

public class MainClass {
	public static void main(String[] args) {
		Member member = new Member();
		
		member.method1(10);
		member.method1(-10);
		
		int n = member.method2(10);
		System.out.println(n);
	}
}
