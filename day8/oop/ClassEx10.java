package day8.oop;

public class ClassEx10 {
    // Singleton design pattern
    public static void main(String[] args) {
        // 싱글톤 테스트
        // 1. 싱글톤 객체 호출
        SingletonEx singletonEx = SingletonEx.getInstance();
        SingletonEx singletonEx2 = SingletonEx.getInstance();

        System.out.println("singletonEx와 singletonEx2 비교 : " + (singletonEx == singletonEx2));
        System.out.println(singletonEx);
        System.out.println(singletonEx2);
        //
    }
}

// 싱글톤 디자인 클래스 선언
class SingletonEx {
    // 1. 자신을 담는 멤버변수 생성(private) - *주의* static으로 생성
    // 왜? static인가... static으로 만들어진 변수, 메서드는 객체 생성되지 않아도 접근 가능
    private static SingletonEx instance = new SingletonEx(); // 이 멤버변수가 반드시 있어야 함.
    // 다른 멤버 변수들도 선언해도 됨. (꼭 static일 필요 X)

    // 2. 생성자(private)
    private SingletonEx() {
        System.out.println("싱글톤 객체 생성");
    }

    // 3. 자신을 담은 멤버변수를 전달(public) - *주의* static으로 생성
    public static SingletonEx getInstance() {
        return instance;
    }
}
