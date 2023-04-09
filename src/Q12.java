public class Q12 {
    public static int ArrayIndexMaxDiff(int[] arr, int size){
        int[] leftMin = new int[size];
        int[] rightMax = new int[size];
        leftMin[0] = arr[0];
        int i, j;
        int maxDiff;
        for (i = 1; i < size; i++) {
            if (leftMin[i - 1] < arr[i])
                leftMin[i] = leftMin[i - 1];
            else
                leftMin[i] = arr[i];
        }
        rightMax[size - 1] = arr[size - 1];
        for (i = size - 2; i >= 0; i--) {
            if (rightMax[i + 1] > arr[i]) {
                rightMax[i] = rightMax[i + 1];
            }
            else {
                rightMax[i] = arr[i];
            }
        }
        i = 0;
        j = 0;
        maxDiff = -1;
        while (j < size && i < size) {
            if (leftMin[i] < rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i); j = j + 1;
            }
            else {
                i = i + 1;
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int[] arr = {33, 9, 10, 3, 2, 60, 30, 33, 1};
        System.out.println("MaxDiff : " + ArrayIndexMaxDiff(arr, arr.length));
    }
}
