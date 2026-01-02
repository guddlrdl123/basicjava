package Day4;

import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp949");

        while (true) {
            System.out.print("문자열을 입력 (quit-종료) : ");
            String text = scanner.nextLine();
            if (text.equals("quit")) { // 문자열 quit이면...
                break;
            }
            System.out.println("입력한 글자는 : " + text);
        }

        scanner.close();
    }
}
