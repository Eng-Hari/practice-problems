// Write a program to print all prime numbers between 1 and 100. 

public class Prob26 {

    public static void main(String[] args) {
        int i = 2;
        while (i < 100) {
            boolean isprime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
            }

            i++;
        }
    }

}
