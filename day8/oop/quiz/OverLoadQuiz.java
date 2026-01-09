/*
계산 프로그램을 만들어 주세요.(hint. 메서드 오버로드)

입력되는 값은 자유롭게(정수, 실수 구분X) 두 수를 입력 받아서, 더하기, 빼기, 곱하기, 나누기 처리를 합니다.

그 결과를 출력하는 프로그램을 만들어 주세요. 
(조건, 실수인 경우, 소수점 2자리까지 출력하게 만들어 주세요)
*/
package day8.oop.quiz;

public class OverLoadQuiz {
    public static void main(String[] args) {
        OverLoadQuiz test = new OverLoadQuiz();

        System.out.println("===================더하기===================");
        System.out.println("test.sum() 사용 : " + test.sum(10, 20));
        System.out.printf("test.sum() 사용 : %.2f\n", test.sum(10.01, 20));
        System.out.printf("test.sum() 사용 : %.2f\n", test.sum(10, 20.02));
        System.out.printf("test.sum() 사용 : %.2f\n", test.sum(10.01, 20.));

        System.out.println("===================빼기===================");
        System.out.println("test.sub() 사용 : " + test.sub(10, 20));
        System.out.printf("test.sub() 사용 : %.2f\n", test.sub(10.01, 20));
        System.out.printf("test.sub() 사용 : %.2f\n", test.sub(10, 20.02));
        System.out.printf("test.sub() 사용 : %.2f\n", test.sub(10.01, 20.02));

        System.out.println("===================곱하기===================");
        System.out.println("test.multi() 사용 : " + test.multi(10, 20));
        System.out.printf("test.multi() 사용 : %.2f\n", test.multi(10.01, 20));
        System.out.printf("test.multi() 사용 : %.2f\n", test.multi(10, 20.02));
        System.out.printf("test.multi() 사용 : %.2f\n", test.multi(10.01, 20.02));

        System.out.println("===================나누기===================");
        System.out.println("test.div() 사용 : " + test.div(10, 20));
        System.out.printf("test.div() 사용 : %.2f\n", test.div(10.01, 20));
        System.out.printf("test.div() 사용 : %.2f\n", test.div(10, 20.02));
        System.out.printf("test.div() 사용 : %.2f\n", test.div(10.01, 20.02));

    }

    // ===================더하기====================
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(int a, double b) {
        return a + b;
    }

    public double sum(double a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    // =====================빼기====================
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(int a, double b) {
        return a - b;
    }

    public double sub(double a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    // ===================곱하기====================
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

    // ====================나누기===================
    public int div(int a, int b) {
        return a / b;
    }

    public double div(int a, double b) {
        return a / b;
    }

    public double div(double a, int b) {
        return a / b;
    }

    public double div(double a, double b) {
        return a / b;
    }

}
