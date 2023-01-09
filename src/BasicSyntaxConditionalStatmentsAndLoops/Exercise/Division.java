package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inputNumber = Integer.parseInt(scanner.nextLine());
        int maxDivision = Integer.MIN_VALUE;

        if (inputNumber % 2 == 0) {
            maxDivision = 2;
        }
        if (inputNumber % 3 == 0) {
            maxDivision = 3;
        }
        if (inputNumber % 6 == 0) {
            maxDivision = 6;
        }
        if (inputNumber % 7 == 0) {
            maxDivision = 7;
        }
        if (inputNumber % 10 == 0) {
            maxDivision = 10;
        }
        if (maxDivision == Integer.MIN_VALUE) {
            System.out.println("Not divisible");
        } else {
            System.out.println("The number is divisible by " + maxDivision);
        }
    }
}
