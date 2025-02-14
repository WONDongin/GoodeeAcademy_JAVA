package chap10;
/*
정상처리 : 12356
2/0 오류 : 1456
 
 정상 return       : 1235
 2/0 오류 return : 145
 
 finally 블럭 :  try 블럭에서 정상처리/예외발생 모두 실행 되는 블럭
 					중간에 return 이 실행되도 반드시 실행되는 영역
*/
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0);
			System.out.print(3);
			// return; // 메서드 종료
		} catch (Exception e) {
			System.out.print(4);
			return;
		} finally {
			System.out.print(5);
		}
		System.out.print(6);
	}
}
