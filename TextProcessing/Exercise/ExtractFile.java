package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();
        int endIndex = input.indexOf('.');
        int startIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\\') {
                startIndex = i + 1;
            }
        }
        String fileName = input.substring(startIndex, endIndex);
        String fileType = input.substring(endIndex + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileType);
    }
}
