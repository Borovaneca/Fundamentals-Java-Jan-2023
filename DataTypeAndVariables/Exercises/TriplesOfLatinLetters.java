package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        threeCalc(number);
    }

    public static void threeCalc(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
