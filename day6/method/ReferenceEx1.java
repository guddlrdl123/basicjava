package day6.method;

public class ReferenceEx1 {
    public static void main(String[] args) {
        // referencetype
        // 배열, String, 클래스

        // Stirng 변수 iterable 데이터를 대입.
        String name1 = "홍길동";
        String name2 = "홍길동";

        System.out.println("nameR1 == nameR2의 결과 : " + name1 == name2);
        System.out.println(name1 == name2); // true

        // String 변수에 new String() 객체 타입(참조형으로 대입한 경우)
        String nameR1 = new String("홍길동");
        String nameR2 = new String("홍길동");

        System.out.println("nameR1 == nameR2의 결과 : " + nameR1 == nameR2); // false

        // String에 값을 비교하려면? String.equals()를 이용함.
        System.out.println("nameR1.equals(nameR2)의 결과 :" + nameR1.equals(nameR2));

    }
}
