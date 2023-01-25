package Fundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number.length; i++) {
            int currentNum = number[i];
            for (int j = i+1; j < number.length; j++) {
                int powerNumber = number[j];
                if (currentNum + powerNumber == sumNumber){
                    System.out.printf("%d %d\n", currentNum, powerNumber);
                }
            }
        }
    }
}
