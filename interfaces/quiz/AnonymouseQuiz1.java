package interfaces.quiz;

import java.net.MulticastSocket;

public class AnonymouseQuiz1 {
    // 익명 클래스 + 인터페이스를 사용하는 퀴즈
    public static void main(String[] args) {
        Machine tv = new TV("LG TV");
        Machine computer = new Machine();

        Machine.machineWork(new Remocon() {
            @Override
            public void on() {
                System.out.println(tv.getName() + "를 켭니다.");
            }

            @Override
            public void off() {
                System.out.println(tv.getName() + "를 끕니다.");
            }
        }, tv);
        computer.setName("컴퓨터");
        Machine.machineWork(new Remocon() {
            @Override
            public void on() {
                System.out.println(computer.getName() + "를 켭니다.");
            }

            @Override
            public void off() {
                System.out.println(computer.getName() + "를 끕니다.");
            }
        }, computer);
    }
}

// 1. 인터페이스
// On/Off 메서드 구현
interface Remocon {
    void on(); // 전원 켜짐

    void off(); // 전원 꺼짐
}

// 2. 클래스 생성.
class Machine {
    // 1. 멤버변수
    protected String name;

    // 2. 생성자
    Machine() {
    }

    // 3. 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 전원 동작 메서드(리모컨으로 동작)
    public static void machineWork(Remocon remocon, Machine machine) {
        remocon.on();
        remocon.off();
    }
}

class TV extends Machine {
    // 1. 멤버변수...

    // 2. 생성자
    TV(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void show() {
        System.out.println("방송 중입니다.");
    }
}