package chap4;
/*
 	switch(조건값) {
 		case 값1 : 문장;
 						break;
 		case 값2 : 문장;
 						break;
 		case 값3 : 문장;
 						break;
 		default  : 문장;
 	}
 	break : switch 구문에서 빠짐
 */
public class SwitchEx01 {
	public static void main(String[] args) {
		int score = 99;
		
		switch (score / 10) {
		case 10 : 
		case 9 : System.out.println("A 학점");
						break;
		case 8 : System.out.println("B 학점");
						break; // switch 구문 종료
		case 7 : System.out.println("C 학점");
						break;
		case 6 : System.out.println("D 학점");
						break;
		default: System.out.println("F 학점");	
		}
		
		switch (score / 10) {
		case 10 : 
		case 9 : 
		case 8 :
		case 7 : 
		case 6 : System.out.println("PASS");
						break;
		default: System.out.println("FAIL");	
		}
	}
}
