package pkg04_casting;

public class InformalEmployee extends Employee {
	private int primaryPay;
	
	public InformalEmployee(String name, String dept, int primaryPay ) {
		super("정규직", name, dept);
		this.primaryPay = primaryPay;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + primaryPay;
	}
	@Override
	public int getPay() {
		return primaryPay;
	}
}
