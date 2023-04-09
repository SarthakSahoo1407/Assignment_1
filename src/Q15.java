public class Q15 {
    //gcd of two numbers
    public static int gcd(int m, int n) {
        if (m < n) {
            return (gcd(n, m));
        }
        if (m % n == 0) {
            return (n);
        }
        return (gcd(n, m % n));
    }
    //driver code
    public static void main(String[] args) {
        int m = 10;
        int n = 28;
        System.out.println(gcd(m,n));
    }
}
