package ex2_method;
/*
 	멤버 메서드(함수, Function)
 	
 	구성요소
 	[접근제어자][제어자] 리턴타입 메서드이름(매개변수목록) => 선언부
 	{ ..... return 값; }                                                => 구현부 알고리즘 구성
 	
 	리턴타입 : 메서드 종료 후 전달되는 값의 자료형.
 	              void : 전달되는 값이 없음. 리턴값이 없음
 	              
 	메서드이름 : 식별자.
 	매개변수목록 : 메서드를 호출할때 메서드에 전달될 값의 자료형과 변수명 설정
 	                  전달 값이 없을 경우 () 표현함 	
 	                  
 	return : 메서드 종료
 		리턴타입이 void 인 경우 : 생략가능. 메서드의 마지막 } 블록의 끝을 실행하면 메서드 종료 인식
 		리턴타입이 void가 아닌경우 : 생략 불가.
 												return 리턴값;
 												리턴값의 자료형은 리턴타입과 같거나, 자동형 변환이 되어야 한다.
 */
public class Adder {
	int add1(int a, int b) { // int 값 2개를 입력받아 int값을 리턴하는 메서드
		return a+b; // 리턴값과 리턴타입의 자료형이 동일하다.
	}
	
	long add2(int a, int b) { // int 값 2개를 입력받아 long값을 리턴하는 메서드
		return a+b; // 리터값을 리턴타입이 자동형변환 가능 
	}
	
	void add3(int a, int b) { // int값 2개을 입력, 리턴값은 없는 메서드
		System.out.println(a+b); // return 예약어 생략 가능
		return;                            // return 구현해도 됨
	}
}
