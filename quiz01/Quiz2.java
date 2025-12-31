package quiz01;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String a = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(a);

        sc.close();
    }
}
