package test;
/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 * 
 * [결과]
   90   80   70  240
   95   85   75  255
   70   80   75  225
   75   70   85  230
   70   75   80  225
  400  390  385 1175
 */
public class Test15 {
	public static void main(String[] args) {
		// 5x3 배열 (5행 , 3열)
		int[][] score = {
                {90, 80, 70},
                {95, 85, 75},
                {70, 80, 75},
                {75, 70, 85},
                {70, 75, 80}
        };
		
		// result 배열 선언
        int rows = score.length; // 헹의 개수
        int cols = score[0].length; // 열의 개수
        // 기존보다 +1 배열생성
        int[][] result = new int[rows + 1][cols + 1];
        //[scor.length + 1]

        // score = result 배열복사
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
            	// 배열복사
                result[i][j] = score[i][j];
                // 행 총합
                rowSum += score[i][j];
            }
            // 각 행의 마지막 열에 저장
            result[i][cols] = rowSum; 
            // [score[i].length]
        }

        // 열 합 계산
        for (int j = 0; j < cols + 1; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += result[i][j];
            }
            result[rows][j] = colSum; 
        }

        // result 배열 출력
        for (int i = 0; i < rows + 1; i++) {
        						// [score[i] +1 ]
            for (int j = 0; j < cols + 1; j++) {
                System.out.printf("%4d ", result[i][j]);
            }
            System.out.println();
        }
		
	}
}
