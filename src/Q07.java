import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 3, 4, 5, 6, 4, 2};
        WaveArray2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void WaveArray2(int[] arr) {
        int size = arr.length;
        for ( int i = 1 ;i < size; i+= 2) {
            if ((i - 1) >= 0 && arr[i] > arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            if ((i + 1) < size && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
