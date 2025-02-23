package test;

import java.io.*;
import java.util.Scanner;
/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
*/
public class Test03 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("파일명을 입력하세요(종료:exit)");
            String site = sc.nextLine();
            // 종료 조건 (exit 입력 시 종료)
            if (site.equals("exit")) break;

            File file = new File("src/test/" + site);
            // 파일이 존재하는지 확인
            if (!file.exists()) {
                System.out.println("해당 파일 없음");
                continue;
            }

            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream("src/test/" + site + ".bak")) {

                byte[] buf = new byte[1000];//1000바이트 크기의 버퍼를 생성합니다.
                int data;
                while ((data = fis.read(buf)) != -1) {
                    fos.write(buf, 0, data);// 읽은 데이터를 fos에 씁니다.
                }
                System.out.println(site + " => " + site + ".bak 복사 완료");
            // 예외처리
            } catch (IOException e) {
                System.out.println("파일 처리 중 오류 발생: " + e.getMessage());
            }
        }

        sc.close();
	}
}
