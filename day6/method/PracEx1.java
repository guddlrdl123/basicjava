package day6.method;

import java.util.Scanner;

public class PracEx1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[10];

        randomInit(arr);

        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();

        // 배열에 저장된 값 선택
        System.out.print("1 ~ 10 사이의 숫자를 입력하세요 : ");
        int selectNum = scanner.nextInt();
        int number = arr[selectNum - 1]; // 배열에서 선택된 값(정수)

        startGame(number);

        scanner.close();

    }

    public static void randomInit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void startGame(int number) {
        // 시도 횟차를 저장할 변수(누적)
        int count = 0;

        System.out.println("번호가 선택되었습니다. 게임을 시작합니다.");
        while (true) {
            // 입력값과 숫자를 비교하기 위한 입력 값 처리
            System.out.print("1 ~ 100 사이의 숫자를 입력하세요 : ");
            int inputNum = scanner.nextInt();

            count += 1;

            // 비교
            if (inputNum == number) {
                System.out.println("정답!!! 시도횟수는 " + count + "번입니다.");
                break;
            } else if (inputNum > number) {
                System.out.println("Up");
            } else if (inputNum < number) {
                System.out.println("Down");
            }
        }
    }
}