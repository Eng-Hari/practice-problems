// Write a program to print the sum of the first N natural numbers using a for loop.

public class Prob15 {

    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
