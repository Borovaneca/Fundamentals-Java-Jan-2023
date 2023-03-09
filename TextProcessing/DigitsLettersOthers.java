package Fundamentals.TextProcessing;

import java.util.Scanner;

public class DigitsLettersOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        String inputData = scanner.nextLine();

        for (int i = 0; i < inputData.length(); i++) {
            if (Character.isDigit(inputData.charAt(i))) {
                digits.append(inputData.charAt(i));
            } else if (Character.isLetter(inputData.charAt(i))) {
                letters.append(inputData.charAt(i));
            } else {
                others.append(inputData.charAt(i));
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
