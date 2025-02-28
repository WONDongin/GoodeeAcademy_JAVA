package ex8_parallel;


import java.util.function.Consumer;

import chap16.Member;
/*
 * Consumer : void accept(T), 매개변수 T, 리턴타입 없다
 * 			  default 메서드 andThen() 메서드.
 * andThen() 메서드 : 순차적으로 연결해서 실행 해 주는 메서드
 * 
 * default 메서드 : 인터페이스의 멤버 구현부가 존재. 인스턴스 메서드
 */
public class ConsumerAndThenEx1 {
	public static void main(String[] args) {
		//m : Member 객체
		Consumer<Member> consumerA = (m) -> {
		System.out.println("consumerA: "+m.getName());};
		consumerA.accept(new Member("홍길동", "hong", null)); //홍길동
		
		Consumer<Member> consumerB = (m) -> {
		System.out.println("consumerB: "+m.getId()); };
		consumerB.accept(new Member("홍길동", "hong", null)); //hong
		
		System.out.println("===================");
		Consumer<Member> consumerAB = consumerA
				.andThen(consumerB)
				.andThen(consumerB)
				.andThen(consumerB)
				.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}

}
