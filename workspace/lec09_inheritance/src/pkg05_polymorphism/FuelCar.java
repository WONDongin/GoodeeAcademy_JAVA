package pkg05_polymorphism;

public class FuelCar extends Car{
	@Override
	public void parking() {
		System.out.println("연료차 주차");
	}
}
