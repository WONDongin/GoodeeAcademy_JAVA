package ex5_printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
예외발생한 내용을 error.log 파일에 PrintStream을 이용하여 출력하기 
[결과] 파일의 내용
2025-02-24- 10:29:00 => For input string: "a"
*/
public class Exam1 {
	public static void main(String[] args) throws FileNotFoundException {
		// error.log 파일생성
		PrintStream ps = new PrintStream (new FileOutputStream("error.log", true));
					
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
			
		} catch (Exception e) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ps.println( sf.format(new Date()) + "=>" + e.getMessage());
		 
			System.out.println(e.getMessage()); // 이 내용을 error.log에 출력하기
			e.printStackTrace(ps); // ps의 목적지로 데이터 전송
		} finally {
			ps.close();
		}
	}
}
