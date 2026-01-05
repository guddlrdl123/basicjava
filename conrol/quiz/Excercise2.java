package conrol.quiz;

public class Excercise2 {
    public static void main(String[] args) {
        // 1부터 100까지 정수 중에 짝수의 합과 홀수의 합을 구하는 프로그램을 작성하세요

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum2 += i;
            }
        }
        System.out.printf("짝수의 합은 %d, 홀수의 합은 %d 입니다.", sum, sum2);
    }
}
