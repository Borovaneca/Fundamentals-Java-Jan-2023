package Fundamentals.Methods.Exercises.MoreExercise;

import java.util.Scanner;

public class TribunacciSequenceWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int[] numbersToPrint = numbersToPrint(count);
        for (int i = 0; i < count; i++) {
            System.out.print(numbersToPrint[i] + " ");
        }

    }

    private static int[] numbersToPrint(int count) {
        int[] numbersArray = new int[count];
        for (int i = 0; i < count; i++) {
            if (i == 0 || i == 1) {
                numbersArray[i] = 1;
            } else if (i == 2) {
                numbersArray[i] = 2;
            } else if (i > 1) {
                numbersArray[i] = numbersArray[i - 1] + numbersArray[i - 2] + numbersArray[i - 3];
            }
        }
        return numbersArray;
    }
}

