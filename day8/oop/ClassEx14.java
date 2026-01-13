package day8.oop;

public class ClassEx14 {
    // final 사용 제한자 테스트
    public static void main(String[] args) {
        // Parent.MAX = 1000; // final이 사용된 경우 정해진 값을 변경할 수 없다.
        final int a; // 선언
        final int b = 20; // 선언과 동시에 초기화
        // b = 1000; // final로 초기값 설정이 된 경우 값 변경X
        a = 1000; // 초기값 설정

        // 메서드 클래스에 final이 붙는 경우
        GrandPa grandPa = new GrandPa();
        grandPa.notUse(); // final 처리된 메서드
        Parent Parent = new Parent();
        Parent.notUse(); // Override 에러 발생.

    }
}

class GrandPa {
    int money = 1000;

    // 메서드
    final void notUse() { // 메서드에 final이 지정된 경우
        System.out.println(money + "를 사용하지 말아라!");
    }

}

class Parent extends GrandPa {
    // final을 사용한 변수 선언
    public static final int MAX = 100; // 상수

    // @Override
    // void notUse(){
    // System.out.println(money+"를 잘 사용해서 써라!");
    // }
}

final class Sun extends Parent { // Sun은 자식 클래스 생성 불가

}