package pkg04_casting;

public class FormalEmployee extends Employee{
	
	private int empNo;
	private int salary;
	
	public FormalEmployee(String name, String dept, int empNo, int salary ) {
		super("정규직", name, dept);
		this.empNo = empNo;
		this.salary = salary;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + empNo + ","+ salary;
	}
	
	@Override
	public int getPay() {
		return salary / 12;
	}
}
