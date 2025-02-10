package ex7_init;
/*
 	[초기화 블럭 예제]
 	static 초기화 블럭 : 클래스 변수의 초기화 담당.
 	- 클래스 정보가 로드시 한번만 실행됨
 	- main 메서드 보다 먼저 실행됨
 	
 	인스턴스 초기화 블럭 : 인스턴스 변수의 초기화 담당. 생성자와 기능이 겹침
 	- 객체화시 생성자 호출전에 실행됨
 	
 	추상화 : 클래스 생성의 과정. 사용자정의 자료형이다.
 	- 변수(속성, 명사적인 특징)
 	 1) 클래스 변수(static) : 클래스 정보 로드시 메모리 할당. 모든 객체의 공유 변수
 	 2) 인스턴스 변수(객체변수) : 객체화시 메모리할당. 객체별로 다른 메모리 영역을 할당
 	 
 	- 메서드(기능, 동사적인 특징)
 	1) 클래스 메서드(static) : 클래스 정보 로드시 메서드 실행 준비 완료.
 	2) 인스턴스 메서드 : 객체화시 메서드 실행 준비 완료
 	
 	클래스 멤버 : 클래스 변수 + 클래스 메서드
 	인스턴스 멤버 : 인스턴스 변수 + 인스턴스 메서드 + 생성자
 	주의 : 클래스 멤버에서 인스턴스 멤버 호출시 객체화 필요
 	
 	생성자 : 객체화시 호출되는 메서드. 인스턴스 메서드. (this 사용가능)
 	
 	this : 자기 참조변수. 인스턴스 메서드에서만 사용이 가능.
 	this() : 생성자. 같은 클래스 내의 다른 생성자 호출 사용.
 	
 	오버로딩 : 같은 클래스내에 이름은 같고, 매개변수가 다른 메서드가 여러개 존재 가능
 	- 메서드의 다형성.
 	
 	상속
 	캡슐화
 	다형성
 */
public class InitEx01 {
	static int cv;
	int iv;
	
	public InitEx01() {
		System.out.println("5. 생성자 호출됨");
	}
	
	static {
		cv = (int) (Math.random() * 100);
		System.out.println("1.static 초기화 블럭 실행 : cv=" + cv);
	}
	{
		iv = (int) (Math.random() * 100);
		System.out.println("4.인스턴스 초기화 블럭 실행 : cv=" + iv);
	}
	
	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main 메서드 init1 객체 생성");
		InitEx01 init1 = new InitEx01();
		System.out.println("3. main 메서드 init2 객체 생성");
		InitEx01 init2 = new InitEx01();
		
		// cv, iv값을 화면 출력하기
		System.out.println(cv);
		System.out.println(init1.iv);
		System.out.println(init2.iv);
	}
}
