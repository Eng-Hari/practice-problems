package Self_practice.practice_problem;
//Write a program to calculate discount on a product based on price ranges.

import java.util.Scanner;

public class Prob9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price :");
        int price = sc.nextInt();
        sc.close();
        if (price > 1000) {
            System.out.println("50% off :");
        } else if (price > 500) {
            System.out.println("40% off");
        } else {
            System.out.println("30% off");
        }
    }
}
