package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            boolean divisible = checkDivisible(i);
            if (divisible){
                boolean oddCheck = checkOddDigit(i);
                if (oddCheck){
                    System.out.println(i);
                }
            }
        }
    }


    public static boolean checkDivisible(int num){
        int sum = 0;
        while (num != 0){
            int currentNumber = num % 10;
            sum += currentNumber;
            num = num / 10;
        }
        if (sum % 8 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkOddDigit(int num){
        String stringNumber = String.valueOf(num);

        boolean find = false;
        for (int i = 0; i < stringNumber.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
            if (currentNum % 2 != 0){
                find = true;
                break;
            }
        }
        if (find){
            return true;
        } else {
            return false;
        }
    }
}
