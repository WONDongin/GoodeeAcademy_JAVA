package ex5_printstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
/*
p.getInputStream() : ping 외부 프로세스로 부터 Data를 읽기
new InputStreamReader(p.getInputStream, Encoding 방식) : UTF-8이 기본
=> 텍스트의 Encoding 방식 설정
*/
public class PrintStreamEx2 {
	public static void main(String[] args) throws IOException {
		String[] cmds = {"ping", "192.168.7.1"};
		// Process : 현제 실행 중인 프로세스
		Process p = Runtime.getRuntime().exec(cmds);
		// EUC-KR : 2byte로 한글을 표한한 인코딩 방식 설정
		Reader r = new InputStreamReader(p.getInputStream(), "EUC-KR");
		int data = 0;
		
		PrintStream ps = new PrintStream(new FileOutputStream("ping.txt"));
		while ((data=r.read()) != -1) {
			// 2byte로 표출
			ps.print((char) data);
			System.out.print((char) data);
		}
	}
}
