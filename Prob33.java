//Write a program that keeps taking input from the user until they enter a negative number.

import java.util.Scanner;

public class Prob33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter a no. : ");
        do {
            i = sc.nextInt();
        } while (i >= 0);
    }
}
