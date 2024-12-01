// Write a program to find the sum of natural numbers up to a given limit using a do-while loop.

public class Prob32 {

    public static void main(String[] args) {
        int sum = 0, n = 10, i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println(sum);
    }
}
