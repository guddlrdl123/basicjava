package day8.oop;

public class ClassEx4 {

    public static void main(String[] args) {
        // 1. 계산기 프로그램 메서드 구현.
        // 1) 객체 생성 -> 클래스명 객체명 = new 클래스명();
        ClassEx4 testMethod = new ClassEx4();

        System.out.printf("10 더하기 20 : %d\n", testMethod.sum(10, 20));
        System.out.printf("10 빼기 20 : %d\n", testMethod.sub(10, 20));
        System.out.printf("10 곱하기 20 : %d\n", testMethod.multi(10, 20));
        System.out.printf("10 나누기 20 : %f\n", testMethod.div(10, 20));
        // 2. 매개변수 배열을 받는 경우의 동작.
        int[] test1 = { 10, 20 };
        int[] test2 = { 10, 20, 30, 40, 50 };
        int[] test3 = {};
        System.out.println("test1 값을 넘기는 경우 결과 : " + testMethod.sum(test1));
        System.out.println("test2 값을 넘기는 경우 결과 : " + testMethod.sum(test2));
        System.out.println("test3 값을 넘기는 경우 결과 : " + testMethod.sum(test3));

        // 메서드 오버로드 테스트.
        System.out.println("testMethod.multi() 사용 : " + testMethod.multi(10, 20));
        System.out.println("testMethod.multi() 사용 : " + testMethod.multi(10.01, 20));
        System.out.println("testMethod.multi() 사용 : " + testMethod.multi(10, 20.02));
        System.out.println("testMethod.multi() 사용 : " + testMethod.multi(10.01, 20.02));

        // 메서드(생성자)에 기본값 설정하기...
        // 기본적으로 자바에서는 메서드 기본값 설정이 없어요.
        // 오버로드를 이용한 기본 값 설정.

        System.out.println("testMethod.defaultParameter() 사용 : " + testMethod.defaultParameter("홍길동", 20, "경기도 광주"));
        System.out.println("testMethod.defaultParameter() 사용 : " + testMethod.defaultParameter("홍길동", 20));
        System.out.println("testMethod.defaultParameter() 사용 : " + testMethod.defaultParameter("홍길동"));

        // 메서드에서 리턴의 사용 테스트
        // 입력값을 받아서 15 이상이면 "15 이상", 10 미만이면 "10 미만" 출력
        System.out.println(testMethod.testReturn1(10));
        System.out.println(testMethod.testReturn1(15));
        System.out.println(testMethod.testReturn1(8));

        // void 타입의 리턴 처리...
        testMethod.testReturn2(10);
        testMethod.testReturn2(15);
        testMethod.testReturn2(8);

    }

    public String testReturn1(int num) {
        if (num >= 15) {
            return "15 이상입니다.";
        } else if (num < 10) {
            return "10 미만입니다.";
        } else
            return "10이상 15 미만입니다.";

    }

    public void testReturn2(int num) {
        // void 타입에서 리턴의 사용.
        if (num >= 15) {
            System.out.println("15 이상입니다.");
            return;
        } else if (num < 10) {
            System.out.println("10 미만입니다.");
            return;
        }
        System.out.println("10 ~ 15 미만입니다.");

    }

    // 계산 메서드 - 더하기, 뻬기, 곱하기, 나누기
    // static 사용 X
    // 일반 멤버 메서드는 객체 생성 후 사용이 가능함.

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public double div(int a, int b) {
        return a / (double) b;
    }

    // 다양한 형태의 매개변수
    public int sum(int[] args) {
        int result = 0;
        for (int a : args)
            result += a; // for(int i=0, i<args.length;i++){result += args[i]}
        return result;
    }

    // 메서드 오버로드
    // 반환 타입은 같지 않아도 됨...
    // 1) 같은 메서드명을 가지고 있어야 한다.
    // 2) 매개변수의 숫자와 타입이 같지 않아야 한다.
    // 3) 타입의 순서가 달라도 오버로드는 가능함.

    public int multi(int a, int b) {
        return a * b;
    }

    public double multi(int a, double b) {
        return a * b;
    }

    public double multi(double a, int b) {
        return a * b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    // 오버로드를 활용한 기본값 설정.
    // 기본 동작 메서드
    public String defaultParameter(String name, int age, String address) {
        return name + "님의 나이는 " + age + "살 입니다. 사시는 곳은 " + address + "입니다.";
    }

    // 기본값 설정한 메서드
    public String defaultParameter(String name, int age) {
        String address = "서울"; // 기본값 설정
        return defaultParameter(name, age, address); // 기본 동작 메서드 호출
    }

    // 이름만 입력 받고, 나이와 주소는 기본 설정하고 싶어요.

    public String defaultParameter(String name) {
        return defaultParameter(name, 20, "서울");
    }

}
