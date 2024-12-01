// Write a program to reverse a number using a while loop.

public class Prob24 {

    public static void main(String[] args) {
        int num = 123, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
