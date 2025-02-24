package ex7_other;

import java.io.File;

/*
c:/windows 폴더의 하위 폴더의 갯수와 파일의 갯수, 파일의 총크기를 출력하기 
*/
public class Exam1 {
	public static void main(String[] args) {
		File f1 = new File("c:/Windows");		
		String[] files = f1.list();
		
		int dfnt = 0, fcnt = 0;
		long size = 0;
		
		for(String f : files) {
			File f2 = new File(f1, f);
			
			if(f2.isFile()) {
				fcnt++;
				size += f2.length();
			} else {
				dfnt++;
			}
		}
		
		System.out.printf("하위 폴더의 갯수: %d\n하위 파일의 갯수: %d\n파일의 총 크기: %,d(byte)", dfnt, fcnt, size);
	}
}
