package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.궁합음식의 키를 입력받아 해당되는 음식을 출력하기. 
  종료가 입력될때 까지 계속 출력하기
2.종료 입력시 등록된 내용 출력하기
  등록된음식 :
    떡볶이 : 오뎅
    짜장면 : 단무지
3. 등록이 안된경우 
   등록여부를 입력받아, 등록하는 경우 궁합음식을 입력받기  
   등록하시겠습니까(y)? 
     y입력 : foods객체에 추가.
            궁합음식 입력받아서 foods에 추가함
     y가아닌경우 :
            음식을 다시 입력하기   

[결과]
음식명을 입력하세요(종료:종료)
떡볶이
떡볶이의 궁합음식:오뎅
음식명을 입력하세요(종료:종료)
치킨
치킨의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?
y
치킨의 궁합음식을 등록하세요
맥주
음식명을 입력하세요(종료:종료)
종료
{치킨=맥주, 떡볶이=오뎅, 라면=김치}
*/
public class Test05 {
	public static void main(String[] args) {
		Map<String, String> food = new HashMap<String, String>();
		food.put("떡볶기", "오뎅");
		food.put("짜장면", "단무지");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("음식을 입력하세요: ");
		
		while (true) {
			String menu = sc.nextLine();
			
			if(menu.equals("종료")){
				System.out.print("등록된 궁합:");
				for(String k : food.keySet()) System.out.print(k + "="+food.get(k) + ",");
				System.out.println();
				break;
			}
			
			String key = food.get(menu);
			
			if(key == null) {
				System.out.println(menu + "의 궁합음식이 등록되지 않았습니다. 등록하시겠습니까? (Y)");
				String yn = sc.next();
				if(yn.equalsIgnoreCase("Y")) {
					System.out.println(menu + "의 궁합음식을 등록하세요.");
					key = sc.next();
					food.put(menu, key);
				} else continue;
			}	
		}
	}
}
