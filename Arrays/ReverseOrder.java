package Fundamentals.Arrays;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] number = new int[n];
        for (int i = number.length - 1; i >= 0; i--) {
            number[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
