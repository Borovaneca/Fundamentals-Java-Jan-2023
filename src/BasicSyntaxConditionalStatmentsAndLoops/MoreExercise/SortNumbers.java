package BasicSyntaxConditionalStatmentsAndLoops.MoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int midNumber = 0;
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber > max) {
            max = firstNumber;
        }

        if (secondNumber > max) {
            max = secondNumber;
        }

        if (thirdNumber > max) {
            max = thirdNumber;
        }

        if (firstNumber < min) {
            min = firstNumber;
        }

        if (secondNumber < min) {
            min = secondNumber;
        }

        if (thirdNumber < min) {
            min = thirdNumber;
        }

        if (firstNumber == max && thirdNumber == min || thirdNumber == max && firstNumber == min) {
            midNumber = secondNumber;
        } else if (secondNumber == max && thirdNumber == min || secondNumber == min && thirdNumber == max) {
            midNumber = firstNumber;
        } else {
            midNumber = thirdNumber;
        }

        System.out.println(max);
        System.out.println(midNumber);
        System.out.println(min);

    }
}
