package Day2;

public class OperandEx2 {
    public static void main(String[] args) {
        // 증감 연산자 (단항 연산자)

        int a = 10;
        int b = 10;
        ++a; // 증가 (전위 연산 : 연산 먼저 하고, a에 대입)
        b--; // 감소 (후위 연산 : b에 대입 후 증감 연산)
        System.out.println("a의 결과 : " + a);
        System.out.println("b의 결과 : " + b);

        int c = ++a; // c = (a + 1) => 12, c = 12, a = 12
        int d = b--; // d = b(9) - 1 => d = 9, b = 8
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a의 결과 : " + a);
        System.out.println("b의 결과 : " + b);
    }

}
