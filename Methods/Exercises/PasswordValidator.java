package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        boolean length = length(input);
        boolean invalidSymbols = invalidSymbols(input);
        if (!invalidSymbols){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean checkNumbers = checkNumbers(input);
        boolean total = length && invalidSymbols && checkNumbers;
        if (total){
            System.out.println("Password is valid");
        }
    }

    public static boolean length(String text) {

        if (text.length() < 6 || text.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        } else {
            return true;
        }
    }

    public static boolean invalidSymbols(String text) {
        String[] invalidSymbols = {"+", ".", ">", "<", "-", "'", "§", "$", "%", "&", "/", "(", ",", ")", "=", "?", "!", "`", ":", ";", "*", "~"};

        boolean checked = false;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (checked){
                break;
            }

            if (currentChar >= 65 && currentChar <= 90 || currentChar >= 97 && currentChar <= 122 || currentChar >= 48 && currentChar <= 57){
                checked = false;
            } else {
                checked = true;
            }
        }
        if (checked) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkNumbers(String text) {
        int count = 0;
        boolean checked = false;
        char[] number = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < number.length; j++) {
                char currentChar = text.charAt(i);
                char charArr = number[j];
                if (currentChar == charArr) {
                    count++;
                    if (count == 2) {
                        checked = true;
                        break;
                    }
                }
            }
            if (checked) {
                break;
            }
        }
        if (checked) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}
