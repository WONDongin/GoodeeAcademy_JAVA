package pkg04_custom_exception;

// 예외 클래스
public class MyException extends Exception {
	
	private int errorCode;
	
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
