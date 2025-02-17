package test;
import java.util.*;
/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답

 *  NumberInputException을 이용하여 다음의 예외 처리를 할것  
 *  4자리 수가 아닌 경우는 4자리 숫자를 입력하세요. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨 
 *  중복된 숫자가 입력된 경우 중복된 숫자가 입력되었습니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *  InputMismetchException을 이용하여 예외처리
 *  만약 숫자 아닌 값이 입력되면 숫자만 가능합니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *    
 *  [결과]
서로다른 4자리 정수를 입력하세요
1234
1234:0스트라이크, 1볼
서로다른 4자리 정수를 입력하세요
5678
5678:2스트라이크, 0볼
서로다른 4자리 정수를 입력하세요
2679
2679정답입니다.
3번 만에 맞추셨습니다. 게임을 종료합니다.
 */
// 예외 처리 필수 예외 객체
class NumberInputExceptions extends Exception {
    public NumberInputExceptions(String message) {
        super(message);
    }
}

public class Test04 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        List<Integer> targetNumbers = generateUniqueNumbers();
        int attempts = 0;
        
        while (true) {
            try {
                System.out.print("서로 다른 4자리 정수를 입력하세요: ");
                String input = scanner.next();
                validateInput(input);
                List<Integer> userNumbers = convertToList(input);
                attempts++;
                
                int strike = 0, ball = 0;
                for (int i = 0; i < 4; i++) {
                    if (userNumbers.get(i).equals(targetNumbers.get(i))) {
                        strike++;
                    } else if (targetNumbers.contains(userNumbers.get(i))) {
                        ball++;
                    }
                }
                
                if (strike == 4) {
                    System.out.println(input + " 정답입니다.");
                    System.out.println(attempts + "번 만에 맞추셨습니다. 게임을 종료합니다.");
                    break;
                } else {
                    System.out.println(input + ": " + strike + "스트라이크, " + ball + "볼");
                }
            } catch (NumberInputExceptions e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
    
    private static List<Integer> generateUniqueNumbers() {
        Random random = new Random();
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        while (uniqueNumbers.size() < 4) {
            uniqueNumbers.add(random.nextInt(10));
        }
        return new ArrayList<>(uniqueNumbers);
    }
    
    private static void validateInput(String input) throws NumberInputExceptions {
        if (!input.matches("\\d{4}")) {
            throw new NumberInputExceptions("4자리 숫자를 입력하세요.");
        }
        if (new HashSet<>(convertToList(input)).size() < 4) {
            throw new NumberInputExceptions("중복된 숫자가 입력되었습니다.");
        }
    }
    
    private static List<Integer> convertToList(String input) {
        List<Integer> numbers = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            numbers.add(Character.getNumericValue(ch));
        }
        return numbers;
    }
}