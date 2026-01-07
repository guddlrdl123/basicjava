package day6.method;

import java.util.Scanner;

public class RemindEx3 {
    public static void main(String[] args) {

        // 1 ~ 100가지 임의 정수 10개를 저장할 배열 변수 선언 및 생성.
        int[] arr = new int[10];
        // 구현... 함수로(참조 타입의 특징..)
        // radomInit(int[] arr)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        // 사용자로 부터 입력 처리
        Scanner scanner = new Scanner(System.in);
        // 배열에 저장된 값 선택
        System.out.print("1 ~ 10 사이의 숫자를 입력하세요 : ");
        int selectNum = scanner.nextInt();
        int number = arr[selectNum - 1]; // 배열에서 선택된 값(정수)

        // 구현.. startGame (number)
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

        scanner.close();

    }
}