package day6.method;

import java.util.Scanner;

public class MethodEx2 {
    // 클래스의 변수(속성)
    static Scanner scanner = new Scanner(System.in);
    static double result;

    public static void main(String[] args) {
        // 메뉴를 생성하고, 사용자로부터 입력 값을 받아서.
        // 계산하는 계산기 프로그램을 만들어 보겠습니다.
        // 1) 메뉴 출력, 2) 사용자로 부터 입력값 받기
        // 3) 계산 처리, 4) 결과 출력

        menu(); // 결과 출력

        // 사용자 입력 받기
        int sel = scanner.nextInt() - 1;
        System.out.print("정수 입력1 : ");
        int num1 = scanner.nextInt();
        System.out.print("정수 입력2 : ");
        int num2 = scanner.nextInt();
        inputValue(num1, num2, sel);
        // 결과 출력
        System.out.println(resultString());

    }

    // 1. 매개변수 O, 반환값 O - 계산하는 함수
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return a / (double) b;
    }

    // 2. 매개변수 O, 반환값 X - 입력값 계산하는 함수
    public static void inputValue(int num1, int num2, int cal) {
        // num1, num2, 계산할 숫자.
        // cal - 계산 방식을 지정(0~3 숫자로 구분)
        if (cal == 0) {
            result = sum(num1, num2);
        } else if (cal == 1) {
            result = sub(num1, num2);
        } else if (cal == 2) {
            result = multi(num1, num2);
        } else if (cal == 3) {
            result = div(num1, num2);
        }
    }

    // 3. 매개변수 X, 반환값 O - 결과 출력을 위한 값 생성.
    public static String resultString() {
        return "계산의 결과는 \'" + result + "\' 입니다.";
    }

    // 4. 매개변수 X, 반환값 X - 메뉴 처리
    public static void menu() {
        // 메뉴 화면 구성
        System.out.println("=====계산기 프로그램=====");
        System.out.println("1. 더하기 연산");
        System.out.println("2. 빼기 연산");
        System.out.println("3. 곱하기 연산");
        System.out.println("4. 나누기 연산");
        System.out.print(" 메뉴를 선택하세요(0.종료) : ");

    }

}
