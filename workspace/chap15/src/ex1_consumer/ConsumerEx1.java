package ex1_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/*
java API에서 제공되는 인터페이스
- Java.util.function 패키지에 속한 인터페이스
- 람다를 이용하기 위한 인터페이스(함수적 인터페이스)

Consumer 인터페이스
 void accept(매개변수) : 매개변수가 있고 리턴값은 없는 메서드
 
 Consumer<T> : void accept(T)
 BiConsumer<T,U> : void accept(T, U)
 IntConsumer : void accept(int)
 LongConsumer : void accept(long)
 DoubleConsumer : void accept(double)
 ObjIntConsumer : void accept(T, int); 
 ObjLongConsumer : void accept(T, long); 
 ObjDoubleConsumer : void accept(T, double);
 LongSupplier : long getAsLong() 
*/
public class ConsumerEx1 {
	public static void main(String[] args) {
		// t: String
		Consumer<String>  c1 = t -> System.out.println(t + 8);
		c1.accept("java"); // Java8
		
		// (t, u) : String, String 형
		BiConsumer<String, String> c2 = (t,u) -> System.out.println(t + u);
		c2.accept("java", "8.0"); // Java8.0
		
		// t : int형
		IntConsumer c3 = t -> System.out.println(t * 100); // 1000
		c3.accept(10);
		
		// 1 ~ t 사이의 합을 출력
		// t : int형
		c3 = t ->{
			int sum = 0;
			for(int i = 1; i <= t; i++) sum += 1;
			System.out.println("1에서" + t + "까지의 합: " + sum);
		};
		c3.accept(100);
	}
}
