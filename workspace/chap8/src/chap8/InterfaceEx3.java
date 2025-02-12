package chap8;
/*
interface 를 매개변수로 사용하기
*/

class Unit{
	int hp;
	final int MAX;
	Unit(int hp){
		this.hp = hp;
		MAX = hp;
	}
}
interface Repairable{}

// Tank
class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	};
	@Override
	public String toString() {
		return "Tank";
	}
}
// Marine
class Marine extends Unit{
	Marine(){
		super(150);
	};
	@Override
	public String toString() {
		return "Marine";
	}
}
// SCV
class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	};
	void repair(Repairable r) {
		if(r instanceof Unit) {
			((Unit)r).hp = ((Unit)r).MAX;
			System.out.println(r.toString() + "수리완료");
		}
	}
	public String toString() {
		return "SCV";
	}
}

public class InterfaceEx3 {
	public static void main(String[] args) {
		Tank t = new Tank();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		// s.repair(m);
		s.repair(s);
	}
}
