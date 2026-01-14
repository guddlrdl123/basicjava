package interfaces;

public class InterfaceTestEx2 {
    public static void main(String[] args) {
        // 배열 선언 Shape 인터페이스 배열...
        Shape[] shapeArr = new Shape[3];
        shapeArr[0] = new Triangle(10, 20);
        shapeArr[1] = new Square(100, 40);
        shapeArr[2] = new Circle(40);

        for (Shape s : shapeArr) {
            System.out.println(s);
        }
    }
}

interface Shape {
    // 1. 변수 - 상수 (public static final 변수)

    // 2. 메서드 - 기본이 추상 메서드
    public abstract double getArea();

    double getLength(); // public abstract가 생략.
    // default는 일반 메서드처럼 사용하는 메서드
    // static은 static 메서드 사용하는 것과 같다.

}

// 인터페이스를 implement하는 구현체 클래스를 선언
// 삼각형, 사각형, 원 ...
class Triangle implements Shape {

    // 1. 멤버변수
    double width;
    double height;

    // 2. 생성자
    Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 3. 메서드
    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getLength() {
        // 삼각형은 밑변과 높이로 둘레를 구할 수 없다.
        return 0;
    }

    // print 출력할 때 불러온다. (문자열 처리)
    @Override
    public String toString() {
        return String.format("삼각형의 밑변 = %.2f, 높이 = %.2f, 넓이 = %.2f 입니다.", width, height, getArea());
    }
}

class Square implements Shape {
    double width;
    double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getLength() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return String.format("사각형의 밑변 = %.2f, 높이 = %.2f, 넓이 = %.2f, 둘레 = %.2f 입니다.", width, height, getArea(),
                getLength());
    }
}

class Circle implements Shape {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }

    @Override
    public double getLength() {
        return 2 * r * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("원의 반지름 = %.2f, 넓이 = %.2f, 둘레 = %.2f 입니다.", r, getArea(), getLength());
    }
}
