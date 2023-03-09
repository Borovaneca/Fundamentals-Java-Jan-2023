package Fundamentals.TextProcessing;


import java.util.Scanner;


public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String forbidText = scanner.nextLine();
        String inputData = scanner.nextLine();

        while (inputData.contains(forbidText)) {
            inputData = inputData.replace(forbidText, "");
        }
        System.out.println(inputData);
    }
}
