package Fundamentals.TextProcessing.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputData = scanner.nextLine().split("\\s+");
        BigDecimal totalSum = BigDecimal.valueOf(0);
        double sum = 0;
        int position = 0;
        for (int i = 0; i < inputData.length; i++) {
            sum = 0;
            StringBuilder builder = new StringBuilder();
            if (inputData[i].charAt(0) >= 65 && inputData[i].charAt(0) <= 90) {
                for (int j = 1; j < inputData[i].length(); j++) {
                    if (Character.isDigit(inputData[i].charAt(j))) {
                        builder.append(inputData[i].charAt(j));
                    }
                }
                position = inputData[i].charAt(0) - 64;
                sum += Double.parseDouble(builder.toString()) / position;
            } else {
                for (int j = 1; j < inputData[i].length(); j++) {
                    if (Character.isDigit(inputData[i].charAt(j))) {
                        builder.append(inputData[i].charAt(j));
                    }
                }
                position = inputData[i].charAt(0) - 96;
                sum += Double.parseDouble(builder.toString()) * position;
            }

            if (inputData[i].charAt(inputData[i].length() -1) >= 'a' && inputData[i].charAt(inputData[i].length() -1) <= 'z') {
                position = inputData[i].charAt(inputData[i].length() -1) - 96;
                sum += position;
            } else {
                position = inputData[i].charAt(inputData[i].length() -1) - 64;
                sum -= position;
            }

            totalSum = totalSum.add(BigDecimal.valueOf(sum));
        }
        System.out.printf("%.2f%n", totalSum);

    }
}
