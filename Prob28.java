// Write a program to count the number of digits in a number.

public class Prob28 {

    public static void main(String[] args) {
        int sum = 0, count = 0, n = 10, i = 1;
        while (count < n) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

}
