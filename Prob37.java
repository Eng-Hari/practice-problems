// Write a program to find the factorial of a number using a do-while loop.

public class Prob37 {

    public static void main(String[] args) {
        int num = 5, fact = 1;
        do {
            fact *= num;
            num--;
        } while (num > 0);
        System.out.println(fact);
    }
}
