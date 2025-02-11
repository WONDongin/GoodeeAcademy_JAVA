package test2;
/*
1. Food 클래스
   멤버 변수 : 가격(price)과 포인트(point)
   생성자 : 식품의 객체 생성시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
   식품의 종류는 과일(Fruit),음료(Drink),과자(Snack)로 나눠 진다.
   Fruit 클래스 : Food 클래스의 하위 클래스
   Drink 클래스 : Food 클래스의 하위 클래스
   Snack 클래스 : Food 클래스의 하위 클래스
   과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다
   과일의 종류로는 사과(Apple),복숭아(Peach),
   음료의 종류로는 콜라(Cock) 와 사이다(Sidar)
   과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie) 가 있다.
   사과,복숭아, 콜라, 사이다,비스킷,쿠키 클래스에 toString() 메서드를 구현하고
   각각의 이름을 리턴한다.
 */

/*
 * 2. Buyer 클래스
 *   멤버변수 : 돈(money)=10000, 포인트(point), 구매건수(cnt)
 *            장바구니(cart) = new Food[10]
 *   멤버메서드
 *     buy(Food) :
 *       소유 금액보다 물품값이 큰경우 "잔액부족"메세지 출력하고 메서드 종료
 *       물건 구매시 보유금액에서 물품가격만큼 차감
 *       물품의 포인트 만큼 포인트 증가.
 *       물품의 물품명과 가격을 화면에 출력.
 *       해당 물품은 장바구니에 추가. 구매건수 1 증가
 *     summary() :
 *       장바구니를 조회하여 구매한 물품의 목록과 총 가격과 현재 포인트를 출력하기.
 *       과일의 갯수,과일 구매 금액,과일 구매 목록
 *       음료의 갯수,음료 구매 금액,음료 구매 목록  
 *       과자의 갯수,과자 구매 금액,과자 구매 목록 출력하기  
 */
/*
  [결과]
사과를(을) 1000가격에 구입
10.5당도 상품 구매
복숭아를(을) 1000가격에 구입
13.5당도 상품 구매
콜라를(을) 500가격에 구입
500ml 상품 구매
사이다를(을) 1500가격에 구입
1000ml 상품 구매
비스킷구매시 잔액부족
쿠키를(을) 500가격에 구입
5000g 상품 구매
고객 잔액:5500
고객 포인트:450
총 구매금액 : 4500
총 구매목록 : 사과,복숭아,콜라,사이다,쿠키,
과일 구매금액 : 2000, 과일 구매목록 : 사과,복숭아,
음료 구매금액 : 2000, 음료 구매목록 : 콜라,사이다,
과자 구매금액 : 500, 과자 구매목록 : 쿠키,
 */
public class Test01 {
	public static void main(String ... args) {
		Apple apple = new Apple(1000,10.5);//가격, 당도(brix)
		Peach peach = new Peach(1000,13.5);//가격, 당도(brix)
		Cock cock = new Cock(500,500);   //가격, 용량(ml)
		Sidar sidar = new Sidar(1500,1000);//가격, 용량(ml)
		Biscuit bis = new Biscuit(10000,500);//가격, 무게(gram)
		Cookie cookie = new Cookie(500,5000);//가격, 무게(gram)
		
		Buyer b = new Buyer();
		b.buy(apple);		b.buy(peach);
		b.buy(cock);		b.buy(sidar);
		b.buy(bis);  		b.buy(cookie);
		System.out.println("고객 잔액:" + b.money);
		System.out.println("고객 포인트:" + b.point);
		b.summary();
	}
}
