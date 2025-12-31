package Day3;

public class OperandEx6 {
    public static void main(String[] args) {
        // 3항 연산자...
        int score = 59;
        String pass = score >= 60 ? "합격" : "불합격";
        System.out.println("결과 : " + pass);

        int a = 5 - (int) (Math.random() * 10); // 5 - 임의값(0~10)
        int abs = (a >= 0) ? a : -a;
        System.out.println("a의 절대값 : " + abs);
    }
}
