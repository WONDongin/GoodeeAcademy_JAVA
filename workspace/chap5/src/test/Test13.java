package test;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
int num = Integer.parseInt(args[0]);
[결과]
10의 약수 : 1,2,5,10,
*/
public class Test13 {
	public static void main(String[] args) {

		if (args.length == 0) {
            System.out.println("숫자를 입력하세요.");
            return;
        }
		
		/* 
		 	Integer : 
		 	- 매개변수로 객체를 필요로 할 때
			- 기본형 값이 아닌 객체로 저장해야할 때
			- 객채 간 비교가 필요할 때
		*/
        int num = Integer.parseInt(args[0]);
        // parseInt() : 타입이 String(문자열) -> int(정수) 로 변환(예외 처리 없음)
        
        System.out.print(num + "의 약수 : ");
        
        for (int i = 1; i <= num; i++) {
        	// num % i == 0 : 약수
            if (num % i == 0) {
                System.out.print(i);
                if (i != num) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();		
	}
}
