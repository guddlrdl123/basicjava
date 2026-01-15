package interfaces.quiz;

// 1. 인터페이스 정의
interface Powerable {
    void powerOn();

    void powerOff();
}

interface Workable {
    void performTask();
}

// 2. 부모 추상 클래스
abstract class Computer implements Powerable {
    String model;
    boolean isRunning;

    Computer(String model) {
        this.model = model;
    }

    @Override
    public void powerOn() {
        isRunning = true;
        System.out.println(model + "의 전원이 켜졌습니다.");
    }

    @Override
    public void powerOff() {
        isRunning = false;
        System.out.println(model + "의 전원이 꺼졌습니다.");
    }
}

// 3. 자식 클래스: 노트북
class Laptop extends Computer implements Workable {
    Laptop(String model) {
        super(model);
    }

    @Override
    public void performTask() {
        System.out.println(model + "에서 휴대용 문서 작업을 시작합니다.");
    }

    void checkBattery() {
        System.out.println(model + "의 배터리 잔량을 확인합니다: 80%");
    }
}

// 4. 자식 클래스: 데스크톱
class Desktop extends Computer implements Workable {
    Desktop(String model) {
        super(model);
    }

    @Override
    public void performTask() {
        System.out.println(model + "에서 고성능 그래픽 작업을 시작합니다.");
    }

    void overclock() {
        System.out.println(model + "의 CPU를 오버클럭하여 성능을 높입니다.");
    }
}

// 5. 관리자 클래스 (다형성 테스트)
class TechManager {
    // 인터페이스 다형성: 어떤 Powerable 기기든 처리 가능
    void bootDevice(Powerable p) {
        System.out.println("[시스템 부팅 시작]");
        p.powerOn();
    }

    // 인터페이스 다형성: 어떤 Workable 기기든 처리 가능
    void executeWork(Workable w) {
        w.performTask();
    }

    // instanceof를 이용한 타입 판별 및 다운캐스팅
    void checkSpecialFeature(Powerable p) {
        // TODO: p가 Laptop이면 checkBattery() 호출
        // TODO: p가 Desktop이면 overclock() 호출
        if (p instanceof Laptop) {
            ((Laptop) p).checkBattery();
        }
        if (p instanceof Desktop) {
            ((Desktop) p).overclock();
        }
    }
}