public class IntTypeExample {
    public static void main(String[] args) {

        byte a = (byte) 128; // -128(1000_0000) ~ 127(0111_1111)
        short b = (short) 32768; // -32768(1000_0000 0000_0000) ~ 32767(0111_1111 1111_1111)
        int c = 2147483647; // -2147483648 ~ 2147483647
        long d = 2147483648L;

        System.out.println("\n" + a + "," + b + "," + c + "," + d + "\n");
        // System.out.printf()
        // %d-정수 %f-실수 %s-문자열 %c-문자
        //
        // 제어문자 - 문자열에 사용하는 특수 문자.
        // "\n" -> 줄바꿈, "\t" -> 탭 간격, "\b" -> 백스페이스
        System.out.printf("%d, %d, %d, %d", a, b, c, d);

    }
}
