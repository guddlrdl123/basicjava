package Day5.array;

public class ArrayExcercise3 {
    public static void main(String[] args) {
        char[] arr = new char[5];

        arr[0] = 'H';
        arr[1] = 'e';
        arr[2] = 'l';
        arr[3] = 'l';
        arr[4] = 'o';

        System.out.printf("{%s %s %s %s %s}", arr[0], arr[1], arr[2], arr[3], arr[4]);
        String text = new String(arr);
        System.out.println(text);
    }
}
