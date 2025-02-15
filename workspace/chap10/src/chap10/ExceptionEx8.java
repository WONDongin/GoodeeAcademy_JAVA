package chap10;
/*
사용자 예외 클래스 생성하기 
*/
class LoginFailException extends Exception{
	LoginFailException(String msg) {
		super(msg);
	}
}

class LoginFailException2 extends RuntimeException{ // 예외처리 하지마라.
		LoginFailException2(String msg) {
		super(msg);
	}
}

public class ExceptionEx8 {
	public static void main(String[] args) {
		String id = "hong";
		String pw = "1234";
		/*
		try {
			if(!id.equals("hong") || !pw.equals("1234")){
				throw new LoginFailException("아이디나 비밀번호 오류 입니다."); // 정상실행 중단
			}
			System.out.println("반갑습니다. hong님.");
		} catch (LoginFailException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		//LoginFailException2 예외처리 안하도록 객체 생성하기
		if(!id.equals("hong") || !pw.equals("1234")){
			throw new LoginFailException2("아이디나 비밀번호 오류 입니다."); // 정상실행 중단
		}
		System.out.println("반갑습니다. hong님.");
		
	}
}
