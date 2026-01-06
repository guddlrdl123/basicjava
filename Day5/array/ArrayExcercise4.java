package Day5.array;

import java.util.Scanner;

public class ArrayExcercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단 입력 : \n");
        int dan = sc.nextInt();
        int[] gop = new int[10];

        System.out.print("{");
        for (int i = 1; i < gop.length; i++) {
            gop[i] = dan * i;
            if (i <= 8) {
                System.out.print(dan * i + ", ");
            } else
                System.out.print(dan * i);
        }
        System.out.print("}");
        sc.close();
    }
}
