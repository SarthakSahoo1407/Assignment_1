public class Q11 {
    public static int maxCircularSum(int[] arr, int size){ int sumAll = 0;
        int currVal = 0;
        int maxVal;
        for(int i = 0; i< size ; i++){ sumAll += arr[i];
            currVal += (i*arr[i]);
        }
        maxVal = currVal;
        for(int i= 1; i< size; i++){
            currVal = ( currVal + sumAll ) - ( size * arr[size-i] ); if (currVal > maxVal){
                maxVal = currVal;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {10,2, 1, 6};
        System.out.println("MaxCirculrSm: " + maxCircularSum(arr, arr.length)); }
}