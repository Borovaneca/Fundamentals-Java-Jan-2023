package Fundamentals.DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        int lastNum = 0;

        int firstNum = 0;

        boolean special = false;

        for (int i = 1; i <= num; i++) {

            firstNum = i;

            while (i > 0) {
                lastNum += i % 10;
                i = i / 10;
            }
            special = (lastNum == 5) || (lastNum == 7) || (lastNum == 11);
            if (special) {
                System.out.printf("%d -> True\n", firstNum);
            } else {
                System.out.printf("%d -> False%n", firstNum);
            }
            lastNum = 0;
            i = firstNum;
        }
    }
}

