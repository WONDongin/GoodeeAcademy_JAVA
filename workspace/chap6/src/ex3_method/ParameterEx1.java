package ex3_method;
/*
 	매개변수 예제
 	*클래스멤버 -> 인스턴스 멤버 호출 x [객체화]
 	*
 	클래스    _ 변수 ___static(클래스) 변수 ___ 클래스 멤버 : 클래스명, 멤버명, 클래스정보 로드
 				| 		|										   |
 				|		|_ 인스턴스 변수 ____________|___
 				|                                                   |    |
 				|                                                   |    | 
 				|_ 메서드 ____ 클래스 메서드(static) _|     |   인스턴스 멤버 : 참조변수, 멤버명, 객체화시
 							|                                             |
 							|____ 인스턴스 멤버___________|
  */
class Value{
	int val;
}

public class ParameterEx1 {
	public static void main(String[] args) { // 클래스 멤버
		Value v = new Value();
		// 목적에 맞게 매개변수 
		v.val = 100;
		change1(v.val);
		System.out.println("change1 이후 : " + v.val);
		change2(v);
		System.out.println("change2 이후 : " + v.val);
	}
	
	private static void change1(int val) {
		val += 100;
		System.out.println("change1() : " + val);
	}
	
	private static void change2(Value v) {
		v.val += 100;
		System.out.println("change2() : " + v.val);
	}
}
