package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputData = scanner.nextLine().split(" ");

        char[] first = inputData[0].toCharArray();
        char[] second = inputData[1].toCharArray();

        int sum = execute(first, second);

        System.out.println(sum);
    }

    private static int execute(char[] first, char[] second) {
        int sum = 0;

        if (first.length > second.length) {
            for (int i = 0; i < first.length; i++) {
                if (i <= second.length - 1) {
                    sum += first[i] * second[i];
                } else {
                    sum += first[i];
                }
            }
            return sum;

        } else if (first.length < second.length) {
            for (int i = 0; i < second.length; i++) {
                if (i <= first.length - 1) {
                    sum += second[i] * first[i];
                } else {
                    sum += second[i];
                }
            }
            return sum;

        } else {
            for (int i = 0; i < first.length; i++) {
                sum += first[i] * second[i];
            }
            return sum;
        }
    }
}
