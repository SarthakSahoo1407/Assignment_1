public class Q04 {
    //binary search without recursion
    public static int binarySearch(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    //TC = O(log n)
    //SC = O(log n)
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        System.out.println("Index of "+key+" is: " +binarySearch(arr, 0, arr.length - 1, key));
    }
}
