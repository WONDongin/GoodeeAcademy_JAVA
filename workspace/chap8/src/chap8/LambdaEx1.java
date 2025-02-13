package chap8;

/*
람다식 예제 : jdk8 이후에 가능
함수적 인터페이스(FunctionalInterface) : 인터페이스의 추상메서드가 한개인 인터페이스
함수적 인터페이스만 람다방식으로 사용가능

추상메서드가 매개변수, 리턴타입이 없는 경우의 예제
() -> {.....}
{} 내부의 문장이 한개인 경우는 {} 생략가능 -> () -> ...
*/
@FunctionalInterface // 함수적 인터페이로 설정하므로 추상메서드가 한개임을 표시
interface LambadInterface1{
	void method(); // 매개변수 없고, 리턴타입도 없음
	// void method2(); 추상 메서드 한개여야 된다.
}
public class LambdaEx1 {
	public static void main(String[] args) {
		LambadInterface1 fi;
		// 내부객체
		fi = new LambadInterface1() {

			@Override
			public void method() {
				System.out.println("기존의 내부객체로 생성함");
			}
		};
		fi.method();
		
		// 1. 람다방식으로 변경
		fi = ()-> {
			String str = "람다방식1";
			System.out.println(str);
		};
		fi.method();
		
		// 2. 람다 방식: 내부문장이 한개인 경우 {} 생략가능
		fi = ()-> System.out.println("람다방식2");
		fi.method();
		execute(() -> System.out.println("execute 메서드에서 호출함"));
		
		// execute 함수를 이용하여 1 ~100까지의 합 출력
		execute(() -> {
			int sum = 0;
			for(int i = 1; i <= 100; i++) sum +=i;
			System.out.println("1~100까지의 합 : " + sum);
		});
		
		// execute 함수를 이용하여 1 ~100까지의 짝수의 합 출력
		execute(() -> {
			int sum = 0;
			for(int i = 2; i <= 100; i+=2) sum +=i;
			System.out.println("1~100까지의 짝수의 합 : " + sum);
		});
	}
	
	static void execute(LambadInterface1 f) {
		f.method();
	}
}
