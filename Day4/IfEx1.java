package Day4; // 패키지 - 다양한 기능을 가진 도구들의 묶음.

// package 키워드는 현재 자바 프로젝트의 도구들이 있는 위치를 나타냄.

public class IfEx1 {
    public static void main(String[] args) {
        // 단순 if 구문
        // 1. 변수 선언, 2. 변수 값 대입
        int score = 55;

        // 3. 변수 연산
        if (score >= 60) {
            // 4. 변수 출력
            System.out.println("합격 입니다.");
        }

        if (score < 60) {
            System.out.println("불합격 입니다.");
        }
        // 출력
        System.out.println("시험이 종료 되었습니다.");

        // 위 코드를 if ~ else로 변경.
        if (score >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
        System.out.println("시험이 종료 되었습니다.");
    }
}
