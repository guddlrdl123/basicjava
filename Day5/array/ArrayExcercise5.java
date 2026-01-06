package Day5.array;

import java.util.Scanner;

public class ArrayExcercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] gugudan = new int[8][9];

        for (int i = 0; i < gugudan.length; i++) {
            for (int j = 0; j < gugudan[i].length; j++) {
                gugudan[i][j] = (i + 2) * (j + 1);
            }
        }

        for (int[] a : gugudan) {
            for (int b : a) {
                System.out.printf(b + " ");
            }
            System.out.println();
        }

        System.out.println("원하는 단 입력: ");
        int num = sc.nextInt();
        System.out.println("곱할 수 입력: ");
        int gop = sc.nextInt();

        if (num > 0) {
            System.out.println("결과 : " + gugudan[num - 2][gop - 1]);
        } else
            System.out.println("단 (2-9), 곱할 수(1-9) 사이의 숫자를 입력해 주세요");

        sc.close();
    }
}
