package ex1_object;

import java.lang.foreign.ValueLayout;

/*
[결과]
다른객체임
같은 숫자임
으로 출력
*/
class Number {
	int num;

	Number(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Number) {
			Number n = (Number) obj;
			return num == n.num;
		} else {
			return false;
		}
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Number n1 = new Number(10);
		Number n2 = new Number(10);
		
		if(n1 == n2) {
			System.out.println("n1과 n2는 같은 객체임");
		} else {
			System.out.println("n1과 n2는 다른 객체임"); //
		}
		
		if(n1.equals(n2)) {
			System.out.println("n1과 n2는 같은 내용의 객체임"); 
		} else {
			System.out.println("n1과 n2는 다른 내용의 객체임"); //
		}
	}
}
