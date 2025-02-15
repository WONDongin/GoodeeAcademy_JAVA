package ex1_object;
/*
Object 클래스 : equals 메서드
equals : 같은 내용인지 판단 리턴 용도 => 내용 비교를 위해서 각각 클래스에서 오버라이딩 필요
==        : 같은 객체 판단
  
*/
class Equal{
	int value;
	Equal(int value) {
		this.value = value;
	}
	// value 값이 같으면 True, 다르면 false 값 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Equal e = (Equal) obj;
			return value == e.value;
		} else {
			return false;
		}
	}
}

public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		if(e1 == e2) {
			System.out.println("e1과 e2는 같은 객체임");
		} else {
			System.out.println("e1과 e2는 다른 객체임"); //
		}
		
		if(e1.equals(e2)) {
			System.out.println("e1과 e2는 같은 내용의 객체임"); 
		} else {
			System.out.println("e1과 e2는 다른 내용의 객체임"); //
		}
		
	}
}
