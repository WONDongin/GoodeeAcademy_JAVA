package ex1_field;
/*
	클래스 변수 사용 예제
	
 */
public class Car2 {
	String color; 
	int num; 
	int sno;
	static int cnt; // 자동차 생산갯수

	
	public String toString() {
		return "자동차번호: " + sno + "=>" + color + "," + num + ", 자동차 생산 갯수: " + cnt;
	}
}
