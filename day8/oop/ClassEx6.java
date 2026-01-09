package day8.oop;

import day8.oop.objects.*;

public class ClassEx6 {
    public static void main(String[] args) {
        // 1. 클래스 접근 테스트
        AccessClasses testClass1 = new AccessClasses(); // public 접근 제한
        // Access1 testClass2 = new Access1(); // The type Access1 is not visible
        // why? Access1은 다른 패키지에 있기 때문에 접근X

        // 2. 메서드 접근 테스트
        // AccesClassses의 객체인 testClass1을 사용하여 테스트
        testClass1.test1(); // public
        // testClass1.test2(); // protected X (상속X, 같은 패키지X)
        // testClass1.test3(); // defalut X (같은 패키지 X)
        // testClass1.test4(); // private X (같은 클래스X)

        // 3. 멤버변수 접근 테스트
        System.out.println(testClass1.publicAccess); // public
        // System.out.println(testClass1.protectedAccess); // protected
        // System.out.println(testClass1.defalutAccess); // defalut
        System.out.println("getter 메서드를 사용하여 접근 : " + testClass1.getDefaultString());
        // System.out.println(testClass1.privateAccess); // private
        System.out.println("getter 메서드를 사용하여 접근 : " + testClass1.getPrivateString());
    }

    // 내부 클래스 - 클래스 내에 클래스를 선언해서 사용하는 경우.
    // 접근 제한자 모두 사용 가능
    public class AccessTest {

    }

}
