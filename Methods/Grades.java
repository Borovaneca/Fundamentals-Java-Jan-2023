package Fundamentals.Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade= Double.parseDouble(scanner.nextLine());
        checkGrade(grade);
    }

    public static void checkGrade(double num){
            if (num <= 2.99){
                System.out.println("Fail");
            } else if (num <= 3.49){
                System.out.println("Poor");
            } else if (num <= 4.49){
                System.out.println("Good");
            } else if (num <= 5.49){
                System.out.println("Very good");
            } else {
                System.out.println("Excellent");
            }
    }
}
