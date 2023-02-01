package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        while (!input.equals("END")){

            int number = Integer.parseInt(input);
            boolean palindromeChecker = palindromeResult(number);
            if (palindromeChecker){
                System.out.println(palindromeChecker);
            } else {
                System.out.println(palindromeChecker);
            }
            input = scanner.nextLine();
        }
    }

    public static boolean palindromeResult(int number){
        String unReversedNumber = String.valueOf(number);
        String reversedNumber = "";
        while (number != 0){
            int currentNumber = number % 10;
            reversedNumber += String.valueOf(currentNumber);
            number = number / 10;
        }
        if (unReversedNumber.equals(reversedNumber)){
            return true;
        } else {
            return false;
        }
    }
}
