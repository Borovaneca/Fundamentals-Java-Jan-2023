package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int result = smallest(first, second, third);
        System.out.println(result);
    }

    public static int smallest(int first, int second, int third){
        int smallest = Integer.MAX_VALUE;
        if (first < smallest){
            smallest = first;
        }
        if (second < smallest){
            smallest = second;
        }
        if (third < smallest){
            smallest = third;
        }
        return smallest;
    }
}
