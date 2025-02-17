package test;
/*
* 다음 결과가 나오도록 정의된 메서드를 구현하기
* 메서드명 : filldash(문자열,길이)
* 기능 : 문자열을 주어진 길이의 문자열로  만들고, 
*       왼쪽 빈 공간은 -으로 채운다.
*       만일 주어진 문자열이 null이거나 
*       문자열의 길이가 length의 값과 같으면 그대로 반환한다.
*       만일 주어진 length의 값이 0과 같거나 작은 값이면 
*       빈 문자열("")을 반환한다.
* 반환타입 : String
* 매개변수 : String src, int length

[결과]
----A12345

A12
null
*/
public class Test09 {
	public static void main(String[] args) {
		  String src = "A12345";
		  System.out.println(filldash(src, 10));
		  System.out.println(filldash(src, -1));
		  System.out.println(filldash(src, 3));
		  System.out.println(filldash(null, 3));
	}
}
