package Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean different = false;
        int index = 0;
        int sum = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != secondArr[i]){
                different = true;
                index = i;
                break;
            } else {
                sum += firstArr[i];
            }
        }
        if (different){
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
