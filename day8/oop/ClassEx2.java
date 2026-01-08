package day8.oop;

import day8.oop.objects.Pen; // import는 다른 패키지에 있는 클래스 또는 인터페이스 등을 호출

public class ClassEx2 {

    // 생성자
    // 생성자는 객체 생성시에 필요한 정보를 초기화.
    // 객체 생성시 제일 처음 동작하는 기능.
    public static void main(String[] args) {
        // Pen 객체 2개 생성. 빨간색 펜과 파란색 펜을 생성.
        Pen redPen = new Pen("red");
        Pen bluePen = new Pen("blue");
        System.out.println("redPen의 펜 색은 : " + redPen.color + " 입니다.");
        System.out.println("bluePen의 펜 색은 : " + bluePen.color + " 입니다.");
        // 생성자 오버로드 적용 결과
        Pen pen1 = new Pen(); // 기본 생성자
        Pen pen2 = new Pen("빨간색"); // color 초기화
        Pen pen3 = new Pen(1000); // price 초기화
        Pen pen4 = new Pen("파란색", 2000); // color, price 초기화
        Pen pen5 = new Pen(3000, "오렌지색"); // price, color 초기화

        // 객체 배열
        // int[] arr1 = new int[5]; // 정수 배열(선호*)
        // int []arr2 = new int[5];
        // int arr3[] = new int[5];

        // Pen 객체 배열
        Pen[] arrPens = new Pen[5];
        arrPens[0] = pen1;
        arrPens[1] = pen2;
        arrPens[2] = pen3;
        arrPens[3] = pen4;
        arrPens[4] = pen5;

        // 객체 정보 확인
        for (Pen p : arrPens)
            System.out.println(p);

    }
}
