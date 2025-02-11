package ex4_binding;
/*
 * Product클래스 생성하기
 * 멤버변수 : 가격(price), 포인트(point)
 * 생성자 : 가격입력받고, 가격의 10%를 포인트로 저장
 */
class Product {
	int price, point;
	Product(int price) {
		this.price = price;
		this.point = price/10;
	}
}
/*
 * Tv 클래스 : Product클래스의 하위 클래스
 *   가격: 100
 *   toString() : "TV" 리턴 
 */
class Tv extends Product {
	Tv() {
		super(100);
	}
	@Override
	public String toString() {
		return "TV";
	}
}
 /* Computer 클래스 : Product클래스의 하위 클래스 
 *   가격: 200
 *   toString() : "Computer" 리턴
 */    
class Computer extends Product {
	Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
 /* HandPhone 클래스 : Product클래스의 하위 클래스 
 *   가격: 150
 *   toString() : "HandPhone" 리턴 
 */
class HandPhone extends Product {
	HandPhone() {
		super(150);
	}
	@Override
	public String toString() {
		return "HandPhone";
	}
}
/*
 * Buyer 클래스
 *  멤버변수 : money = 500, point    => 가격,포인트
 *           Product[] items = new Product[5];  //구매물품목록
 *           int cnt;                           //구매물품 갯수
 *  멤버메서드
 *     void buy(Product p) 
 *       1. p 상품의 가격을 money에서 차감
 *       2. p 상품의 포인트 만큼 Buyer의 포인트 증가
 *       3. items 에 p 제품 추가. cnt값을 증가
 *       4. p 제품의 이름 출력 : TV 구입.
 *     void summary()
 *       1. 구매제품 전체금액합계, 포인트 합계 계산
 *       2. 잔액 출력
 *       3. 구매 물품의 이름을 출력           
 */
class Buyer {
	int money = 500,point, cnt;
	Product[] items = new Product[5];
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		items[cnt++] = p;
		System.out.println(p + "구입");
	}
	void summary() {
		int totAmt=0,totPoint=0;
		String itemName = "";
		for(int i=0;i<cnt;i++) {
			totAmt += items[i].price;
			totPoint += items[i].point;
			itemName += items[i] + ",";
		}
		System.out.println("구매금액합계:" + totAmt);
		System.out.println("구매포인트합계:" + totPoint);
		System.out.println("잔액:" + money);
		System.out.println("구매물품:"+itemName);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t); //매개변수 자동형변환 
		b.buy(c);
		b.buy(h);
		b.summary();
	}
}