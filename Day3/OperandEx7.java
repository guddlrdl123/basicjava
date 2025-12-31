package Day3;

public class OperandEx7 {
    public static void main(String[] args) {
        // 문자열 연산 : +
        // 문자열을 이어붙이는 역할. 문자 타입이 아닌 경우
        // 문자열로 변환하는 역할도 함.
        String name = "홍길동";
        System.out.println("이 사람의 이름은 " + name + "입니다.");

        int height = 180;
        System.out.println(height + "cm" + name + "의 키입니다.");

        String weight = 96.5 + "";
        System.out.println(name + "의 몸무게는 " + weight + "kg 입니다.");

        // 문자열로 사용된 값은 사칙연산 등을 사용할 수 없다.
        int age = 38;
        // 복합 대입 연산자...
        age += 10; // age = age + 10
        String ageStr = "38";
        ageStr += 10; // "38" + 10 = 3810

    }
}
