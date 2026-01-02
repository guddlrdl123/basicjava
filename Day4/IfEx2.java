package Day4;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 다중 if문...
        // 등급을 나누던지, 전체에서 일부분을 분류할 때에 사용됨.

        // 키보드 입력을 받아서 처리하는 Scanner 불러오기(tool)
        // Scanner 사용...
        // 1. Scanner 객체 호출(도구가 정의된 객체)
        Scanner scanner = new Scanner(System.in);

        // 2. Scanner 객체가 담긴... scanner를 사용하여 동작할 도구를 호출.
        // 다중 if문을 테스트

        // print : 줄바꿈 x, println : 줄바꿈 o
        System.out.print("점수를 입력 : "); // scanner 입력 전에 어떤 내용 입력인지 가이드
        int score = scanner.nextInt();
        // 학점을 저장하는 변수
        String grade = "";

        System.out.println("학점 부여 시작");
        if (score >= 90) {
            grade = "A+";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 75) {
            grade = "C+";
        } else if (score >= 70) {
            grade = "C+";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);

        // 3. 다 사용한 scanner를 정리
        scanner.close();

    }
}
