package Fundamentals.DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chars = "";

        for (int i = 0; i < 3; i++) {
            char symbol = scanner.nextLine().charAt(0);
            chars = chars + symbol;
        }
        System.out.println(chars);
    }
}
