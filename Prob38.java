// Write a program to print the first 10 odd numbers using a do-while loop.

public class Prob38 {

    public static void main(String[] args) {
        int i = 1, count = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
            i++;
        } while (count < 10);

    }
}
