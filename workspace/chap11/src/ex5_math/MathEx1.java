package ex5_math;
/*
Math 클래스 : 수치계산 기능 클래스
- final 클래스. 
- 생성자의 접근 제한자 private. 객체 생성 불가 (모든 멤버가 static 클래스 멤버)
- 두개의 상수
	- Math.PI : 웑주율
	- Math.E : 자연로그 
*/
public class MathEx1 {
	public static void main(String[] args) {
		// abs() : 절대값
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(3.14));
		System.out.println(Math.abs(-3.14));
		
		// 근사정수 : ceil, floor, rint
		// ceil : 큰 근사정수
		System.out.println(Math.ceil(5.4)); // 6.0
		System.out.println(Math.ceil(-5.4)); // -5.0
		// floor : 작은 근사정수
		System.out.println(Math.floor(5.4)); // 5.0
		System.out.println(Math.floor(-5.4)); // 6.0
		// rint : 근사정수
		System.out.println(Math.rint(5.4)); // 5.0
		System.out.println(Math.rint(-5.4)); // -5.0
		
		// 최대, 최소 : max, min
		System.out.println(Math.max(5, 4));
		System.out.println(Math.max(5.5, 5.3));
		System.out.println(Math.min(5, 4));
		System.out.println(Math.min(5.5, 5.3));
		
		// 반올림 : round
		System.out.println(Math.round(5.4));
		System.out.println(Math.round(5.5));
		
		// 난수 : random
		System.out.println(Math.random()); // 0 <= X < 1.0
		
		// 삼각함수 : 각도의 단위는 Radians임. Degrees이 아님
		System.out.println(Math.toDegrees(Math.PI/2)); // 90.0
		// sin(90도)
		System.out.println(Math.sin(Math.PI/2));
		// cos(90도)
		System.out.println(Math.cos(Math.toRadians(60)));
		// tna(45도)
		System.out.println(Math.tan(Math.PI/4));
		
		// log 함수
		System.out.println(Math.log(Math.E));
		// 제곱근
		System.out.println(Math.sqrt(25));// 5
		// 제곱
		System.out.println(Math.pow(5, 3)); // 5*5*5
	}
}
