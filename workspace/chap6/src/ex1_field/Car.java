package ex1_field;
/*
 	선언 위치에 따른 변수의 종류
 	                                선언위치                   선언방식             메모리할당시점            메모리할당위치
 	클래스변수(필드)           클래스내부선언         static int cv;       클래스정보 로드시        클래스영역
 	                                객체화와 관련없음
 	                                모든 객체의 공통변수로 사용됨
 	                                클래스명.변수명 호출함
 	                                기본값으로 초기화
 	                                
 	인스턴스변수(필드)        클래스내부선언         int iv;                 객체화시                    힙영역
 	                                객체화가 되어야 값을 저장할 수 있음
 	                                반드시 객체생성(new)
 	                                참조변수명.변수명 호출함
 	                                기본값으로 초기화됨 
  	
 	지역변수                     메서드내부선언         int lv=0;             선언문 실행시              스택영역
 	                                선언한{}블록내에서만 사용가능함
 	                                for(int i = 0; ...) : i 변수는 for 문 내에서만 사용가능함
 	                                사용전에 반드시 초기화 되어야함.
 	                                매개변수는 지역변수
 */
public class Car {
	String color; // 인스턴스변수
	int num; // 인스턴스변수
	static int width = 200;  // 클래스변수
	static int height = 120;  // 클래스변수
	
	// toString : 반드시 public이 들어가야된다.
	// 객체의 문자열로 표현하기 위한 메서드
	// 참조변수명만 출력하면 자동으로 호출됨.
	public String toString() {
		return color + ":" + num + "(" + width + "," + height + ")";
	}
}
