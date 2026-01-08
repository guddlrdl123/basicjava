package day8.oop;

public class ClassEx3 {

    // *** 1. 클래스 멤버 변수 :
    // 클래스 안에서 선언되고, 객체 생성시 각 데이터의 기본값으로 자동 초기화.
    // 정수 타입은0, long인 경우 0L, 실수타입 : 0.0(0.0f), boolean : false
    // 참조형 데이터 타입 : null

    // *** 2. 메서드 내에 선언하는 로컬 변수 :
    // 일반적인 변수의 선언
    // 메서드 혹은 {} 내에서 선언된 변수
    // 사용하기 전에 반드시 초기화 필수(**)

    // *** 3. 메서드에 전달하는 값을 받는 매개변수 :
    // 메서드 정의시 파라미터 리스트에 정의하는 변수
    // 초기화를 메서드 호출시 전달 받습니다.
    // 변수 선언시 초기화 필수가 아닙니다.
    // 메서드 내에서 영향을 줍니다.

    public static void main(String[] args) {
        Variable var = new Variable();
        var.printNum(100);
    }
}

// 변수 테스트를 위한 클래스 선언

class Variable {
    // 멤버변수(필수/속성)
    int a;

    public void printNum(int c) {
        // 로컬변수 (지역변수)
        int b = 10; // 반드시 초기화!!
        System.out.println("멤버변수 값 : " + a);
        System.out.println("로컬(지역)변수 값 : " + b);
        System.out.println("매개변수 값 : " + c);
    }
}