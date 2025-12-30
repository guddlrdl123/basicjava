package Day2;

public class StringEx {
    public static void main(String[] args) {
        // String 변수 선언
        String name;
        // name 변수 초기화
        name = "홍길동";

        // 변수 선언과 동시 초기화
        String name2 = "홍길동2";
        String name3 = null; // null로 초기화
        String name4 = ""; // ""로 초기화

        System.out.println("name=" + name);
        System.out.println("name2=" + name2);
        System.out.println("name3=" + name3);
        System.out.println("name4=" + name4);

        // String 값을 생성하는 또 다른 방법
        String name5 = new String("홍길동5");
        System.out.println("name5=" + name5);

        // final double PI = 3.14;
        // PI =3.141592; 에러 발생
    }
}
