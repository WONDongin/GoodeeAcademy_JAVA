package pkg05_polymorphism;

public class ParkingLot {
	
	private Car[] carList = new Car[3];
	private int count;
	
	
	public void in(Car car) { // Car car = new EV()
		if(count == carList.length) {
			System.out.println("만차");
			return;
		}
		
		carList[count] = car;
		count++;
		
		car.parking();
	}
	
	
}
