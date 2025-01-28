package pkg02_generic;

public class MainClass {
	public static void main(String[] args) {
		
		// MyBox 객체 선언 및 생성
		MyBox<Integer> myBox = new MyBox<Integer>();
		
		myBox.setItem(69);
		System.out.println(myBox.getItem());
	}
}
