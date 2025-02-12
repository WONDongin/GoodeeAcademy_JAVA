package ex7_package; // 패키지 설정

import java.util.Date;
import java.util.Scanner;

/* 9일차
 
패키지 예제
package
- 클래스 들의 모임
- 클래스의 이름은 패키지명을 포함
- 패키지의 설정은 파일의 처음에 한번만 기술해야 함
-- 같은 파일에 존재하는 모든 클래스는 같은 패키지에 속한 클래스.
	
import : 클래스 이름의 패키지명을 생략 할 수 있도록 미리 선언해줌
import java.util.* 
	
클래스의 패키지명을 생략 할 수 있는 경우
1. 같은 패키지에 속한 클래스는 패키지명 생략 가능
2. java.lang 패키지에 속한 클래스는 패키지명 생략 가능
3. import 구문으로 선언된 클래스는 패키지명 생략 가능
* 표현방식으로는 해당 패키지의 모든 클래스들은 패키지명 생략 가능 (import java.util.* )

 */
class Pack1 {
	void method() {
		System.out.println("ex7_package.Pack1 클래스의 method() 메서드");
	}
}
public class PackageEx1 {
	// java.lang 패키지명 생략가능
	public static void main(String[] args) {
		// ex7_package.Pack1 p = new ex7_package.Pack1();
		Pack1 p = new Pack1(); // 패키지명 생략
		p.method();
		
		// java.util.Scanner scan = new java.util.Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		// java.util.Date date = new java.util.Date();
		Date date = new Date();
	}
}
