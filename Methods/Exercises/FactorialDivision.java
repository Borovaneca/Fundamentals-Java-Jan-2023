package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = factorial(firstNum) / factorial(secondNum);
        System.out.printf("%.2f", result);

    }

    public static double factorial(int num){

        double currentSum = 1;
        for (int i = num; i >= 1; i--) {
            currentSum = currentSum * i;
        }
        return currentSum;
    }
}
