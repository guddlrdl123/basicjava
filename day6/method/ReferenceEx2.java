package day6.method;

public class ReferenceEx2 {
    public static void main(String[] args) {
        // 참조자료형 - 배열

        // 배열 생성
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };

        // 참조형은 주소를 변수에 저장합니다. 때문에 array1, array2의 값은 같으나
        // 생성된 위치가 같은 것은 아니다.
        System.out.println("array1 == array2의 결과 : " + (array1 == array2));

        // 참조형 데이터 타입은 대입 연산자를 사용하면, 얕은 복사(shallo copy)를 합니다.
        // 얕은 복사를 진행하면, 값이 아닌 주소를 복사합니다.
        // 예로 array1의 주소가 0x1383982 이라면, array2의 주소는 0x2983029일 수 있다는 의미
        // array3 = array1 하게 되면, array3의 주소는 0x1383982을 저장하게 됩니다.
        int[] array3 = array1;
        System.out.println("array1 == array3의 결과 : " + (array1 == array3)); // true
        // 내가 아무 작업 안 하면, 참조형은 단순하게 equals()를 사용해도 같다고 할 수 없다.
        System.out.println("arr1.equals(array3)의 결과 : " + (array1.equals(array2))); // false

        // 질문... array1과 array3이 주소가 같다면, array3의 값을 변경했을 때..
        // array1은 어떻게 될까

        array3[2] = array3[2] * 10;
        for (int a : array3) {
            System.out.println(a + " ");
        }

    }
}
