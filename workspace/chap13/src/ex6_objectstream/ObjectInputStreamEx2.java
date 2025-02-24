package ex6_objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
object2.ser 파일에서 객체를 읽어서 화면 출력하기 
*/
public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		
		UserInfo u1 = (User) ois.readObject();
		UserInfo u2 = (User) ois.readObject();
		System.out.println(u1.toString());
		System.out.println(u2.toString());
	}
}
/*
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