package pkg04_casting;

public class Employee {

	private String type;
	private String name;
	private String dept;
	
	public Employee(String type, String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}
	
	public String  getInfo() {
		return type + "," + name + "," + dept + ",";
		
	}
	public  int getPay() {
		return 0;
	};

}
