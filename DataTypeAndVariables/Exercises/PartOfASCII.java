package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class PartOfASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        CurrentChar(start, end);
    }

    public static void CurrentChar(int start, int end){
        for (int i = start; i <= end; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");
        }
    }
}
