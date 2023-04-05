public class Q16 {
    //all permutations of an integer list recursively
    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    private static void swap(int[] arr, int l, int i) {
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        permute(arr, 0, arr.length - 1);
    }

}
