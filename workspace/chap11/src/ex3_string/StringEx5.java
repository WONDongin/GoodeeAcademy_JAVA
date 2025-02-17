package ex3_string;
/*
String.format() : 형식화된 문자(서식문자)를 이용하여 문자열로 리턴
 						  클래스 메서드 => 객체화 필요 없음
형식문자(서식문자) : %d, %f, %c, %s...
- System.out.printf() 사용법 동일, 콘솔(화면) 출력 						  
*/
public class StringEx5 {
	public static void main(String[] args) {
		//%d : 10진 정수. decimal
		String sf = String.format("%d", 12345);
		System.out.println(sf);
		//%,d : 세자리마다 , 표시
		System.out.println(String.format("%,d", 12345));
		//%,10d : 10자리 확보하고 세자리마다 , 표시
		System.out.println(String.format("%,10d", 12345));
		//%-10d : 10자리 확보하고 좌측정렬
		System.out.println(String.format("%-10d", 12345));
		//%-,10d : 10자리 확보하고 좌측정렬
		System.out.println(String.format("%-,10d", 12345));
		//%010d : 10자리 확보하고 빈자리는 0으로 채움
		System.out.println(String.format("%010d", 12345));
		//%X,%x : 16진수 정수.  Hexa
		System.out.println(String.format("%X,%x", 255,255));
		//%o : 8진수 정수.  octal
		System.out.println(String.format("%o", 10));
		//%b : boolean.
		System.out.println(String.format("%b.%b", false, true));
		
		//%f : 부동소수점 표현
		//%.2f : 소숫점 이하 2자리로 출력. 반올림으로 출력
		System.out.println(String.format("%.2f", 0.142));
		System.out.println(String.format("%.2f", 0.145));
		//%-,15.2f  : 15자리확보하고, 소수점이하 2자리로, 세자리마다, 표시, 죄측정렬하기
		System.out.println(String.format("%-,15.2f", 12345.145));
		//%015.2f  : 15자리확보하고, 소수점이하 2자리로, 빈자리를 0으로 채우기. - 표시불가
		System.out.println(String.format("%015.2f", 12345.145));
		
		// %s : 문자열 출력
		System.out.printf("%s\n", "홍길동");
		// %10s : 10자리 확보하여 문자열 출력
		System.out.printf("%10s\n", "홍길동");
		// %-10s : 10자리 확보하여 문자열 출력, 좌측정렬하기
		System.out.printf("%-10s\n", "홍길동");
		
		// %c : 문자출력
		System.out.printf("%c\n", '홍');
		// %5c : 5자리 확보하여 문자출력
		System.out.printf("%5c\n", '홍');
		
		// 여러개의 자료형 출력
		System.out.printf("%s의 학점은 %c 입니다. 점수는 %3d 입니다. \n", "홍길동", 'B', 85 );
	}
}
