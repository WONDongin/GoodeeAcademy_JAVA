package test;
/*
시스템과 주사위 숫자 비교하기
시스템의 주사위 값을 저장하고,
사용자의 주사위 값도 임의의값으로  시스템의 값과 비교하여, 
시스템의 주사위 값이 크면 시스템 승리
사용자의 주사위 값이 크면 사용자 승리
시스템과 사용자의 주사위값이 같으면 동점입니다.
랜덤

[결과]
시스템 주사위값 :3,사용자 주사위값:5=>사용자 승리.   
*/
public class Test04 {
	public static void main(String[] args) {
		int men = (int) (Math.random() * 6) + 1;
		
		switch (men) {
			case 1 : System.out.print("사용자 주사위값: 1");break;
			case 2: System.out.print("사용자 주사위값: 2");break;
			case 3: System.out.print("사용자 주사위값: 3");break;
			case 4: System.out.print("사용자 주사위값: 4");break;
			case 5: System.out.print("사용자 주사위값: 5");break;
			case 6: System.out.print("사용자 주사위값: 6");break;
		}
		
		int ai = (int) (Math.random() * 6) + 1;
		
		switch (ai) {
			case 1 : System.out.print("시스템 주사위값: 1");break;
			case 2: System.out.print("시스템 주사위값: 2");break;
			case 3: System.out.print("시스템 주사위값: 3");break;
			case 4: System.out.print("시스템 주사위값: 4");break;
			case 5: System.out.print("시스템 주사위값: 5");break;
			case 6: System.out.print("시스템 주사위값: 6");break;
		}
		
		switch (ai) {
			case 1 : if(men > ai) {System.out.println(" => 사용자 승리");}
							if(men < ai) {System.out.println(" => 사용자 패배");}
							break;
			case 2 : if(men > ai) {System.out.println(" => 사용자 승리");}
							if(men < ai) {System.out.println(" => 사용자 패배");}
							break;
			case 3 : if(men > ai) {System.out.println(" => 사용자 승리");}
							if(men < ai) {System.out.println(" => 사용자 패배");}
							break;
			case 4 : if(men > ai) {System.out.println(" => 사용자 승리");}
							if(men < ai) {System.out.println(" => 사용자 패배");}
							break;
			case 5 : if(men > ai) {System.out.println(" => 사용자 승리");}
							if(men < ai) {System.out.println(" =>사용자 패배");}
							break;
			case 6 : if(men > ai) {System.out.println(" => 사용자 승리");}
							if(men < ai) {System.out.println(" => 사용자 패배");}
							break;
		}
		
		
	}
}
