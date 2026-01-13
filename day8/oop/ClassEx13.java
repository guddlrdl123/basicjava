package day8.oop;

public class ClassEx13 {
    // 사용 제한자 : static
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.a++; // 1
        c1.b++; // 1
        System.out.println(c1.a); // 인스턴스 멤버변수
        System.out.println(c1.b); // 접근 권장 사항이 아님
        System.out.println(Count.b); // 클래스 멤버변수

        Count c2 = new Count();
        c2.a++; // 1
        c2.b++; // ???
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(Count.b);

        // Count.b 접근 : 클래스 멤버변수에 대한 접근 권장.
        Count.b++;
        System.out.println(c2.b); // 객체와 상관 없이 값이 같다.
        System.out.println(c1.b);
        System.out.println(Count.b);

        System.out.println("=====".repeat(10));
        System.out.println(Count.doIt());
        System.out.println(Count.doIt());
        System.out.println(Count.doIt());

        System.out.println("=====".repeat(10));
        StaticInit staticInit = new StaticInit();
        System.out.println(staticInit);
        StaticInit staticInit2 = new StaticInit();
        System.out.println(staticInit2);
        System.out.println("시스템 종료");

    }

}

// static 사용시 동작 확인을 위한 클래스
class Count {
    int a; // 인스턴스 변수
    static int b; // 클래스 멤버변수

    public static int doIt() {
        // return a++; -> return new Count().a;
        // return new Count().a; -> 생성된 객체의 값을 불러다 넘기는 것은 가능.
        return ++b; // ** static 메서드에서 그냥 불러다 쓸 수 있는 건 static 설정된 변수, 메서드만 가능하다.
    }
}

class StaticInit {
    // static 초기화자(initializer)를 테스트
    // - 생성자 실행되기 전에 실행.
    // - static 변수 초기화에 사용
    // - 때문에 객체를 여러 개 생성해도 한 번만 실행된다.
    static {
        System.out.println("static initalizer가 수행됩니다.");
    }

    StaticInit() {
        System.out.println("생성자가 호출됩니다.");
    }

}