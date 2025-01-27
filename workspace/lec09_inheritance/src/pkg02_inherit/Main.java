package pkg02_inherit;

public class Main {
	public static void main(String[] args) {
		Ev ev = new Ev("전기차", 50);
		
		System.out.println(ev.getModel());
		System.out.println(ev.getBattery());
		
	}
}
