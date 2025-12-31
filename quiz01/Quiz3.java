package quiz01;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String result = (score >= 60) ? "패스" : "재수강";
        System.out.println(result);

        sc.close();
    }
}
