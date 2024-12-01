// Write a program to calculate the sum of digits of a given number.

public class Prob22 {

    public static void main(String[] args) {
        int sum = 0, num = 123;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
