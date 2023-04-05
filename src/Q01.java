import java.util.Scanner;

public class Q01 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { //the square root of n is the largest possible factor of n
            if (n % i == 0) {                     //if n is divisible by i, then n is not prime
                return false;                     //TC = O(sqrt(n))
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
