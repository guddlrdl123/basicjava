package day6;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        // 난수 생성 및 사용 예제

        // 1. Math.random() 사용
        // 0 ~ 1 미만의 값을 출력. 0.0 ~ 0.9999999....
        System.out.println(Math.random());
        // 0~9 사이의 정수 값 출력. 0~9
        System.out.println((int) (Math.random() * 10)); // 0 ~ 9
        // 1~10 사이의 정수 값 출력. 1~10
        System.out.println((int) (Math.random() * 10) + 1); // 1~10
        // 0.0 ~ 0.9 사이에 있는 실수 값 출력
        System.out.println((int) (Math.random() * 10) / 10.0); // 0.0 ~ 0.9

        // 2. Random 도구(Class)
        // Random 도구를 호출

        Random random = new Random();

        float fRandom = random.nextFloat(); // 0.0 ~ 0.999999
        double dRandom = random.nextDouble(); // 0.0 ~ 0.99999999999...
        boolean bRandom = random.nextBoolean(); // true or false
        int iRandom1 = random.nextInt(); // int의 모든 값
        int iRandom2 = random.nextInt(10); // 기준값 설정 0 ~ 9

        System.out.printf("%f, %f, %b, %d, %d", fRandom, dRandom, bRandom, iRandom1, iRandom2);
    }
}
