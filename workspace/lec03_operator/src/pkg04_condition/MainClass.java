package pkg04_condition;

public class MainClass {
	public static void main(String[] args) {
		// 조건 연산자 : 조건식의 결과에 따라 변환 값이 달라지는 연산자
		
		// 형식
		// 조건식 ? 조건식의 결과가 true 인 경우 반환 값 : 조간식의 결과가 false 인 경우 반환 값
		
		int age = 20;
		boolean isAdult = age >= 20;
		String result = isAdult ? "성인" : "청소년";
		System.out.println(result);
		
		// 조건 연산자 중첩
		System.out.println(age <= 7 ? "미취학아동" : age <= 19 ? "청소년" : "성인");
	}
}
