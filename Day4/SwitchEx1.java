package Day4;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 기본 switch
        System.out.print("숫자 입력(1~3) : ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("1번 입력");
                break; // 종료 - 블럭 밖으로 가세요. // braek가 없으면... case 구문을 종료하지 않고 다음으로 넘어감.
            case 2:
                System.out.println("2번 입력");
                break;
            case 3:
                System.out.println("3번 입력");
                break;

            default:
                System.out.println("1~3번 아닌 값 입력");
                break;
        }

        // p.95 switch (변수)에 있는 변수 값의 처리...

        System.out.print("점수를 입력하세요. : ");

        int score = scanner.nextInt();
        String grade = "";

        switch (score / 10) {
            case 9: // 90 ~ 99
                grade = "A";
                break;
            case 8: // 80 ~ 89
                grade = "B";
                break;
            case 7: // 70 ~ 79
                grade = "C";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println("학점 : " + grade);

        scanner.close();
    }
}
