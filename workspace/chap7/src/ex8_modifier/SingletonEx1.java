package ex8_modifier;
/*
생성자의 접근 제한자를 private : 객체의 갯수를 제한.
객체의 갯수를 한개만 설정
 */

class SingleObject{
	private static SingleObject obj = new SingleObject();
	private SingleObject() {} // 기본생성자 제공 불가.(생성막기) 생성자에 접근 현재 클래스에서만 허용
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class SingletonEx1 {
	public static void main(String[] args) {
		// SingleObject o = new SingleObject(); 생성자 생성불가
		SingleObject o1 = SingleObject.getObject();
		SingleObject o2 = SingleObject.getObject();
		// o1, o2 동일한 x001 참조하는 객체
		System.out.println("o1.value=" + o1.value); 
		System.out.println("o2.value=" + o2.value);
		
		o1.value = 200;
		System.out.println("o1.value=" + o1.value);
		System.out.println("o2.value=" + o2.value);
	}
}
