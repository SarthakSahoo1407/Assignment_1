public class Q10 {
    public static void maxMin(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int i = 0, j = n - 1, k = 0;
        while (i <= j) {
            if (k % 2 == 0) {
                output[k] = arr[j];
                j--;
            } else {
                output[k] = arr[i];
                i++;
            }
            k++;
        }
        for (int l = 0; l < n; l++) {
            System.out.print(output[l] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = { 7,6,5,4,3,2,1};
        maxMin(arr);
    }
}

