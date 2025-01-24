package pkg02_this;

public class MainClass {
	public static void main(String[] args) {
		// 객체 생성
		Avatar avatar = new Avatar();
		// 객체 확인
		System.out.println(avatar);
		// this 확인
		avatar.method();
		
		//setName 호출
		avatar.setName("뽀로로");
		
		// leveUp 호출
		avatar.levelUp().levelUp().levelUp();
		System.out.println(avatar.level);
	}
}
