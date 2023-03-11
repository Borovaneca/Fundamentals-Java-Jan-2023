package Fundamentals.TextProcessing.Exercise.MoreExercise;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] morseCode = scanner.nextLine().split(" ");

        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", "!", ",", "?", ".", "'", " "};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.", "|"};


        for (int index = 0; index <= morseCode.length - 1; index++) {
            for (int index1 = 0; index1 <= morse.length - 1; index1++) {

                if (morseCode[index].equals(morse[index1])) {
                    System.out.print(alpha[index1]);
                }
            }
        }

    }
}
