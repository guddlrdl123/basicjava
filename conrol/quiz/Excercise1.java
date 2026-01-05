package conrol.quiz;

public class Excercise1 {

    // 1부터 100까지 정수 중에 5의 배수의 합을 구하는 프로그램을 작성하세요
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.printf("5의 배수의 합은 %d 입니다.", sum);
    }
}
