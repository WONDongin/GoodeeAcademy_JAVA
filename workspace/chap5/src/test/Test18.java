package test;

import java.util.Scanner;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X□■□■□■□■□X
□X□■□■□■□X□
■□X□■□■□X□■
□■□X□■□X□■□
■□■□X□X□■□■
□■□■□X□■□■□
■□■□X□X□■□■
□■□X□■□X□■□
■□X□■□■□X□■
□X□■□■□■□X□
X□■□■□■□■□X

■ : ㅁ 한자
□ : ㅁ 한자
*/
public class Test18 {
	public static void main(String[] args) {
		
		// 사용자 입력받기
		System.out.println("홀수만 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
				
		int size = num;
        char[][] grid = new char[size][size];

        // 배열 초기화 및 패턴 적용
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            	/*
            	 	X---------X
            	 	-X-------X-
            	 	--X-----X--
            	 	---X---X---
            	 	----X-X----
            	 	------X-----
            	 	
            	 	i == j : 왼쪽 위 -> 오른쪽 아래 대각선(\방향)
            	 	 - x좌표 : (0,0)(1,1)(2,2)...
            	 	
            	 	i + j == size - 1: 오른쪽 위 -> 왼쪽 아래 대각선(/방형)
            	 	 - y좌표 : (0,10)(1,9)(2,8)...
            	 */
                if (i == j || i + j == size - 1) {  
                    grid[i][j] = 'X';  
                } else if ((i + j) % 2 == 0) {  
                	// 짝수인 경우 (0,2)(1,3)(2,0)(3,4)
                    grid[i][j] = '■';  
                } else {
                	// 홀수인 경우 (0,1)(1,0)(2,3)(3,2)
                    grid[i][j] = '□'; 
                }
            }
        }

        // 배열 출력
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
	}
}
