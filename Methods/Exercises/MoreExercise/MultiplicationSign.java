package Fundamentals.Methods.Exercises.MoreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        //Try to find if num1 * num2 * num3 is positive or negative without multiply them!
        isPositive(num1, num2, num3);

    }

    private static void isPositive(int num1, int num2, int num3) {
        int[] numbers = new int[3];
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        boolean isZero = false;
        boolean isPositive = false;
        boolean isNegative = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {

                if (numbers[i] == 0) {
                    isZero = true;
                }
            }
            if (numbers[i] < 0) {
                if (isNegative){
                    isNegative = false;
                } else {
                    isNegative = true;
                }
            } else {
                isPositive = true;
            }
        }

        if (isZero) {
            System.out.println("zero");
        } else if (isNegative) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }

    }
}
