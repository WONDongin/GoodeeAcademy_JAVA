package ex1_is_a;

public class Phone extends Object {
	boolean power;
	int number;
	
	void power() {
		power =! power;
		// power = !false(ture)
	}
	
	void send() {
		if(power) {
			System.out.println("전화걸기");
		} else {
			System.out.println("전원이 꺼져 있습니다.");
		}
	}
	
	void receive() {
		if(power) {
			System.out.println("전화받기");
		} else {
			System.out.println("전원이 꺼져 있습니다.");
		}
	}
	
}
