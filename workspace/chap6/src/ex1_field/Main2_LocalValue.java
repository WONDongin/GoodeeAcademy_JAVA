package ex1_field;

/*
 	지역변수는 반드시 초기화 되어야함
 	매개변수는 지역변수
 */
public class Main2_LocalValue {
	public static void main(String[] args) {
		int num;
		// System.out.println(num); // 초기화 하지 않은 지역변수 출력불가
		
		boolean b = true;
		if(b) num = 100;
		// System.out.println(num); // 초기화 되지 않을 가능성이 있으므로 오류
		
		if(b) {num = 100;} 
		else {num = 200;}
		System.out.println(num); // 초기화 되지 않을 가능성이 없으므로 정상 실행
		//
		
		// 지역변수 선언시 > 초기화
		String grade = null; // 선언시 초기화 하면 오류 발생 안함
		int score = 80;
		if(score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		}
		
		System.out.println(grade + "학점"); // 초기화 되지 않을 가능성이 있으므로 오류
		
		switch(score / 10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		default : grade = "F"; break;
		}
		System.out.println(grade + "학점");
	}
}
