package Day4;

public class BreakAndCountinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // i가 0, 1, 2, 3, 4 인 형태의 반복문.(5번)
            for (int j = 0; j < 3; j++) {
                // j가 0, 1, 2 인 형태의 반복문.(3번)
                if (i == 3)
                    break; // break : 반복을 종료. 현재 속해있는 반복문만 멈추고 전체 반복문을 멈추지는 않는다.

                if (j == 1)
                    continue; // continue : 조건으로 이동. 반복을 종료하지 않고 다음 조건으로 이동.
                System.out.println("i : " + i + ", j : " + j);
            }
        }
    }
}
