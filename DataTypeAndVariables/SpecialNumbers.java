package Fundamentals.DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            int number = i % 10;
            int number1 = i / 10;
            int sum = number + number1;
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
