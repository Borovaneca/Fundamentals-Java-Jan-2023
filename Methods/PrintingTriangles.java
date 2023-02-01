package Fundamentals.Methods;

import java.util.Scanner;

public class PrintingTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTriangle(number);

    }

    public static void printTriangle(int num){

        for (int i = 1; i <= num; i++) {
            increment(1, i);
        }
        for (int i = num -1; i >= 1; i--) {
            decrement(i);
        }
    }

    public static void increment(int start, int end){

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void decrement(int end){

        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
