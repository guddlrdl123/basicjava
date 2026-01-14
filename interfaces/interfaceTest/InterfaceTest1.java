package interfaces.interfaceTest;

import interfaces.InterfaceEx;

public class InterfaceTest1 {
    public static void main(String[] args) {
        InterfaceTestClass test = new InterfaceTestClass(1000, 5);
        System.out.println("가격 평균 : " + test.meanPrice());
        System.out.println("전체 가격 : " + test.totalPrice());
        // 인터페이스 default 메서드 (가격을 할인하는 메서드)
        InterfaceEx.printPrice(test.getSalePrice(test.totalPrice()));
        // 가격을 출력하는 인터페이스의 static 메서드
        InterfaceEx.printPrice(test.totalPrice());

    }
}

// 인터페이스 구현
class InterfaceTestClass implements InterfaceEx {

    int price;
    int total;
    int count;

    InterfaceTestClass(int price, int count) {
        // MAX_PRICE와 MIN_PRICE는 인터페이스 선언 된 상수
        if (price <= MAX_PRICE && price > MIN_PRICE) {
            this.price = price;
            this.count = count;
            this.total = price * count;
        }
    }

    @Override
    public double meanPrice() {

        return (double) total / count;
    }

    @Override
    public double totalPrice() {

        return (double) total;
    }

}
