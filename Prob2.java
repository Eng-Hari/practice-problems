//Create a program to determine if a number is even or odd.
package Self_practice.practice_problem;

import java.util.Scanner;

public class Prob2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. :");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {
            System.out.println("The no. is even");
        } else {
            System.out.println("The no. is odd");
        }

    }
}
