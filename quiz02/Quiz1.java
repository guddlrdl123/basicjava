package quiz02;

import java.util.Scanner;

// 실습1 (Quiz).
// 사용자로부터 정수 입력을 받아서 해당 정수가 소수인지 여부를 판별하는 프로그램을 작성하세요.

// 실습1(quiz) - 확장!
//   1 ~ 100 사이에 있는 소수를 구하고, 출력하는 프로그램을 작성하세요.
//   해당 내용을 배열에 저장하세요!

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("1보다 큰 숫자를 입력해 주세요");
         * 
         * int num = sc.nextInt();
         * 
         * for (int i = 2; i <= 9; i++) {
         * if (num % i == 0) {
         * System.out.printf("%d는 소수가 아닙니다.", num);
         * break;
         * 
         * } else {
         * System.out.printf("%d는 소수입니다.", num);
         * }
         * }
         */

        // 입력값 처리하는 변수
        System.out.print("정수를 입력하세요. :");
        int number = sc.nextInt();

        // 소수 여부 체크 변수
        boolean check = true;

        for (int i = 2; i < number; i++) { // 소수 판별을 위한 로직
            if (number % i == 0) { // 소수가 아님.
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("입력한 숫자" + number + "는 소수입니다.");
        } else {
            System.out.println("입력한 숫자" + number + "는 소수가 아닙니다.");

        }
        sc.close();

        // ============실습1 확장===============

        int[] store = new int[100];
        int cnt = 0; // 소수의 갯수

        for (int j = 1; j <= 100; j++) {
            check = true;
            for (int i = 2; i < j; i++) { // 소수 판별을 위한 로직
                if (j % i == 0) { // 소수가 아님.
                    check = false;
                    break;
                }
            }

            // 소수인 경우 store에 저장
            if (check & j != 1) { // 소수인 경우
                store[cnt] = j;
                cnt += 1;
            }

        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(store[i] + " ");
        }
        System.out.println();
    }
}
