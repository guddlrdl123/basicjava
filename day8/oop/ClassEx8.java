package day8.oop;

import day8.oop.objects.*;

public class ClassEx8 {

    public static void main(String[] args) {
        ExampleObject person1 = new ExampleObject("홍길동", 20);
        ExampleObject person2 = new ExampleObject("홍길동", 20);
        ExampleObject person3 = new ExampleObject("홍길동", 20, "010-0000", "율도국");

        // why false? 주소가 달라요. 다른 주소를 개별 객체.
        System.out.println("persion1 == person2 의 결과 : " + (person1 == person2));
        // equals 객체를 비교. 객체 비교. return (this == obj);
        System.out.println("persion1.hashCode()와 person2.hashCode() 의 결과 : "
                + (person1.hashCode() == person2.hashCode()));
        System.out.println("persion1.equals(person2) 의 결과 : "
                + person1.equals(person2));
        System.out.println("person1.equals(person3)의 결과 : " + person1.equals(person3));

    }

}

class ExampleObject extends Object {
    String name;
    int age;
    String phone;
    String address;

    public ExampleObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ExampleObject(String name, int age, String phone, String address) {
        this(name, age);
        this.phone = phone;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        // 객체 동등비교를 위해서 재정의하는 메서드
        // return super.equals(obj);
        // return (this == obj); // super.equals의 코드
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExampleObject other = (ExampleObject) obj; // 대입
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name))
            return false;
        return true;

    }

    @Override
    public int hashCode() {
        // 객체 동등비교를 위해 재정의하는 메서드
        // hashCode() 생성을 위한 알고리즘 구동...
        // object.hashCode()는 생성된 객체의 정보를 토대로 생성됨.
        // 특정 클래스(객체)의 값으로 비교하는 hashCode로 오버라이드
        final int prime = 31; // 변경 안 하는 값
        int result = 1; // 정의된 값
        result = prime * result + age; // 클래스 멤버의 age를 이용한 연산
        result = prime * result + ((name == null) ? 0 : name.hashCode()); // 클래스 멤버의 name을 이용한 연산
        return super.hashCode();
    }

    @Override
    public String toString() {
        // 기본은 클래스명@hashcode를 출력하는 메서드.
        // 재정의를 통해서 객체내 정보를 확인하기 위한 용도로 많이 사용.
        // print할 때 toString()의 값을 출력함.
        // return super.toString();
        // Integer.toHexString(hashCode()) -> hashCode()값을 16진수 표현 문자어로 표시
        // getClass() -> 클래스 정보를 얻어오는 메서드. getName() 클래스 이름 불러오기
        return super.toString();
    }

}