package quiz02;

import java.util.Random;

public class Quiz4 {
    public static void main(String[] args) {
        Random ran = new Random();

        // 6자리 배열
        int[] arr = new int[6];
        int count = 0;

        // while (count == 9) {
        for (int k = 0; k < 10; k++) { // 전체 10번 반복

            for (int i = 0; i <= 5; i++) { // 로또 번호 6개 만들기
                arr[i] = ran.nextInt(45) + 1; // 배열에 랜덤 수 대입

                for (int j = 0; j <= i; j++) {
                    if (arr[i] != arr[j]) { // 중복값 확인
                    } else {
                        arr[i] = ran.nextInt(45) + 1; // 중복일 시 새로운 값 대입
                    }
                }
            }
            System.out.println((count + 1) + "번");
            System.out.print("{ ");
            for (int a : arr) { // 로또 번호 출력
                System.out.print(a + " ");
            }
            System.out.print(" }");
            count++;
            System.out.println();
        }

    }

}
// }
