public class Q04 {
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, high, key);
    }
    //TC = O(log n)
    //SC = O(log n)
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        System.out.println("Index of "+key+" is: " +binarySearch(arr, 0, arr.length - 1, key));
    }
}
