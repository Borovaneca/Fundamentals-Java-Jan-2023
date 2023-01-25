package Fundamentals.Arrays;

import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");

        for (int i = inputArr.length - 1; i >= 0; i--) {

            System.out.print(inputArr[i] + " ");
        }
    }
}
