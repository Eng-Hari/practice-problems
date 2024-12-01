// Program to check if a number is a palindrome using a while loop.

public class Prob23 {

    public static void main(String[] args) {
        int num = 321, reversed = 0, original = num;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (reversed == original) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Its not a plindrome");
        }
    }
}
