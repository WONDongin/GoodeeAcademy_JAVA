package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 * FileReader, FileWriter를 이용해서 복사
 * 텍스트가 아닌 파일은 반드시 FileInput Stream, FileOutputStream 을 이용해야함.
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		
		String sourceFile = "src/test/apple.gif";  // 원본 파일
        String destinationFile = "src/test/apple2.gif";  // 복사할 파일
        
        // 파일 자동 닫기
        try (FileInputStream fis = new FileInputStream(sourceFile);//  원본 파일을 바이트 단위로 읽음
             FileOutputStream fos = new FileOutputStream(destinationFile)) { // 새로운 파일에 바이트 단위로 저장

            byte[] buffer = new byte[1024];  // 1KB 버퍼
            // bytesRead → fis.read(buf)를 호출하면 읽은 바이트 수를 반환
            int bytesRead;

            // 파일을 읽고 쓰기
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("파일 복사가 완료되었습니다: " + destinationFile);

        } catch (IOException e) {
            System.err.println("파일 복사 중 오류 발생: " + e.getMessage());
        }
	}
}
