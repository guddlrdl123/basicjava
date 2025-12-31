package Day3;

import java.util.Scanner; //import 는 모듈을 불러오는 키워드

public class InputEx {
    public static void main(String[] args) {
        // keyboard 입력 받는 tool - Scanner
        // 1. tool 불러오기...
        // Scanner scanner = new Scanner(입력방식..)
        // System.in - 표준입력(키보드 등)
        Scanner scanner = new Scanner(System.in, "cp949");

        // 2. 도구 사용법
        // 위에서 생성한 scanner 변수에 주소를 참조해서 도구 사용.
        // 1) 문자열 처리
        // String test = scanner.next(); // 문자열 입력. whitespace를 구분자로 사용.
        // // System.out.println(test);

        // String test2 = scanner.nextLine(); // 문자열 입력. "\n" 줄바꿈을 기준으로 입력.
        // System.out.println(test2);
        // 2) 숫자를 입력 받는 도구들...
        // nextInt(), nextShort(), nextDouble() ...
        // 두 번째 연결 단어의 데이터 타입을 입력받음...
        // int test1 = scanner.nextInt();
        // double test2 = scanner.nextDouble();

        // 간혹 입력값 처리가 제대로 되지 않는 경우,
        // 입력값이 메모리 버터 공간에 남았을 경우, 다음 scanner 처리시 입력을 스킵하는 경우
        // 대처 방법은 scanner.nextLine() 입력하고 사용하면 됨.
        // 3. 도구 정리(메모리 로딩 해제)
        scanner.close();
    }
}
