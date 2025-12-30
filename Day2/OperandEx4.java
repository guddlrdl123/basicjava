package Day2;

public class OperandEx4 {
    public static void main(String[] args) {
        // 비교 연산자...
        // 비교 연산자는 두 개의 피연산자의 값을 비교하여 그 결과를 true or false로 반환합니다.
        // (** 조건분기, 반복 등에서 사용됨)
        // >(크다), <(작다), >=(크거나 같다), <=(작거나 같다), ==(같다), !=(같지 않다)

        int a = 10;
        int b = 5;
        System.out.println("a > b ? " + (a > b)); // 참(true)
        System.out.println("a < b ? " + (a < b)); // 거짓(false)
        System.out.println("a >= b ? " + (a >= b)); // 참(true)
        System.out.println("a <= b ? " + (a <= b)); // 거짓(false)
        System.out.println("a == b ? " + (a == b)); // 거짓(false)
        System.out.println("a !== b ? " + (a != b)); // 참(true)

    }
}
