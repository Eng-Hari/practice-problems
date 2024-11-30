// Write a program to print all prime numbers between 1 and 100 using a for loop.

public class Prob17 {

    public static void main(String[] args) {
        int i = 2;
        while (i <= 100) {  //loop for range
            boolean isprime = true; //assume i is prime
            for (int j = 2; j <= i / 2; j++) {  // loop for divisior
                if (i % j == 0) { //condition cheack for divisible no.
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
