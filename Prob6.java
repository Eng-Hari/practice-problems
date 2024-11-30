package Self_practice.practice_problem;
//Write a program to 
//find the grade of a student based on marks (90+ A, 80+ B, etc.).

import java.util.Scanner;

public class Prob6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark :");
        int mark = sc.nextInt();
        sc.close();
        if (mark >= 90) {
            System.out.println("grade : A");
        } else if (mark >= 80) {
            System.out.println("grade : B");
        } else {
            System.out.println("grade : C");
        }
    }
}
