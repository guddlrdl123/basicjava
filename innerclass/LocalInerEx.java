package innerclass;

public class LocalInerEx { // 바깥 클래스 - Outer class
    // 로컬 이너 클래스 - 메서드 또는 블럭에서 선언되어 사용된다.

    // 1. 멤버변수
    int i = 10;

    // 2. 생성자(X) - 기본 생성자

    // 3. 메서드
    void outerMethod() {
        // 로컬 이너 클래스 선언과 정의
        int x = 20; // 메서드 지역 변수
        class Inner { // Inner class
            // 1. 멤버변수

            int i = 30; // 메서드 지역 변수

            // 2. 생성자(X)

            // 3. 메서드
            void innerMethod() {
                System.out.println(x); // 메서드 지역변수
                System.out.println(i); // inner 클래스 i 변수
                System.out.println(this.i); // inner 클래스 i 변수
                System.out.println(LocalInerEx.this.i); // outer 클래스의 i변수
            }
        }

        // 객체 생성
        Inner inner = new Inner(); // 3.
        inner.innerMethod(); // 4.
    }

    // main 메서드
    public static void main(String[] args) {
        LocalInerEx lic = new LocalInerEx(); // 1.
        lic.outerMethod(); // 2.
    }
}
