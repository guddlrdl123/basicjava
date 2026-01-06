package Day5.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayExcercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = ra.nextInt(100) + 1;
        }

        System.out.println("1부터 10 사이의 수를 입력해 주세요. : ");
        int select = sc.nextInt();
        int number2 = 0;
        int count = 0;
        boolean status = false;

        do {
            count++;
            if (select <= 10) {
                System.out.println("1 부터 100 사이의 수를 맞춰 보세요. : ");
                number2 = sc.nextInt();
                if (number2 != number[select - 1]) {
                    System.out.println("틀렸습니다.");
                    if (number2 > number[select - 1]) {
                        System.out.println("Down");
                    } else {
                        System.out.println("Up");
                    }
                } else {
                    System.out.println("정답입니다.");
                    status = true;
                }
            }

        } while (!status);
        System.out.printf("시도 횟수 : %d", count);

    }
}
