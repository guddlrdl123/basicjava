package quiz01;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = (num / 100) * 100;

        System.out.println(result);
    }
}
