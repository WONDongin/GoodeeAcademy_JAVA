package ex2_object;
/*
toString() : 객체를 문자열화 하는 메서드
- Object 구현 : 클래스명@16진수해쉬코드값 구현
- 내용 출력이 되도록 하기위해서는 오버라이딩 필요
*/
class ToString{
	int value;

	ToString(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ToString [value=" + value + "]";
	}
	
	
}
public class ToStringEx1 {
	public static void main(String[] args) {
		ToString t1 = new ToString(10);
		System.out.println(t1);
		
		ToString t2 = new ToString(10);
		System.out.println(t2);
	}
}
