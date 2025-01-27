package pkg01_import;

import com.example.project2.*;

public class MainClass {
	public static void main(String[] args) {
		
		// com.example.project1 패기지에 저장된 Member 클래스
		com.example.project1.Member member = new com.example.project1.Member();
		System.out.println(member);
		
		// com.example.project2 패기지에 저장된 Event 클래스
		Event event = new Event();
		System.out.println(event);
		
		// com.example.project2 패기지에 저장된 Coupon 클래스
		Coupon coupon = new Coupon();
		System.out.println(coupon);
	}
}
