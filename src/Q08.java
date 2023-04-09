import java.util.Arrays;

public class Q08 {
    public static void main(String[] args) {
        int[] arr = {8, -1, 6, 1, 9, 3, 2, 7, 4, -1};
        int size = arr.length;
        indexArray(arr, size);
        System.out.println(Arrays.toString(arr));
    }

    private static void indexArray(int[] arr, int size) {
        int temp;
        for (int i = 0; i < size; i++)
        {
            while (arr[i] != -1 && arr[i] != i) {
                /* swap arr[i] and arr[arr[i]] */
                temp = arr[i];
                arr[i] = arr[temp]; arr[temp] = temp; }
        }
    }
}
