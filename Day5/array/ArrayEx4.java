package Day5.array;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 다차원 배열.. 교재 p.128 예제
        // 첫 번째 2차원 배열
        int[][] matrix = new int[3][3]; // 3x3 행렬 (10, 20, 30... 90)
        /*
         * {{10, 20, 30}, // int[0][] = {10, 20, 30}
         * {40, 50, 60}, // int[1][] = {40, 50, 60}
         * {70, 80, 90}} // int[2][] = {70, 80, 90}
         */
        // 하나씩 대입 : in[0][0]=10, int[0][1]=20, ...int[2][1]=80, int[2][2]=90

        int value = 10;
        // for문을 사용한 값의 대입
        for (int i = 0; i < matrix.length; i++) {
            // matrix.length? 3
            // matrix[0].length? 3
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                value += 10;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
