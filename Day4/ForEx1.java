package Day4;

public class ForEx1 {
    public static void main(String[] args) {
        // For문
        for (int i = 1; i <= 5; i++) { // 5번 반복
            System.out.println("i의 결과" + i);
        }

        for (int i = 5; i > 0; i--) { // 5번 반복
            System.out.println("i의 결과" + i);
        }

        // 1~100까지 숫자의 합.
        int sum = 0; // 합이 저장될 변수. 초기화 0
        for (int i = 0; i <= 100; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
