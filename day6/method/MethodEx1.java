package day6.method;

public class MethodEx1 {
    public static void main(String[] args) {
        // static을 사용하면, 프로그램 구동시 생성되고,
        // 접근 제한이 걸리지 않으면 바로 사용할 수 있음.
        // 주의] static 사용제한의 메서드는 static 사용 제한된 메서드만
        // 바로 호출이 가능함.
        System.out.println(sum(10, 20));
    }

    // 메서드 선언 및 정의
    // 파라미터 리스트는 여러 개를 선언할 수 있음.
    public static int sum(int a, int b) {
        return a + b; // 1)반환값 처리, 2)함수의 종료(* void)
    }
}
