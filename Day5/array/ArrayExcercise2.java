package Day5.array;

public class ArrayExcercise2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int addValue = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += addValue;
            addValue += 10;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
