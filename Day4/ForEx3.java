package Day4;

import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        // 입력값(2~9) 사이의 입력값을 받아서
        // 해당 입력 값의 구구단을 출력해 주세요.
        // ex) 입력값 : 2
        // 출력
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6
        // ...
        // 2 x 9 = 18

        /*
         * 입력 값 처리
         * 키보드 입력을 위한 도구 호출(Scanner)
         * 키보드 입력값은 변수 num에 저장.(int)
         * 구구단 작성. 단 * 1~9 = 단 * 1~9
         * for (변수 i 선언; i가 10미만; i를 1씩 증가) {
         * 출력 : "단 * i = (단 * i)"
         * }
         * 
         */
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.print("출력할 단 입력(2~9) : ");
         * int num = scanner.nextInt();
         * for (int i=1; i<10; i++){
         * System.out.println(num+"*"+i+"="+(num*i));
         * System.out.printf("%d * %d = %d\n", num, i, (num*i));
         * }
         */

        Scanner scanner = new Scanner(System.in);
        /*
         * System.out.println("숫자를 입력해 주세요. (2~9) : ");
         * int i = scanner.nextInt();
         * for (int j = 1; j <= 9; j++) {
         * System.out.println(i + "x" + j + "=" + i * j);
         * }
         */
        scanner.close();
        // 중첩 for문을 사용하여. 2~9단까지 출력하는 프로그램을 작성.
        /*
         * System.out.println("=======구구단 전체 출력=======");
         * for (int i = 2; i <= 9; i++) {
         * System.out.println("==============" + i + "단" + "==============");
         * for (int j = 1; j <= 9; j++) {
         * System.out.printf("%d x %d = %d\n", i, j, i * j);
         * }
         * }
         */

        // 2~9단까지 출력 형식
        /*
         * 2 x 1 = 2 3 x 1 = 3 4 x 1 = 4 ... 8 x 1 = 8 9 x 1 = 9
         * 2 x 2 = 4 3 x 2 = 6 4 x 2 = 8 ... 8 x 2 = 16 9 x 2 = 18
         * 2 x 3 = 6 3 x 3 = 9 4 x 3 = 12 ... 8 x 3 = 24 9 x 3 = 27
         * ...
         */
        System.out.println(
                "-----------------------------------------------------구구단 세로 출력-----------------------------------------------------");

        for (int i = 1; i <= 9; i++) {

            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d x %d = %d\t", j, i, j * i);

            }
            System.out.println();
        }

    }
}
