package pkg04_casting;

public class MainClass {
	public static void main(String[] args) {
		
		// 업 캐스팅 : 자식 객체를 부모 타입으로 바꿀 수 있다.
		
		Car  ev =  new Ev();
		Car  fuelCar = new FuelCAR();
		
		// 부모 클래스가 가진 메소드만 호출할 수 있다.
		ev.forward();
		ev.reverse();
		fuelCar.forward();
		fuelCar.reverse();
		
		// 다운캐스팅 : 부모 타입의 객체를 자식 타입으로 바꿀 수 있다.
		((Ev)ev).chargin();
		((FuelCAR)fuelCar).addFuel();
		
		// 타입 확인 연산자 : istanceof 연산자
		if(ev instanceof Ev) {
			((Ev) ev).chargin();
		}
		if (fuelCar instanceof FuelCAR) {
			((FuelCAR) fuelCar).addFuel();
		}
	}
}
