package day8.oop;

public class ClassEx15 {
    // 추상 클래스와 추상 메서드
    public static void main(String[] args) {

        // Shape 객체 배열 선언
        Shape[] arr = new Shape[2];
        arr[0] = new Circle(10);
        arr[1] = new Rectangle(5, 5);

        for (Shape s : arr) {
            System.out.println(s);
            System.out.println("넓이 : " + s.area() + ", 둘레 : " + s.length());
        }
    }
}

// 클래스 선언
// 추상 클래스 Shape
abstract class Shape {
    // 1. 멤버 변수
    String type;

    // 2. 생성자 (기본 생성자 없이 다른 생성자를 만들면, 기본 생성자는 X)
    Shape(String type) {
        this.type = type;
    }

    // 3. 메서드
    // 추상 메서드 구현 - 구현부 정의 없음.
    // 실제 구현은 자식 클래스에서 Override를 통해 정의.
    abstract double area();

    abstract double length();
}

class Circle extends Shape {

    int r; // 반지름

    // Shape 생성자를 String type을 받는 생성자로 정의해서
    // 반드시 해당 내용을 생성자를 정의해야 한다.
    public Circle(int r) {
        super("원"); // Shape가 생성자를 만들었기 때문에 사용.
        this.r = r;
    }

    @Override
    double area() {
        return r * r * Math.PI;
    }

    @Override
    double length() {
        return 2 * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle [type=" + type + ", r=" + r + ", area()=" + area() + ", length()=" + length() + "]";
    }

}

class Rectangle extends Shape {
    int widht, height;

    public Rectangle(int widht, int height) {
        super("사각형");
        this.widht = widht;
        this.height = height;
    }

    @Override
    double area() {
        return widht * height;
    }

    @Override
    double length() {
        return (widht + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle [type=" + type + ", widht=" + widht + ", height=" + height + ", area()=" + area()
                + ", length()=" + length() + "]";
    }

}