package Day4;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * int i = 1;
         * 
         * System.out.println("숫자를 입력해 주세요(2~9) : ");
         * int num = scanner.nextInt();
         * 
         * while (i <= 9) {
         * System.out.printf("%d x %d = %d\n", num, i, (num * i));
         * i++;
         * }
         * 
         * scanner.close();
         */
        int i = 2;

        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
                j++;
                if (j == 9) {

                    continue;
                }
            }
            i++;

        }

    }
}
