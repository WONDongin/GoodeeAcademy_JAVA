package test;

import java.security.cert.X509Certificate;

/*

방정식 2x+4y=10의 모든 해를 구하는 프로그램을 작성하시오.
단 x와 y는 정수이고  각각의 범위는 0<=x<=10, 0<=y<=10임 

[결과]
x=1,y=2
x=3,y=1
x=5,y=0

*/
public class Test04 {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if((2*i) + (4*j) == 10  ) {
					System.out.println("x=" + i + ", y=" + j );
				}
			}
		}
	}
}
