package day6.method;

import java.util.Scanner;

public class MethodEx2B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        System.out.println("=====계산기 프로그램=====");
        System.out.println("1. 더하기 연산");
        System.out.println("2. 빼기 연산");
        System.out.println("3. 곱하기 연산");
        System.out.println("4. 나누기 연산");
        System.out.print(" 메뉴를 선택하세요(0.종료) : ");
        int sel = scanner.nextInt();

        System.out.print("정수 입력1 : ");
        int num1 = scanner.nextInt();
        System.out.print("정수 입력2 : ");
        int num2 = scanner.nextInt();

        if (sel == 1) {
            result = num1 + num2;
            System.out.println("계산의 결과는\'" + result + "\' 입니다.");
        } else if (sel == 2) {
            result = num1 - num2;
            System.out.println("계산의 결과는\'" + result + "\' 입니다.");
        } else if (sel == 3) {
            result = num1 * num2;
            System.out.println("계산의 결과는\'" + result + "\' 입니다.");
        } else if (sel == 4) {
            result = num1 / (double) num2;
            System.out.println("계산의 결과는\'" + result + "\' 입니다.");
        } else if (sel == 0) {
            System.out.print("종료!");
        }

    }
}
