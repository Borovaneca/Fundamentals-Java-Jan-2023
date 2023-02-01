package Fundamentals.Methods.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int result = calcVowels(input);
        System.out.println(result);
    }

    public static int calcVowels(String text){
        char[] vowels = new char[] {'A','a','O','o','U','u','E','e','I','i','Q','q'};
        int count = 0;
        for (int i = 0; i < vowels.length; i++) {
            for (int j = 0; j < text.length(); j++) {
                char vowelsChar = vowels[i];
                char textChar = text.charAt(j);
                if (vowelsChar == textChar){
                    count++;
                }

            }
        }
        return count;
    }
}
