package innerclass;

public class OuterMain {
    // 중첩을 인터페이스를 사용하는 경우. (내부 인터페이스)
    /*
     * class 클래스명{
     * interface 인터페이스명 {
     * void method(); // 추상 메서드
     * }
     * }
     */

    public static void main(String[] args) {
        Outer out = new Outer();
        out.setInterfaceEx(new InterfaceExImpl());
        out.outerMethod();

        out.setInterfaceEx(new InterfaceExImpl2());
        out.outerMethod();
    }
}

// Outer Class
class Outer {
    // 1.멤버변수
    // 내부 인터페이스 선언 및 정의
    interface InterfaceEx {
        void method();
    }

    // Outer 클래스의 멤버 변수
    InterfaceEx ie;

    // 2. 생성자

    // 3. 메서드
    // setter
    void setInterfaceEx(InterfaceEx ie) {
        this.ie = ie;
    }

    // 일반 메서드
    void outerMethod() {
        ie.method(); // 추상 메서드
    }
}

// InterfaceExImpl 클래스
class InterfaceExImpl implements Outer.InterfaceEx {

    @Override
    public void method() {
        System.out.println("InterfaceExImpl method()");
    }

}

// InterfaceExImpl2 클래스
class InterfaceExImpl2 implements Outer.InterfaceEx {

    @Override
    public void method() {
        System.out.println("InterfaceExImpl2 method()");
    }

}