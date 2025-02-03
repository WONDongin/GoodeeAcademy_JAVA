package chap3;
/*
 	단항 연산자
 		증감 연산자 : ++, --
 			++ :  1 증가
 			--  :  1 감소
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x =  5,  y = 5;
		x++; // 후위형, 후치형
		y--;
		System.out.println("x="+ x + ", y=" + y);
		
		++x; // 전위형, 전치형
		--y;
		System.out.println("x="+ x + ", y=" + y);
		
		x = y = 5;
		y = ++x;
		System.out.println("x="+ x + ", y=" + y); // x=6, y=6;
		
		y = x++;
		System.out.println("x="+ x + ", y=" + y); // x=7, y=6;
		
		x = 5;
		System.out.println("x=" + x++); // 5
		System.out.println("x=" + x); // 6
		System.out.println("x=" + ++x); // 7
		
		y = 5;
		System.out.println("y=" + y--); // 5
		System.out.println("y=" + y); // 4
		System.out.println("y=" + --y); // 3
	}
}
