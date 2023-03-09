package Fundamentals.TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] bannedWords = scanner.nextLine().split(", ");
        String inputData = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String currentLength = "";
            for (int j = 0; j < bannedWords[i].length(); j++) {
                currentLength += "*";
            }
            inputData = inputData.replace(bannedWords[i], currentLength);
        }

        System.out.println(inputData);

    }
}
