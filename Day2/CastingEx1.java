package Day2;

public class CastingEx1 {
    public static void main(String[] args) {
        // 자동 형변환 예시...
        int number = 10;

        long number2 = number; // number(int) -> number(long)

        int number3 = (int) 30.3f; // 형변환 안 됨... float이 int보다 커서

        System.out.println(number2);
        System.out.println(number3);
        System.out.println(10 + 30.04); // 40.4(double)
    }
}
