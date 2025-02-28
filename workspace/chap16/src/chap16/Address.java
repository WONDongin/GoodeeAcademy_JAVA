package chap16;

public class Address {
	private String country;
	private String city;
	//생성자
	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}
	//getter
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}	
}
