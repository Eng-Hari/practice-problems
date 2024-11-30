package Self_practice.practice_problem;
// Write a program to check if a year is a leap year.

import java.util.Scanner;

public class Prob7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        sc.close();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Its a leep year");
        } else {
            System.out.println("Its not a leep year");
        }
    }
}
