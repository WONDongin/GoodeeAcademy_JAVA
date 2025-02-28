package chap16;

public class Student implements Comparable<Student>{
	String name;
	int ban, eng, math, kor;
	public Student(String name, int ban, int eng, int math, int kor) {
		super();
		this.name = name;
		this.ban = ban;
		this.eng = eng;
		this.math = math;
		this.kor = kor;
	}
	@Override
	public String toString() {
		return "Student [이름=" + name + ", 반=" + ban + ", 영어=" + eng 
				+ ", 수학=" + math + ", 국어=" + kor + ", 총점="+(eng+math+kor)+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
	

}
