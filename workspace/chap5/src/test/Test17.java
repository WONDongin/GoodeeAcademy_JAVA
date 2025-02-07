package test;

import java.util.Scanner;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X         X  : 0 10 => 10
 X       X   : 1  9  => 10
  X     X    : 2  8  => 10
   X   X  
    X X   
     X    
    X X   
   X   X  
  X     X 
 X       X
X         X  : 10 0 => 10
 
*/
public class Test17 {
	public static void main(String[] args) {
		
		// 사용자 입력받기
		System.out.println("홀수만 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int size = num; // 정사각형 크기
        char[][] pattern = new char[size][size];

        // 배열 초기화
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = ' ';
            }
        }

        // X 패턴 설정 (row값 : 홀수)
        for (int i = 0; i < size; i++) {
            pattern[i][i] = 'X';
            pattern[i][size - 1 - i] = 'X';
        }

        // 패턴 출력
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
	}
}
