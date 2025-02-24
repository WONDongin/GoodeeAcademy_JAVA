package ex7_other;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
File 클래스의 주요 메서드 
f1.getAbsolutePath() : 절대경로
f1.mkdir() : 하위 폴더 1개 생성, 폴더생성 성공: true 리턴, 실패: false 리턴
f1.mkdirs() : 여러개의 하위 폴더 생성
f2.createNewFile() : 파일 생성. 파일생성 성공:true 리던, 실패: false 리턴
f2.getName() : 파일의 이름
f2.length() :  파일의 크기(0바이트)
exists() : 존재여부 판단, 존재하면 true 리턴, 없는파일이면 false 리턴
f2.renameTo(f3) : f2파일의 이름을 f3이름으로 변경, 성공: true, 실패: false
lastModified() : 파일의 최종 수정시간을 밀리초로 리턴
f3.delete() : f3 파일을 삭제, 성공: true, 실패: false
*/
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성:%b\n", f1.getAbsolutePath(), f1.mkdir());
		File f2 = new File("c:/temp1/test.txt");
		
		System.out.printf("%s 파일 생성:%b\n", f2.getAbsolutePath(), f2.createNewFile());
		System.out.printf("파일 이름:%s, 파일크기:%d\n", f2.getName(), f2.length());
		
		File f3 = new File("c:/temp1/test2.txt");
		
		// exists() : 존재여부 판단
		if(f3.exists()) {
			System.out.println(f3.getName() + "파일은 존재함");
		} else {
			System.out.println(f3.getName( ) + "파일은 없음");
		}
		System.out.printf("%s->%s 이름변경:%b\n", f2.getName(), f3.getName(), f2.renameTo(f3));
		
		// lastModified() : 1970년 이후 파일수정 시간까지 밀리초
		System.out.println("파일의 최종 수정시간:" + f3.lastModified());
		
		// 파일의 최종 수정시간 : 년월일 시분초로 출력하기
		String lastday =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(f3.lastModified()));
		System.out.println("파일의 최종 수정시간:" + lastday);
		// f3.delete() : 파일삭제
		System.out.printf("%s 파일 삭제:%b\n", f3.getName(),f3.delete());
		
	}
}
