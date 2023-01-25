package Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0){
                sum += number[i];
            }
        }
        System.out.println(sum);
    }
}
