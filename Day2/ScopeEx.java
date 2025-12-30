package Day2;

public class ScopeEx { // 1. 클래스의 영역 블럭
    // 1. 클래스 영역 블럭에서 변수 선언. 클래스 전체에 영향을 줌.
    static int no;

    public static void main(String[] args) { // 2. main() 영역 블럭
        // 2. main() 블럭에서 선언된 변수. main() 내에 영향을 줌.
        String name;
        if (true) {
            name = "홍길동";
            // if {} 내에서 생성한 String 변수. if{} 내에서만 영향을 줌
            String email = "honggildong@naver.com";
        }
        System.out.println("no 변수 내용 : " + no);
        System.out.println("name 변수의 내용 : " + name);
        // if문 블럭 변수로 접근X
        // System.out.println("email 변수의 내용 : " + email);
        no = 10; // 클래스 전체에 영향을 주는 변수.(0 -> 10)
        test();
    }

    public static void test() { // 3. test() 영역 블럭
        // 3. test() 블럭에서 선언된 변수. test() 내에서 영향을 줌
        // String name2;
        System.out.println("no에 있는 값 : " + no);
    }
}
