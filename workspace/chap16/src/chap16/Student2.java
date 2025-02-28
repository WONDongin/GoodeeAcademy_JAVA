package chap16;
/*
 * enum : 열거형. 범위 내의 값만 사용가능
 */
public class Student2 {
	public enum Gender {MALE,FEMALE};
	public enum City {Seoul, Busan};
	private String name;
	private int score;
	private Gender gender;
	private City city;
	public Student2(String name, int score, Gender gender, City city) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
		
	}
	public Student2(String name, int score, Gender gender) {
		this(name,score,gender,null);
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public Gender getGender() {
		return gender;
	}
	public City getCity() {
		return city;
	}
	


}
