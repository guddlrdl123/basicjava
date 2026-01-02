package Day4;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp949");
        // switch 동작 확인
        System.out.print("정수 입력 : ");
        int num1 = scanner.nextInt();
        System.out.println(formatterPaternSwitch(num1));
        System.out.print("정수 중 큰 Long값 입력 : ");
        long num2 = scanner.nextLong();
        System.out.println(formatterPaternSwitch(num2));
        System.out.print("실수값 입력 : ");
        double num3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(formatterPaternSwitch(num3));
        System.out.print("문자열 입력 : ");
        String text = scanner.nextLine();
        System.out.println(formatterPaternSwitch(text));
        System.out.print("boolean값 입력 (true, false) : ");
        boolean bool = scanner.nextBoolean();
        System.out.println(formatterPaternSwitch(bool));
        System.out.println("값이 없는 경우" + formatterPaternSwitch(null));

        scanner.close();
    }

    public static String formatterPaternSwitch(Object obj) {
        // 아래의 switch 볼 내용.
        // 1. break가 있나요?
        // 2. 각 case는 반환값 처리가 되고 있음.
        // 3. 타입 제한 사항을 확인.
        // 4. 타입 검사 뿐만 아닌 속성 검사 (when 키워드) -> 가드 패턴
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s when s.length() > 5 -> "Long String :" + s; // Guared Pattern
            case String s -> String.format("string %s", s);
            case null -> "Null Value";
            default -> obj.toString();
        };
    }
}
