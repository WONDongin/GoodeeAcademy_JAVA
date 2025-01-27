package pkg03_override;

public class Car {
	
	private String model;
	
	public Car(String model) {
		this.model = model;
	}
	
	public void forward() {
		System.out.println("앞으로");
	}
	
	public void reverse() {
		System.out.println("뒤로");
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
