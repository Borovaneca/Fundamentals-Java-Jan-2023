package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        char firstChar = first.charAt(0);
        char secondChar = second.charAt(0);

        charSequence(firstChar, secondChar);
    }

    public static void charSequence(char first, char second){

        while (first != second){
            if (second < first){
                second++;
                if (second == first){
                    break;
                }
                System.out.print(second + " ");
            } else {
                first++;
                if (first == second) {
                    break;
                }
                System.out.print(first + " ");
            }
        }
    }
}
