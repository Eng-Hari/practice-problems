package Self_practice.practice_problem;
//Write a program to check if a triangle is valid based on side lengths.

import java.util.Scanner;

public class Prob8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for three sides : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a + b > c) {
            System.out.println("Its a triangle");
        } else {
            System.out.println("Its not a triangle");
        }
    }
}
