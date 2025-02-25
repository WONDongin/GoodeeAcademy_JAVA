package test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
src/폴더 하위 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을  
InputStream예제.txt  파일 하나에 저장 하기
InputStream 관련 모든 소스 : XXXInputStreamXXX.java
*/
public class Test01 {
	static Vector<InputStream> vector = new Vector();

	public static void main(String[] args) throws IOException {
		System.out.println("프로그램 시작");
		//src/ex1_inputstream,  src/ex3_file, src/ex6_objectstream
		File f1 = new File("src");
		dirSearch(f1,f1.list()); //vector 객체에 FileInputStream 객체 추가 기능
		int len;
		//출력파일 선언.
		FileOutputStream fos = new FileOutputStream("InputStream예제.txt");
		//vector 객체의 모든 InputStream 객체를 연결하여 순회
		SequenceInputStream sis = new SequenceInputStream(vector.elements());
		byte[] buf = new byte[1024]; //1K
		while((len=sis.read(buf)) != -1) {
			fos.write(buf,0,len);
	    }
		fos.flush();
		fos.close();
		sis.close();
		System.out.println("프로그램 종료");
    }
	private static void dirSearch(File f,String[] dir) throws IOException {
		for(String file : dir) {
			File f2 = new File(f,file); //ex3_.... 폴더
			if(f2.isDirectory()) { //폴더. 
				dirSearch(f2,f2.list()); //재귀함수.  ex1_inputstream 폴더, 하위목록
		    } else {
		    	if(file.contains("InputStream")) //파일이름에 InputStream 문자열 존재?
		    		//f2 파일을 열고 있는 FileInputStream 객체 추가
		    	   vector.add(new FileInputStream(f2)); 
		    }
		}		
	}
}
