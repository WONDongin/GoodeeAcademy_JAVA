package chap8;
/*
추상메서드의 매개변수가 있고, 리턴타입은 void인 경우
(매개변수) -> {...}
매개변수가 한개인 경우() 생략 가능
실행구문이 한개인 경우 {} 생략 가능
*/
interface LambdaInterface2{
	void method(int a);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		// 방법 1.
		LambdaInterface2 f = (i)-> {
			System.out.println(i * 5);
		};
		f.method(6);
		
		// 방법 2.
		f = i -> System.out.println(i*5);
		f.method(5);
		
		calc(f, 10); // 50
	}
	
	private static void calc(LambdaInterface2 ff, int num) {
		 ff.method(num);
	}
}
