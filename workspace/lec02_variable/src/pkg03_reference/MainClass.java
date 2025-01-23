package pkg03_reference;

public class MainClass {

	public static void main(String[] args) {
		// 메모리
		// 변수가 저장되는 실제 저장 공간
		
		/* 메모리 구조
		 	1바이트 마다 구역 구분 - 번호 부여(주소, 참조값)
		 	
		 	참조 자료형
		 	참조값을 저장하는 자료형
		 	기본 자료형을 제외한 모든 자료형
		 */
		
		// "hello 는 메모리 (String Constant pool)에 저장이 되고, s에는 그 참조값이 저장이된다."
		String s  = "hello";
		System.out.println(s);

	}

}
