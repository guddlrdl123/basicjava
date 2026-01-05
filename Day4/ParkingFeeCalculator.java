package Day4;

import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주차 시간을 입력해 주세요. (분) : ");
        int time = scanner.nextInt();
        double fee = 0;

        if (time >= 600) {
            System.out.println("최대 요금 30,000원 입니다");
        } else if (60 < time) {
            fee = ((time - 60) / 10.0) < 1 ? (time - 60) : ((time - 60) / 10 + 1);
            System.out.printf("주차 시간 %d분, 요금은 %,d원 입니다.", time, (int) (fee * 500 + 3000));
        } else {
            System.out.println("기본 요금 3,000원 입니다.");
        }

        scanner.close();
    }
}