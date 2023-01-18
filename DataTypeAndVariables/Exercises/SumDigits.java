package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String numbers = String.valueOf(number);

        int sum = 0;

        for (int i = 0; i <= numbers.length() - 1; i++) {
            char current = numbers.charAt(i);
            int currentNum = Integer.parseInt(String.valueOf(current));
            sum += currentNum;

        }
        System.out.println(sum);
    }
}
