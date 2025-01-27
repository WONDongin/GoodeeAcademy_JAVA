package pkg03_override;

public class MainClass {
	public static void main(String[] args) {
		// EV 객체 생성
		Ev ev = new Ev("전기차", 50);
		
		ev.forward();
		ev.reverse();
	}
}

