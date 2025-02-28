package ex4_map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * product.txt 파일 생성
 */
class Car{
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;
	public Car() {}
	public Car(int month, int con, String car, int qty, String remark) {
		super();
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}
	public int getMonth() {
		return month;
	}
	public int getCon() {
		return con;
	}
	public String getCar() {
		return car;
	}
	public int getQty() {
		return qty;
	}
	public String getRemark() {
		return remark;
	}
	@Override
	public String toString() {
		return "[month=" + month + ", con=" + con + ", car=" + car +
				", qty=" + qty + ", remark=" + remark + "]";
	}
}
public class MapEx2_product {
	static String carName = "BMW";
	static int con =1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		//br.lines : 텍스트 파일의 내용을 한줄씩 Stream으로 생성. 파일에서 Stream 객체로 생성
		// Stream<String> br.lines()
		//한개의 요소 : 4,3,BMW,4, 몰라요
		/*Car 클래스
		 * month 필드 : 4 => 월
		 * con 필드	 : 3 => 1.생산, 2:판매, 3:반품
		 * car 필드 	 : BMW => 자동차 이름
		 * qty 필드 	 : 4 =>수량
		 * reamrk 필드: 몰라요 => 반품 사유. 상태값(con의 값)이 3인 경우만
		 */
		/*
		 * br.lines().map(Function String,Car) => Stream<String> => Stream<Car> 변경
		 */
		br.lines().map(s ->{
			String str[] = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			} catch (ArrayIndexOutOfBoundsException e) {
				temp ="";}
			return new Car(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]), str[2],
					Integer.parseInt(str[3]),temp);
		}) // =>Stream<Car> 변경
		//BMW의 생산 목록 Stream으로 리턴
		.filter(s ->s.getCar().equals(carName)&&s.getCon() ==con)
		.forEach(s -> System.out.println(s));
	}
}
