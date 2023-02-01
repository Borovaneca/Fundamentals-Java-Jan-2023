package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(calcLength(input));
    }

    public static String calcLength(String text){

        int count = 0;
        String midChar = "";
        for (int i = 0; i < text.length(); i++) {
            count++;
        }
        if (count % 2 == 0){
            midChar = evenLength(text);
        } else {
            midChar = oddLength(text);
        }
        return midChar;
    }

    public static String evenLength(String text){

        int calcMiddle = text.length() - 2;
        int remainCharacters = calcMiddle / 2;
        String midChars = "";

        for (int i = 0; i < remainCharacters + 2; i++) {
            if (i > remainCharacters - 1){
                midChars += text.charAt(i);
            }
        }
        return midChars;
    }

    public static String oddLength(String text){

        int calcMiddle = text.length() - 1;
        int remainCharacter = calcMiddle / 2;
        String midChar = "";

        for (int i = 0; i < remainCharacter + 1; i++) {
            if (i == remainCharacter){
                midChar += text.charAt(i);
            }
        }
        return midChar;
    }
}
