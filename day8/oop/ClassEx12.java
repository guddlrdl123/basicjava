package day8.oop;

import day8.oop.quiz.Person;

public class ClassEx12 {
    // 다형성 테스트, Wrapper Class

    public static void main(String[] args) {
        // Wapper 선언 및 초기화
        Byte b = 10;
        Byte b1 = new Byte("20"); // depercated : 없어질 기능
        // 문자열을 해당 클래스로 파싱
        Byte b2 = Byte.parseByte("20");

        Short s = 2000;
        Short s1 = Short.parseShort("2000");

        Integer i = 100000;
        Long l = 2000000000L;
        Float f = 10.0021f;
        Double d = 10.3551542;
        Boolean bool = true;
        Character c = 'd';

        // Wrapper 클래스를 활용한 다양한 값 처리.
        // 이종 데이터를 처리하기 위한 클래스(다형성)

        Object[] arrObj = new Object[15];
        arrObj[0] = b;
        arrObj[1] = b1;
        arrObj[2] = b2;
        arrObj[3] = s;
        arrObj[4] = s1;
        arrObj[5] = i;
        arrObj[6] = l;
        arrObj[7] = f;
        arrObj[8] = d;
        arrObj[9] = bool;
        arrObj[10] = c;
        arrObj[11] = new int[10];
        arrObj[12] = "Hello world, Java!!";
        arrObj[13] = new day8.oop.objects.Person("홍길동", 25);
        arrObj[14] = new String("이게 되네");

        System.out.println("=====".repeat(10));
        for (Object o : arrObj)
            System.out.println(o);

    }
}
