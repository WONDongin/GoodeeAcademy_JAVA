package test;

import java.util.Scanner;
/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test09 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        String number = scanner.nextLine();

        if (isPalindrome(number)) {
            System.out.println(number + "은 대칭수입니다.");
        } else {
            System.out.println(number + "은 대칭수가 아닙니다.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String number) {
        String reversed = new StringBuilder(number).reverse().toString();
        return number.equals(reversed);
    }
}
