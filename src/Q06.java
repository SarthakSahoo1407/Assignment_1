public class Q06 {
    //    Input: arr[] = {1, 2, 3, -2, 5}
//    Output: 9
//    Explanation: Subarray {1, 2, 3, -2, 5} has maximum sum of elements 9
//    Input: arr[] = {-1, -2, -3, -4}
//    Output: -1
//    Explanation: Subarray {-1} has maximum sum of elements -1
//    Input: arr[] = {1, -2, 3, -1, 2}
//    Output: 3
//    Explanation: Subarray {3, -1, 2} has maximum sum of elements 3
    public static int maxSum(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 2, 3, -2, 5};
        System.out.println(maxSum(arr));
    }
}
