// Write a program that checks
// whether a person is eligible to vote based on age.

import java.util.Scanner;

public class Prob3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Can vote.");
        } else {
            System.out.println("can't vote");
        }
    }
}
