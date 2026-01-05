package conrol.quiz;

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        /*
         * 통장 입력 검증기
         * ATM기에 출입금 시스템을 구현하려고 한다. 시스템 안정성을 위해서 검증 로직을 구현하려고 한다.
         * 잘못된 입금에 대해서 즉각적인 피드백을 주고 재입력을 요구할 예정이다
         * 
         * 1. 사용자에게 출금액을 입력 받습니다.
         * 2. 금액은 0보다 커야 합니다.
         * 3. 금액은 1000원 단위여야 합니다.
         * 4. 1회 최대 출금 한도는 100만원입니다.
         * 5. 유효한 입력이 들어올 때까지 질문을 반복하게 설정(do-while 사용)
         */
        Scanner scanner = new Scanner(System.in);

        /*
         * System.out.printf("출금하실 금액을 입력해 주세요. (1000원 단위) : ");
         * int money = scanner.nextInt();
         * 
         * do {
         * if (money % 1000 != 0) {
         * System.out.println("금액을 다시 입력해 주세요.");
         * } else if (money > 10000000) {
         * System.out.println("금액을 다시 입력해 주세요.");
         * } else
         * System.out.println("출금 완료 되었습니다.");
         * } while (money <= 0);
         * System.out.printf("출금하실 금액을 입력해 주세요. (1000원 단위) : ");
         * money = scanner.nextInt();
         * 
         * System.out.println("출금 완료 되었습니다.");
         */

        long withdraw; // 초기값 사용자로 부터 입력.
        boolean status; // 검증 상태 정보 저장하는 변수.

        do { // do~while 쓴 이유? 무조건 한 번은 실행해야 해서.
             // 1. 출금액 받기...
            System.out.print("출금액을 입력하세요 : ");
            withdraw = scanner.nextLong();
            // 2. 검증 조건
            if (withdraw < 0) {
                // 직각적인 피드백...
                System.out.println("0보다 커야 합니다.");
                status = false;
            } else if (withdraw % 1000 != 0) {
                // 직각적인 피드백...
                System.out.println("금액은 1000원 단위입니다.");
                status = false;
            } else if (withdraw > 1000000) {
                // 직각적인 피드백...
                System.out.println("1회 최대 출금 한도는 100만원 입니다.");
                status = false;
            } else {
                System.out.println("정상적인 출금액");
                status = true;
            }
        } while (!status); // ! 사용한 이유.. statue = false 라면 반복해야 하기 때문.
    }
}
