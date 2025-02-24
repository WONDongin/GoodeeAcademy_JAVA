package ex4_bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
화면에서 파일명을 입력받고, 출력을 시작할 시작라인, 출력 라인수를 입력받아서
시작라인부터 라인수까지의 내용을 화면에 출력하기
Scanner 클래스 사용하지 않기
BufferedReader 스트림 사용하기

[결과]
파일명을 입력하세요
src/ex1_iputstream/InputStreamEx1.java
시작라인
1
라인수
3
*/
public class Exam1 {
	public static void main(String[] args) throws IOException {
		
		// 사용자에게 입력받기
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		// 입력값 저장
		String filename = stdin.readLine();
		System.out.println("시작라인");
		String stl = stdin.readLine();
		System.out.println("라인수");
		String snum = stdin.readLine();
		
		// 시작라인과 라인수 정수형 변경하기
		int start = Integer.parseInt(stl); // 시작라인
		int len = Integer.parseInt(snum); // 출력할 라인
		// 파일 읽기
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String data = null;
		int line = 0, cnt = 0; // line: 라인수, cnt: 출력한 라인수		
		
		while ((data=br.readLine()) != null) {
			++line;
			if(line < start) continue;
			if(cnt >= len) break;
			++cnt;
			
			System.out.println(line + ":" + data);
		}
		br.close();
		stdin.close();
	}
}
