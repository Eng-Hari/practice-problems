//Program to find the largest of two numbers using if-else.
package Self_practice.practice_problem;

import java.util.Scanner;

public class Prob4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no. :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        if (x > y) {
            System.out.println(x + " is greater");
        } else {
            System.out.println(y + " is greater");
        }

    }
}
