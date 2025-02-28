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
		// src/ex1_inputstream, src/ex3_file, src/ex6_objectstream
		File f1 = new File("src");
		
		dirSearch(f1,f1.list()); // vector객체에 FileInputStream 객체 추가
		int len;
		// 출력파일 선언.
		FileOutputStream fos = new FileOutputStream("InputStream예제.txt");
		// vecotr 객체의 모든 InputStream 객체를 연결하여 순회
		// SequenceInputStream : 여러 개의 입력스트림을 연속적으로 연결해서 하나의 스트림으로부터 데이터를 읽는 것
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
			//ex1_inputstream 폴더, 하위목록
			File f2 = new File(f,file); 
			// 폴더 여부확인
			if(f2.isDirectory()) {
				dirSearch(f2,f2.list()); // 재귀함수(‘자기 자신을 호출’하는 함수)
		    } else {
		    	// 파일이름에 InputStream 문자열 존재여부
		    	if(file.contains("InputStream"))
		    		// f2 파일을 열고 있는 FileInputStream 객체 추가
		    		vector.add(new FileInputStream(f2)); 
		    }
		}		
	}
}