// Write a program to find the factorial of a number using a while loop.

public class Prob25 {

    public static void main(String[] args) {
        int num = 5, fact = 1;
        while (num >= 1) {
            fact *= num;
            num--;
        }
        System.out.println(fact);
    }

}
