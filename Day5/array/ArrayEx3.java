package Day5.array;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 배열이나 Collection 타입의 데이터를 쉽게 반복처리하는 for문 예제

        // 정수형 배열 선언 및 생성.
        int[] arr1 = { 10, 20, 30, 40, 50 };
        // 일반 for문
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // 향상된 for문
        for (int a : arr1) {
            System.out.print(a + " ");
        }
        System.out.println();

        String[] arr2 = { "이순신", "강감찬", "홍길동", "이성계" };
        // 향상된 for문으로 작업...

        for (String a : arr2) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
