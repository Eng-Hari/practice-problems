//Write a program to calculate the sum of digits of a number using a do-while loop.

public class Prob34 {

    public static void main(String[] args) {
        int sum = 0, num = 12345;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println(sum);
    }
}
