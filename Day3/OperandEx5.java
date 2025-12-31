package Day3;

public class OperandEx5 {
    public static void main(String[] args) {
        // 비트 연산
        // Integer.toBinaryString()
        // 정수 값을 이 진수 문자열 출력
        System.out.println(); // 줄바꿈을 위해서...
        System.out.println("10:" + Integer.toBinaryString(10)); // 1010
        System.out.println("15:" + Integer.toBinaryString(15)); // 1111

        // 비트 논리 연산자
        System.out.println("10&15 : " + (10 & 15));
        /*
         * 10 : 1010
         * &
         * 15 : 1011
         * => 1010(10)
         */
        System.out.println("10|15 : " + (10 | 15));
        /*
         * 10: 1010
         * |
         * 15: 1111
         * -> 1111(15)
         */
        System.out.println("10^15 : " + (10 ^ 15));
        /*
         * 10: 1010
         * |
         * 15: 1111
         * -> 0101(5)
         */
        System.out.println("~10 : " + (~10));
        // 10: 1010 -> ~ => 11111111111111111111111111110101(-11)
        System.out.println("~10의 이진수 : " + Integer.toBinaryString(~10));
        System.out.println("~10의 길이 : " + Integer.toBinaryString(~10).length());
        System.out.println("정수 자료형의 최대값 : " + Integer.MAX_VALUE);
        // 문자열을 정수로 변환.
        System.out.println(Integer.parseUnsignedInt("0101", 2));
        // Integer.parseInt() - 문자열을 정수로 변환.
        // Integer.parseInt("숫자문자열", 진수표현(36까지))
        // 이진수인 경우 2^31 자리까지는 오류 없이 표현 가능..(1번째 signed bit X)
        // 이진수 표현을 위해서 1)Long.pareLong() - 2^63 자리까지 표현 가능
        // 2)Integer.pareUnsignedInt() 를 사용.
        // 3)BigIntger를 사용.

        // 쉬프트 연산자, <<, >>(부호 사용), >>>(부호 없음)
        System.out.println("10 << 2");
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(10 << 2));
        System.out.println(10 << 2);

        System.out.println("10 >> 2");
        System.out.println(Integer.toBinaryString(10 >> 2)); // 0b10 (2)
        System.out.println("-10 >> 2");
        System.out.println(Integer.toBinaryString(-10 >> 2)); // 11. 1101(-3)

        System.out.println("-10 >>> 2");
        System.out.println(Integer.toBinaryString(-10 >>> 2)); // 0011..1101
        System.out.println(-10 >>> 2); // 1073741821
    }

}
