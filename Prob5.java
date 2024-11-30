package Self_practice.practice_problem;
//Write a program to check if a character is a vowel or consonant.

import java.util.Scanner;

public class Prob5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter :");
        char ch = sc.next().charAt(0);
        sc.close();
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Its vowel");
        } else {
            System.out.println("Its consonant");
        }
    }
}
