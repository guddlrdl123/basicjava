package Day2;

public class OperandEx1 {
    public static void main(String[] args) {
        // 산술 연산자
        int a = 5 + 5; // a = 10;
        int b = a - 5; // b = 5;
        int c = b * 2; // c = 10;
        int d = c / 5; // d = 2;
        System.out.println(d);
        int e = 10 % 3; // % mod로 나머지 연산. e = 1;
        System.out.println(e);

        // 산술 사용할 때 형변환이 일어날 수 있다.(묵시적 형변환)
        // 컴퓨터에서는 데이터 타입이 같아야 연산을 한다.
        System.out.println("7 / 4 의 결과는? " + 7 / 4.0);
        System.out.println("7 / 5 의 결과는(몫) ?" + 7 / 4);
        System.out.println("7 / 5 의 결과는(나머지) ?" + 7 % 4);

        // PI의 값을 출력하면... 무한히 계속되는 다음과 같은 숫자가 나옴.
        System.out.println(Math.PI); // 3.141592653589793...
        // 문제는 소수점 4자리까지만 출력해서 사용하고 싶어요 어떻게 해야 할까요?
        // 4자리까지의 값을 변수 pi1에 저장해서 출력
        // 힌트! 형변환, 연산자(산술 연산자)

        double pi = Math.PI;
        double pi1 = (int) (pi * 10000) / 10000d; // int로 형변환 해서 소수점 날리기

        System.out.println("pi1의 소수점 4자리 출력값 : " + pi1);
        System.out.printf("%.4f", Math.PI);

        // int형 이하의 연산결과는 int형... 결과가 int형을 넘는 경우 데이터 손상될 수 있음.
        byte b1 = 127;
        byte b2 = 20;
        // byte b3 = b1 + b2;
        byte b3 = (byte) (b1 + b2);
        System.out.println("b3 : " + b3);

        int a1 = 100000;
        int a2 = 100000;
        // long a3 = a1 * a2;
        long a3 = (long) a1 * a2;

        System.out.println("a3 : " + a3);
    }
}
