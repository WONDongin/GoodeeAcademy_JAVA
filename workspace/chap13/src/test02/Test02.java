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
		// command 라인에서 파일명을 입력받기
		try {
		   filename = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			filename = "noname.txt";
		}
		
		FileWriter fw = new FileWriter(filename);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열 입력");
		while(true){
			String msg = br.readLine();
			if(msg.equals("exit")) break;
			fw.write(msg+"\n");
		}
		fw.close();		

	}
}

/*
io/collection - 유저 저장
"user1" : 이벤트목록(List), 4개의 컬럼 > map -> 파일의 바로저장(id.ser)
"user2" : 이벤트목록(List) 


사용자 아이디 입력 : ㅇㅇㅇ
메뉴선택 달력조회/이벤트추가,조회,변경,삭제 파일에 등록
일정
기간
내용
map

객체의 직렬화
ObjectOutputStream
ObjectInputputStream
 
보조 스트림
BufferedReader
PrintStream

Writer
FileWriter
FileOutputStream
FileReader
FileInputStream

OutputStream
Reader
InputStream

*/