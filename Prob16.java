//  Write a program to check if a number is prime using a for loop.

public class Prob16 {

    public static void main(String[] args) {
        int n = 51;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                break;
            }
            System.out.println("Its a prime");
        }
    }
}
