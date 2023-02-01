package Fundamentals.Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String function = scanner.nextLine();
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        switch (function) {
            case "add":
                add(first, second);
                break;
            case "multiply":
                multiply(first, second);
                break;
            case "subtract":
                subtract(first, second);
                break;
            case "divide":
                divide(first, second);
                break;
        }

    }

    public static void add(int firstNumber, int secondNumber){
        System.out.println(Math.abs(firstNumber + secondNumber));
    }
    public static void multiply(int firstNumber, int secondNumber){
        System.out.println(firstNumber * secondNumber);
    }
    public static void subtract(int firstNumber, int secondNumber){
        System.out.println(Math.abs(firstNumber - secondNumber));
    }
    public static void divide(int firstNumber, int secondNumber){
        System.out.println(firstNumber / secondNumber);
    }
}
