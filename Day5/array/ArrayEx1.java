package Day5.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열의 선언과 배열 생성

        // 배열 선언 : int[] 배열명
        // 배열 생성 : 배여령 = new int[5]; // 5는 배열의 사이즈.(5개의 데이터 가짐)
        int[] arrInt;
        arrInt = new int[5]; // 배열은 값이 선언되지 않으면 기본값 처리.

        System.out.println(arrInt.toString()); // 결과 : [I@6842775d 해쉬값이 출력됨
        // 배열의 값 출력
        System.out.println("arrInt의 길이 : " + arrInt.length);
        for (int i = 0; i < arrInt.length; i++) { // 배열.length는 배열의 길이
            // 배열의 값 참조(불러오기) : 배열명[index]로 불러옴. index는 배열의 순서.
            System.out.print(arrInt[i] + " ");
        }

        // 배열을 사용하는 이유 중 하나가 여러 데이터를 모앙서 변수 처럼 사용.
        // 위에 선언된 arrInt는 int형 변수 5개가 선언된 것과 같음.
        arrInt[0] = 10;
        arrInt[1] = 20;
        arrInt[2] = 30;
        arrInt[3] = 40;
        arrInt[4] = 50;
        System.out.println("arrInt[0] + arrInt[2] 결과 : " + (arrInt[0] + arrInt[2]));
        System.out.println("arrInt[0] += arrInt[2] 결과 : " + (arrInt[0] += arrInt[2]));

        System.out.println(arrInt[0]);

        // 배열의 복사.
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("arr1의 길이" + arr1.length);
        // arr의 내용 출력
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0)
                System.out.print("{" + arr1[i] + ",");
            else if (i != arr1.length - 1)
                System.out.print(+arr1[i] + ",");

            else
                System.out.println(arr1[i] + "}\n");
        }

        // System.arraycopy() 함수
        // System.arraycopy(Object src, int srcPos, Object dst, int dstPos, int length)
        // src - 원본, srcPos 원본에 있는 배열의 인덱스값(복사 시작 위치)
        // dst - 복사할 위치, dstPos 복사할 배열의 인덱스값(복사 저장 위치)
        // length - 복사할 데이터의 길이.

        // 사용 예
        // arr1 = {1,2,3,4,5,6,7,8,9,10}
        // arrInt = {40, 20, 30, 40, 50}
        System.arraycopy(arrInt, 1, arr1, 3, 4);

        for (int i = 0; i < arr1.length; i++) {
            if (i == 0)
                System.out.print("{" + arr1[i] + ",");
            else if (i != arr1.length - 1)
                System.out.print(+arr1[i] + ",");

            else
                System.out.println(arr1[i] + "}\n");
        }
        // {1,2,3,20,30,40,50,8,9,10}
    }
}
