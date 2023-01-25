package Fundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int bestLength = 0;
        int endIndex = -1;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNum = numbers[i];
            int secondNum = numbers[i + 1];

            if (currentNum == secondNum) {
                length++;
                if (length > bestLength) {
                    bestLength = length;
                    endIndex = i + 1;
                }
            } else {
                length = 1;
            }
        }
        for (int i = endIndex; i > endIndex - bestLength ; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
