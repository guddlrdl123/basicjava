package day8.oop.objects;

public class Pen {

    // 1. 멤버변수(필드/속성)
    public String color;
    int price;

    // 2. 생성자(객체 생성할 때 사용하는 메서드같은 것.)
    // 기본 생성자는 생략이 가능. -> 기본 생성자 : public pen(){} - 생략 가능
    // 오버로드를 사용하여 여러 상황에 생성자 혹은 메서드를 만들 수 있다.
    // 생성자 혹은 메서드 오버로드의 규칙
    // 1. 생성자 혹은 메서드의 오버로드는 반환타입, 메서드명, **매개변수 타입과 순서
    // 이 3가지를 기준으로 동작합니다.
    // 2. 반환 타입과 메서드 명은 같아야 하고, **매개변수 타입과 순서는 달라야 한다**.
    // 3. 오버로드는 변수명하고 관계 없다.
    public Pen() { // 매개변수. 매개변수 X
        System.out.println("기본 생성자 실행");
    }

    public Pen(String init_color) { // 매개변수 1개, 타입 String
        this.color = init_color;
        System.out.println("생성자를 사용하여 color값을 초기화 함!");
    }

    // public Pen(String init_color1111) { // 매개변수는 이름이 아닌 타입으로 구분...
    // this.color = init_color;
    // System.out.println("생성자를 사용하여 color값을 초기화 함!");
    // }
    public Pen(int price) { // 매개변수 1개, 타입 int
        this.price = price;
        System.out.println("생성자를 이용하여 price 값을 초기화 함!");
    }

    // 매개변수 2개 이상인 경우 타입과 순서를 봄
    public Pen(String color, int price) { // 매개변수 2개, 타입 String, in
        this.color = color;
        this.price = price;
        System.out.println("생성자를 이용하여 color와 price 값을 초기화");
    }

    public Pen(int price, String color) { // 매개변수 2개, 타입 int, String
        this.color = color;
        this.price = price;
        System.out.println("생성자를 이용하여 color와 price 값을 초기화2");
    }

    // 3. 메서드(클래스에 있는 멤버변수에 대한 기능을 구현)
    public void write() {
        System.out.println("Hello world!!!");
    }

    @Override
    public String toString() { // toString() 메서드를 정의하면 print시 해당 메서드 결과를 출력함.
        return "color : " + color + ", 가격 : " + price;
    }
}
