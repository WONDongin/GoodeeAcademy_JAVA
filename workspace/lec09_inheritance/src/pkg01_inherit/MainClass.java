package pkg01_inherit;

public class MainClass {
	public static void main(String[] args) {
		
		//EV 객체 생성
		Ev ev = new Ev();
		ev.forward();
		ev.reverse();
		ev.setModel("전기차");
		System.out.println(ev.getModel());
	}
}
