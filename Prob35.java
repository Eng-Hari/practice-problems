// Program to reverse a given number using a do-while loop.

public class Prob35 {

    public static void main(String[] args) {
        int num = 123, reversed = 0;
        do {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println(reversed);
    }
}
