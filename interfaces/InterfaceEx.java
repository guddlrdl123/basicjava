package interfaces;

// 인터페이스 선언
public interface InterfaceEx {
    // 1. 멤버변수 (상수)
    public int MIN_PRICE = 0;
    public int MAX_PRICE = 10000;

    // 2. 메서드 선언 -> 기본이 추상 메서드
    public double meanPrice();

    public double totalPrice();

    // 3. 메서드 선언 -> default 메서드
    default double getSalePrice(double price) {
        return price - (price * 0.05);
    }

    // 4. static 메서드 선언
    static void printPrice(double price) {
        System.out.println(price);
    }
}
