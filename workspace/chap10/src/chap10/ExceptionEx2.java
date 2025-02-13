package chap10;
/*
3/0 : 예외발생 -> 1256
catch 블럭 : try 블럭 내부에서 예외발생시에 실행되는 영역

다중 catch
- 한개의 try 블럭에 여러개의 catch 블럭 존재 => try 블럭에서 발생되는 예외가 여러 종류인 경우 예외별 예외처리가 가능.
- 상위 예외클래스(Exception)은 catch 들 중 하단에 배치해야 함.(순서 중요)

RuntimeException : 예외처리 생략가능 (Exception)
그 외의 Exception : 예외처리 생략불가 ( try [catch] [finally] )

예외 클래스 계층
Throwable - Error
				  - Exception(예외클래스의 최상단) - RuntimeException -> 예외처리가 생략 가능
				                                                 - 그 외 Exception -> 예외처리 생략 불가
NulPointerException
NumberFormatException
ArrayIndexOutOfBoundsException
ArithmeticException

*/
public class ExceptionEx2 {
	public static void main(String[] args) {
		// System.out.println(1/0); // ArithmeticException 예외발생 -> 오류메일 표시x
		try {
			String str = null; // 객체 x
			System.out.println(str.trim()); // NulPointerException 예외발생
			System.out.println(Integer.parseInt("abc")); // NumberFormatException 예외발생
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException 예외발생
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0); // ArithmeticException 예외발생
			System.out.print(4);
			
		// 순서가 있다. 자손클래스 부터
		} catch (ArithmeticException e) { // 예외발생시에만 실행되는 영역
			System.out.print(5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요.");
		// RuntimeException 제일 마지막
		} catch (Exception e) {
			System.out.println("프로그램 오류 입니다. 전산부로 연락하세요");
		}
		
		System.out.println(6);
	}
}



