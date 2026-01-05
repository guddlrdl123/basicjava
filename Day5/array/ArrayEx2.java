package Day5.array;

public class ArrayEx2 {
    public static void main(String[] args) {

        // main 함수의 String[] args에 대해서...

        System.out.println("메인 함수의 args의 갯수 : " + args.length);

        // System.out.println("args에 있는 값들...");
        // for (int i = 0; i < args.length; i++) {
        // System.out.println(args[i]);
        // }

        // 두 수를 입력 받아서 더하기
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        System.out.println("결과 : " + (number1 + number2));
    }
}
