package Fundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isEqual = false;

        for (int i = 0; i < numsArr.length; i++) {

            int currentElement = numsArr[i];
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numsArr[j];
            }
            for (int j = numsArr.length - 1; j > i; j--) {
                rightSum += numsArr[j];
            }

            if (leftSum == rightSum){
                System.out.println(i);
                isEqual = true;
                break;
            }
        }
        if (!isEqual){
            System.out.println("no");
        }
    }
}
