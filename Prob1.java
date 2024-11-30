//Write a program to check if a number is positive, negative, or zero.
package Self_practice.practice_problem;

import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int num = sc.nextInt();
        sc.close();
        if (num > 0) {
            System.out.println("The no. is positive");
        } else if (num < 0) {
            System.out.println("The no. is negative");
        } else {
            System.out.println("The no. is zero");
        }
    }
}
