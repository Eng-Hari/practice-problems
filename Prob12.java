//Write a program to find the factorial of a number using a for loop.

public class Prob12 {

    public static void main(String[] args) {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
