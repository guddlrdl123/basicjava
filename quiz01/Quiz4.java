package quiz01;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int height = sc.nextInt();
        String parent = sc.next();
        String hearchDease = sc.next();

        String ride = age >= 6 || (parent == "yes" && height >= 120) && hearchDease != "no" ? "탑승가능" : "탑승불가";

        System.out.println(ride);

    }
}
