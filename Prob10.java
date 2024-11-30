package Self_practice.practice_problem;
//Write a program that reads three numbers and prints the greatest one.

import java.util.Scanner;

public class Prob10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no. :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a > b && a > c) {
            System.out.println("A is greater");
        } else if (b > a && b > c) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater");
        }
    }
}
