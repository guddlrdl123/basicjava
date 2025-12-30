package Day2;

public class CastingEx2 {
    public static void main(String[] args) {
        // 강제 형변환 예시
        double pi = 3.14;
        System.out.println("pi의 결과 : " + pi); // 3.14
        System.out.println("(int) pi 결과 : " + (int) pi); // 3.14 -> 3
        int pi2 = (int) pi;
        System.out.println(pi2);
        System.out.println("pi2 변수에 저장된 값 : " + pi2);

        // 강제 형변환 예시
        short number1 = 3291; // 0b_1100 1101_1011
        byte number2 = (byte) number1;
        System.out.println("number2의 값은? " + number2);

        double score = 100;
        System.out.println(score);
        int score2 = (int) score;
        System.out.println(score2);
    }
}
