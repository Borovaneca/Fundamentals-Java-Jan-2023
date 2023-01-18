package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int charTimes = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = 1; i <= charTimes; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            total += currentChar;
        }
        System.out.printf("The sum equals: %d", total);
    }
}
