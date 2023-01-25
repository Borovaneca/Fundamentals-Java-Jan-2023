package Fundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] input = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] leftArr = new int[input.length];
        int[] rightArr = new int[input.length];
        boolean isEqual = false;
        boolean checker = false;

        if (input.length == 1) {
            System.out.println("0");
        } else {
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < i; j++) {
                    leftArr[j] = input[j];
                }

                for (int j = input.length - 1; j > i; j--) {
                    rightArr[j] = input[j];
                }
                isEqual = isEqual(leftArr, rightArr);
                leftArr = new int[input.length];
                rightArr = new int[input.length];
                if (isEqual) {
                    checker = true;
                    System.out.println(i);
                    break;
                }
            }

            if (!checker) {
                System.out.println("no");
            }
        }
    }
    public static boolean isEqual(int[] leftNumbers, int[] rightNumbers) {

        int leftSide = 0;
        int rightSide = 0;
        for (int i = 0; i < leftNumbers.length; i++) {
            leftSide += leftNumbers[i];
        }
        for (int i = 0; i < rightNumbers.length; i++) {
            rightSide += rightNumbers[i];
        }
        return leftSide == rightSide;
    }
}