package Fundamentals.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(bigger(first, second));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(bigger(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(bigger(firstString, secondString));
                break;
        }
    }

    public static String bigger(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

    public static char bigger(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static int bigger(int first, int second) {
            if (first > second){
                return first;
            } else {
                return second;
            }
    }
}