package test;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X         X
 X       X
  X     X 
   X   X  
    X X   
     X    
    X X   
   X   X  
  X     X 
 X       X
X         X
 
*/
public class Test17 {
	public static void main(String[] args) {
		int size = 5; // 정사각형 크기
        char[][] pattern = new char[size][size];

        // 배열 초기화
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = ' ';
            }
        }

        // X 패턴 설정
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
