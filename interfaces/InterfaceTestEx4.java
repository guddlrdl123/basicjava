package interfaces;

public class InterfaceTestEx4 {
    // 다중 상속과 다중 구현에 대한 심플 예제

    public static void main(String[] args) {
        ToDo toDo = new ToDo(); // IToDo3, IToDo4 인터페이스 정보를 가지고 있다
        // 다형성 테스트
        IToDo3 iToDo3 = toDo; // 다형성 처리...
        iToDo3.m1();
        iToDo3.m2();
        iToDo3.m3();
        // iToDo3.m4(); // ? IToDo에 넣었으나, m4()는 IToDo4에 있는 메서드로 사용
        // m4()를 사용하고 싶다면... Todo 자료형이거나, ITODo4 자료형이면 가능하다.
        IToDo4 itodo4 = toDo;
        itodo4.m4();

        // 익명 클래스 사용. (IToDo2의 익명 클래스 사용)
        // 익명 클래스는 해당 정의에서만 사용하는 단발성 클래스
        IToDo2 iToDo2 = new IToDo2() {
            @Override
            public void m2() {
                System.out.println("m2() 실행");
            }
        };
        iToDo2.m2();
    }
}

// 인터페이스 선언 - IToDo1, IToDo2, IToDo3, IToDo4
// class ToDo (implements IToDo3, IToDo4)

interface IToDo1 {
    void m1();
}

interface IToDo2 {
    void m2();
}

interface IToDo3 extends IToDo1, IToDo2 {
    void m3();
}

interface IToDo4 {
    void m4();
}

class ToDo implements IToDo3, IToDo4 {
    // ToDo는 앞서 정의된 추상 메서드를 실제로 구현해야 함

    @Override
    public void m1() {
        System.out.println("m1 구현");
    }

    @Override
    public void m2() {
        System.out.println("m2 구현");
    }

    @Override
    public void m3() {
        System.out.println("m3 구현");
    }

    @Override
    public void m4() {
        System.out.println("m4 구현");
    }

}