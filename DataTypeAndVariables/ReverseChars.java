package Fundamentals.DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class ReverseChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = "";
        String second = "";

        for (int i = 0; i < 3; i++) {
            char chaR = scanner.nextLine().charAt(0);
            first += chaR;
        }
        for (int i = first.length() - 1; i >= 0; i--) {
            char chaR = first.charAt(i);
            second += chaR;
            System.out.print(chaR + " ");
        }
    }
}
