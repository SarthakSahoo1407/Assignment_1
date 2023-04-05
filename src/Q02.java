import java.util.Scanner;

public class Q02 {
public static void binary(int n) {
        if (n == 0) {
            return;
        }
        binary(n / 2);
        System.out.print(n % 2);
        //tc is O(log n)
        //TC = O(log n) + O(log n) = O(log n)

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        binary(n);
    }
}
