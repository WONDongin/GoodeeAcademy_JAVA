package chap16;

public class Member {
	private String name;
	private String id;
	private Address address;
	//생성자
	public Member(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	

}
