package chap4;
/*
 	switch(조건값)
 	조건값으로 사용가능한 자료형
 	byte, short, int, char, String
 */
public class SwitchEx03 {
	public static void main(String[] args) {
		String str = "2";
		switch (str) {
		case "1": System.out.println(str); break;
		default : System.out.println("default 문 실행"); break;
		}
		
		char ch = 'A';
		switch (ch) {
		case 'A' : System.out.println(ch); break;
		default : System.out.println("default 문 실행"); break;
		}
		
		int num = 1;
		switch (num) {
		case 1 : System.out.println(num); break;
		default : System.out.println("default 문 실행"); break;
		}
		
		// 중첩 switch 구문 가능
		int a = 1, b = 2;
		switch(a) {
			case 1 : switch(b) {
							case 2 : System.out.println("a=" + a + "b=" + b);
							break;
						}
						break;
			default : System.out.println("default 구문 실행");
		}
	}
}
