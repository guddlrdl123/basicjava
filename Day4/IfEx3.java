package Day4;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 중첩 if 예제
        // 수학, 영어 점수를 입력 받아, 낙제 여부 결정
        // 둘 중 하나라도 60점 미만이면 낙제
        Scanner scanner = new Scanner(System.in);

        System.out.println("수학 점수 : ");
        int math = scanner.nextInt();
        System.out.println("영어 점수 : ");
        int eng = scanner.nextInt();

        // 연산 - 60점 미만 여부 확인. 통과(60 이상) or 탈락(60 미만)을 출력
        // 중첩 if -> 1)math 2)eng 를 확인

        if (math >= 60) {
            if (eng >= 60) {
                System.out.println("통과");
            } else {
                System.out.println("탈락");
            }
        } else {
            System.out.println("탈락");
        }

        // 논리 연산자 사용
        if (math >= 60 && eng >= 60) {
            System.out.println("통과");
        } else {
            System.out.println("탈락");
        }
        scanner.close();
    }
}
