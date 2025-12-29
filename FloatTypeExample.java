public class FloatTypeExample {
    public static void main(String[] args) {
        float f = 1.1f; // why? 1.1 리터럴은 데이터 타입이 double. 1.1 -> 1.1f
        double d = 1.1;
        System.out.printf("%f, %f", f, d);

        // 논리 타입은 true와 false만 존재함.
        // boolean bool1 = false;
        // boolean boo12 = False;
        // boolean boo13 = "false";
        // boolean bool4 = 1;

        // '' - 한 글자 리터럴, "" - 문장열 리터럴
        char ch = 'A'; // char ch = "A"(X);
        String str = "A"; // String str = 'A';(X)

        System.out.printf("\nch 결과 : %c \nstr 결과 : %s", ch, str);
    }
}
