package ex4_bufferedreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
BufferedReader 보조스트림
보조스트림이란?
1. 기존의 스트림에 새로운 기능 추가
2. 객체 생성시 다른 스트림을 생성자의 매개변수로 받는다.
3. BufferedReader의 생성자 : new BufferedReader(Reader)

화면에서 한줄씩 입력받아서 bufferd.txt 파일에 저장하기
String readLine() : 한줄씩 읽기
*/
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		// br: 키보드에서 입력된 내용을 한줄씩 읽기 가능.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요. 종료(ctrl-z)");
		
		char[] buf = new char[8000];
		
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		
		while ((data=br.readLine()) != null) {
			System.out.println(data);
			fw.write(data + "\n");
		}
		fw.flush(); fw.close(); br.close();
	}
}
