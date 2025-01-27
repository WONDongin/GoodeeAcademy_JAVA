package pkg05_polymorphism;

public class MainClass {
	public static void main(String[] args) {
		
		//ParkingLot 객체 생성
		ParkingLot parkingLot = new ParkingLot();
		
		parkingLot.in(new EV());
		parkingLot.in(new EV());
		parkingLot.in(new FuelCar());
		parkingLot.in(new FuelCar());
	}
}
