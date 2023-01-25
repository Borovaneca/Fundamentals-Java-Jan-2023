package Fundamentals.Arrays.Exercise.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int dnaLength = Integer.parseInt(scanner.nextLine());
        int[] sample;
        String command = scanner.nextLine();
        int bestSumOfOnes = 1;
        int bestLength = 1;
        int bestLeftIndex = 1;
        int[] bestSample = new int[dnaLength];
        int sampleCounter = 0;
        int bestCounter = 0;

        while (!command.equals("Clone them!")) {
            sample = Arrays.stream(command.split("!+")).mapToInt(Integer::parseInt).toArray();
            sampleCounter++;
            int sumOfOnes = 1;
            int onesLength = 1;
            int biggerLength = 1;
            int startIndex = 0;

            for (int i = 0; i < sample.length - 1; i++) {
                int endIndex = 0;
                if (i == sample.length - 2 && sample[i + 1] == 0) {
                    sumOfOnes--;
                }
                if (sample[i] == 1) {
                    sumOfOnes++;
                    if (sample[i + 1] == 1) {
                        onesLength++;
                        endIndex = i + 1;
                        startIndex = endIndex - onesLength + 1;
                        if (onesLength > biggerLength) {
                            biggerLength = onesLength;
                        }
                    }
                } else {
                    onesLength = 1;
                }
            }
            if (biggerLength > bestLength) {
                bestLength = biggerLength;
                bestLeftIndex = startIndex;
                bestSumOfOnes = sumOfOnes;
                bestSample = sample;
                bestCounter = sampleCounter;

            } else if (biggerLength == bestLength) {
                if (startIndex < bestLeftIndex) {
                    bestLeftIndex = startIndex;
                    bestSumOfOnes = sumOfOnes;
                    bestSample = sample;
                    bestCounter = sampleCounter;

                } else if (startIndex == bestLeftIndex) {
                    if (sumOfOnes > bestSumOfOnes) {
                        bestSumOfOnes = sumOfOnes;
                        bestSample = sample;
                        bestCounter = sampleCounter;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCounter, bestSumOfOnes);
        for (int index :
                bestSample) {
            System.out.print(index + " ");
        }
    }
}