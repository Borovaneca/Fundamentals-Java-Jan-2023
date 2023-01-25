package Fundamentals.DataTypeAndVariables.Exercises.Exercises.MoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputLines; i++) {
            String[] inputArray = scanner.nextLine().split(" ");
            long firstNumber = Long.parseLong(inputArray[0]);
            long secondNumber = Long.parseLong(inputArray[1]);

            long currentNumber = Math.abs(Math.max(firstNumber, secondNumber));
            long sumOfDigits = 0;
            long currentDigit;

            while (currentNumber > 0) {
                currentDigit = (currentNumber % 10);
                sumOfDigits = sumOfDigits + currentDigit;

                currentNumber = currentNumber / 10;
            }
            System.out.println(sumOfDigits);
        }
    }
}
