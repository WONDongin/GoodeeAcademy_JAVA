package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("파일명을 입력하세요: ");
            String name = sc.nextLine();            

            File file = new File("src/test/" + name + ".java");
            if (!file.exists()) {
                System.out.println("해당 파일 없음");
                continue;  // 사용자에게 다시 입력할 기회를 줌
            }

            try (FileInputStream fis = new FileInputStream(file);
                 InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                 BufferedReader br = new BufferedReader(isr)) {

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("파일을 읽는 도중 오류 발생: " + e.getMessage());
            }
            sc.close();
        }
       
	}
}
