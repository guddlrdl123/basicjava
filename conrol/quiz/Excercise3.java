package conrol.quiz;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        // switch 구문을 사용하여 두 정수를 입력 받아서 사칙연산을 하는 계산기 프로그램.

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력해 주세요.");
        int number = scanner.nextInt();
        System.out.println("두 번째 정수를 입력해 주세요.");
        int number2 = scanner.nextInt();

        System.out.printf("원하시는 연산을 선택해 주세요.\n 1. 더하기\n 2. 빼기\n 3. 곱하기\n 4. 나누기\n");
        int select = scanner.nextInt();
        int result = 0;
        switch (select) {
            case 0:
                break;
            case 1:
                result = number + number2;
                break;

            case 2:
                result = number - number2;
                break;

            case 3:
                result = number * number2;
                break;

            case 4:
                result = number / number2;
                break;

            default:
                System.out.println("1~4번 사이로 입력해 주세요.");

        }
        System.out.printf("첫 번째 정수 : %d\n", number);
        System.out.printf("두 번째 정수 : %d\n", number2);
        System.out.printf("계산 결과 : %d", result);
    }
}
