package Fundamentals.Methods.Exercises.MoreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input =scanner.nextLine();

        String value = scanner.nextLine();
        Value(input, value);

    }

    public static void Value(String input, String value){

        switch (input){
            case "int":
                int currentNumber = Integer.parseInt(value);
                IsInt(currentNumber);
                break;
            case "real":
                double currentDouble = Double.parseDouble(value);
                IsDouble(currentDouble);
                break;
            case "string":
                IsString(value);
                break;
        }
    }
    public static void IsInt(int number){
        System.out.println(number * 2);
    }
    public static void IsDouble(double number){
        System.out.printf("%.2f", number * 1.5);
    }
    public static void IsString(String text){
        System.out.printf("$%s$", text);
    }
}
