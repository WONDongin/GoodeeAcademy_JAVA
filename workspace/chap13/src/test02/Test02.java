package test02;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * command 라인에서 파일명을 입력받기 : args[0]
 * args값이 없으면 noname.txt 파일 설정하기
 * 키보드에서 받은 입력된 내용을 설정된 파일에 저장하기
 * "exit"문자열이 입력되면 파일 저장을 끝내고 프로그램이 종료됨.
 * Scanner 사용하지 않기
 * 
 * [결과]
 * "file명" 에 저장할 내용을 입력하세요
 * 안녕하세요.
 * Hello
 * exit
 * 
 * "file명"내용
 * 안녕하세요.
 * Hello
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		String filename = null;
		try {
		   filename = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			filename = "noname.txt";
		}
		FileWriter fw = new FileWriter(filename);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("문자열 입력");
		while(true){
			String msg = br.readLine();
			if(msg.equals("exit")) break;
			fw.write(msg+"\n");
		}
		fw.close();		

	}
}