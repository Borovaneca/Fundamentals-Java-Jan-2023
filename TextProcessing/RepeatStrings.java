package Fundamentals.TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputData = scanner.nextLine().split(" ");
        String output = "";

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData[i].length(); j++) {
                output += inputData[i];
            }
        }

        System.out.println(output);
    }
}
