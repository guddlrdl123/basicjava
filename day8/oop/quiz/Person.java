/*
* 연습1
* Person이라는 객체를 생성하는 클래스를 정의하고, 객체 생성 후 테스트하세요. 
* Person에는 이름, 나이, 키, 몸무게, 출생년도 값을 가지고 있어요.
* 각 값의 데이터 타입은 알아서 맞추기
* Person의 생성자는 기본 생성자, 이름만 입력받는 생성자, 이름과 나이를
* 입력받는 생성자로 구성되어 있습니다.
* 메서드는 getName(), getAge(), getHeight(), getWeight()
* 라는 이름, 나이, 키, 몸무게 정보를 불러오는 메서드를 가지고 있어요.
* 메서드에 toString()메서드를 사용하고, 객체 내에 있는 멤버변수의 값을 출력하게 만들어주세요.
* (이름, 나이, 키, 몸무게, 출생년도)
*/
package day8.oop.quiz;

import java.util.Scanner;

public class Person {
    public static Scanner sc = new Scanner(System.in, "cp949");

    public static void main(String[] args) {
        Member member = new Member("");
        Member member2 = new Member("", 0);

        member.name = sc.nextLine();
        member2.name = sc.nextLine();
        member2.age = sc.nextInt();

    }

}

class Member {
    String name;
    int age;
    double height;
    double weight;
    int birthYear;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n" + "나이 : " + age + "\n" + "키 : " + height + "\n" + "몸무게 : " + weight + "\n"
                + "출생년도 : " + birthYear;
    }
}
