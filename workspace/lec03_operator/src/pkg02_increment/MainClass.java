package pkg02_increment;

public class MainClass {

	public static void main(String[] args) {
		// 증가 연산자
		int a = 10;
		
		// 1. 전위 연산 ++a
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		int x = 10;
		
		// 2. 후위 연산 a++
		int y = x++;
		System.out.println(x);
		System.out.println(y);
		
		// 감소 연산자
		// 1. 전위 연산자 --a
		// 2. 후위 연산자 a-- 
	}

}
