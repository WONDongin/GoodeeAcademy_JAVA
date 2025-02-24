package ex7_other;

import java.io.*;
import java.util.*;

public class SequenceStreamEx1 {
    public static void main(String[] args) {
        File f = new File("src/ex7_other");
        String[] files = f.list();

        if (files == null) {
            System.out.println("디렉터리가 존재하지 않거나 파일이 없습니다.");
            return;
        }

        Vector<InputStream> v = new Vector<>();
        for (String file : files) {
            File f2 = new File(f, file);
            if (f2.isFile()) {
                try {
                    v.add(new FileInputStream(f2));
                } catch (FileNotFoundException e) {
                    System.out.println("파일을 찾을 수 없습니다: " + file);
                }
            }
        }

        if (v.isEmpty()) {
            System.out.println("연결할 파일이 없습니다.");
            return;
        }

        try (SequenceInputStream s = new SequenceInputStream(v.elements());
             FileOutputStream fos = new FileOutputStream("File예제.txt")) {

            byte[] buf = new byte[8096];
            int data;
            while ((data = s.read(buf)) != -1) {
                fos.write(buf, 0, data);
            }

            fos.flush();
            System.out.println("파일 병합 완료: File예제.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

