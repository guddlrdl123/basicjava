package Day3;

public class OperandEx4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // AND 연산
        System.out.println(a > b && a == 10); // true
        System.out.println(a > b && a == b); // false

        // OR 연산
        System.out.println(a > b && a == 10); // true
        System.out.println(a > b && a == b); // true
        System.out.println(a < b && a == b); // false

        // NOT 연산
        System.out.println(!(a < b)); // true
        System.out.println(!(a > b)); // false

        // XOR 연산
        System.out.println(a > b ^ a == 10); // false
        System.out.println(a > b ^ a == b); // true

        // 숏컷 연산을 이용하는 방법(방어 코드)
        // & - AND 연산자(숏컷 연산X)
        b = 0;
        // System.out.println(b > 0 & (a / b > 0));
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at Day3.OperandEx4.main(OperandEx4.java:28)
        // 책에서 방어코드 부분
        System.out.println(b > 0 && (a / b > 0)); // 숏컷
    }
}
