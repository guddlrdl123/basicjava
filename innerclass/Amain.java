package innerclass;

public class Amain {
    // 내부 클래스 테스트 클래스로...
    // 멤버 클래스 객체, static 멤버 클래스 객체, 로컬 클래스 객체
    // 선언과 사용
    // **접근 방식에 대해서 잘 기억해 두자**

    public static void main(String[] args) {
        // A 클래스 사용하기 위해서 객체 생성.
        A a = new A(); // A 객체 생성

        // static 멤버 클래스 객체 생성.
        A.B b = new A.B(); // 이 B 객체는 A 클래스 객체가 생성되어야 불러올 수 있다? X
        b.var1 = 3; // B 객체의 인스턴스
        b.method1();
        // B 객체 생성과 상관 X (static)
        A.B.var2 = 3; // B 객체의 static 변수
        A.B.method2(); // B 객체의 static 메서드

        // 인스턴스 내부 클래스 객체 생성
        A.C c = a.new C(); // ***중요함*** 1. 인스턴스 멤버 클래스는 외부객체 생성 후 내부 객체 생성.
        // 객체.new Inner Class();
        c.var1 = 3;
        c.method1();

        // 로컬 클래스 객체 생성을 위한 메서드 호출
        a.method();
    }
}

// 클래스 A(Inner클래스 테스트를 위한 클래스)
class A { // Outer Class
    // 1. 멤버변수
    // static 멤버 내부 클래스
    static class B { // Member Inner Class (이너 클래스라서 static 사용 가능, 아우터 클래스는 X)
        // 1. 멤버변수
        int var1;
        static int var2;

        // 2. 생성자
        B() { // static 내부 클래스의 생성자
            System.out.println("C 객체 생성");
        }

        // 3. 메서드
        void method1() {
            System.out.println("static 내부 클래스의 method1()");
        }

        static void method2() {
            System.out.println("static 내부 클래스의 static method2()");
        }
    }

    // instance 멤버 클래스
    public class C { // 인스턴스 멤버 내부 클래스
        // 1. 멤버변수
        int var1;

        // 2. 생성자
        C() { // 인스턴스 내부 클래스의 생성자
            System.out.println("B 객체 생성");
        }

        // 3. 메서드
        void method1() {
            System.out.println("인스턴스 내부 클래스의 method1()");
        }
    }

    // 2. 생성자
    A() { // Outer Classs Constructor
        System.out.println("A 객체 생성");
    }

    // 3. 메서드
    // 로컬 이너 클래스(메서드 혹은 블럭 내에서 선언되어 사용되는 클래스)
    void method() { // Outer Class의 메서드
        // 로컬 이너 클래스
        class D {
            // 1. 멤버면수
            int var1;

            // 2. 생성자
            D() {
                System.out.println("D 객체 생성");
            }

            // 3. 메서드
            void method1() {
                System.out.println("로컬 내부 클래스의 method1()");
            }
        }
        D d = new D();
        d.var1 = 3;
        d.method1();

    }
}