package Day4;

public class ForEx2 {
    public static void main(String[] args) {
        // 중첩 반복문...
        // for - 상위 for문(1~10까지 출력하는)
        System.out.println(); // 줄바꿈을 위해서 사용.
        for (int i = 1; i <= 10; i++) {
            // System.out.print(i + " ");
            // 하위 for문 작성. (1~10)
            for (int j = 1; j <= 10; j++) {
                System.out.println("i의 값 : " + i + ", j의 값 : " + j);
            }
        } // 1 2 3 4 5 6 7 8 9 10
        System.out.println();
    }
}
