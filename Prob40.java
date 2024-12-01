//Write a program to calculate the product of digits of a number using a do-while loop.

public class Prob40 {

    public static void main(String[] args) {
        int num = 1234, product = 1;
        do {
            product *= num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println(product);
    }

}
