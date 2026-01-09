package day8.oop;

// import day8.oop.objects.Person; // import 현재 패키지 이외에 있는 모듈(클래스)을 불러온다.
import day8.oop.objects.*; // day8.oop.objects 패키지에 있는 모든 클래스르 의미함.

public class ClassEx5 {
    public static void main(String[] args) {
        Person person = new Person("이순신", 45);
        System.out.println(person);
        System.out.println("이순신 나이 : " + person.getAge("이순신"));
        System.out.println("홍길동 나이 : " + person.getAge("홍길동"));
        person.setAge(100);
        System.out.println("나이 설정 후 이순신 나이 : " + person.getAge("이순신"));
    }
}
