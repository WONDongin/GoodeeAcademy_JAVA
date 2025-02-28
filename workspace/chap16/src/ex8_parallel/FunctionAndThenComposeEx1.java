package ex8_parallel;

import java.util.function.Function;

import chap16.Address;
import chap16.Member;
/*
 * Funtion<T,R> : R apply(T) : 매개변수 T, 리턴타입 R
 * ---두개의 인터페이스 객체를 연결
 * andThen() : 디폴트 메서드. 순차적 연결 실행 functionA 리턴값을 functionB 매개변수로 전달
 * compose() : 디폴트 메서드. 매개변수부터 실행 functionA 리턴값을 functionB 매개변수로 전달
 */
public class FunctionAndThenComposeEx1 {
	public static void main(String[] args) {
		Function<Member, Address> functionA; //Address accept(Member)
		Function<Address, String> functionB; //String accept(Address)
		Function<Member, String> functionAB; // String accept(Member)
		String city;
		functionA = m -> m.getAddress();
		functionB = a ->a.getCity();
		functionAB = functionA.andThen(functionB); //functionA 리턴값을 functionB 매개변수로 전달
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("andThen-->거주 도시:"+city);
		System.out.println();
		functionAB = functionB.compose(functionA); //functionA 리턴값을 functionB 매개변수로 전달
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("compose-->거주 도시:"+city);
	}

}
