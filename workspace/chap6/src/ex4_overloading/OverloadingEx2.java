package ex4_overloading;
/*
 	[오버로딩 메서드의 선택 기준] - 다형성
 	
 	1. 호출되는 인자값(10, 10)의 자료형과 메서드에 선언된 자료형이 동일한 경우 선택
 	2. 1의 조건이 없는 경우, 
 		최소 갯수로 자동형변환이 가능한 메서드 선택
 		=> 동일한 조건이 메서드가 여러개인 경우 오류발생.
 */
class Adder2{

	int add(int a, int b) {
		System.out.print("1: ");
		return a +b;
	}

	long add(long a, int b) {
		System.out.print("2: ");
		return a +b;
	}

	long add(int a, long b) {
		System.out.print("3: ");
		return a +b;
	}
	
	long add(long a, long b) {
		System.out.print("4: ");
		return a +b;
	}
	
	
}
public class OverloadingEx2 {
	public static void main(String[] args) {
		Adder2  a = new Adder2();
		System.out.println(a.add(10, 10));      //1 : int , int  
		System.out.println(a.add(10, 10L));    //3 : int, long
		System.out.println(a.add(10L, 10));    //2 : long, int
		System.out.println(a.add(10L, 10L));  //4 : long, long
	}
}
