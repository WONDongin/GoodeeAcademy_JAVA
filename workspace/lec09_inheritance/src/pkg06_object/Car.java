package pkg06_object;

import java.util.Objects;

public class Car {
	
	// extends 키워드가 없는 클래스는 모두 자동으로 object 클래스를 상속 받는다.
	
	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// 2. Object 클래스의 toString() 메소드 오버라이드
	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

	// 3. Object 클래스의 equals() 메소드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model);
	}
	
	
	
	

}
