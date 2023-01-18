package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises.MoreMore;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double difference = 0;
        if (first < 0 && second < 0){
            difference = Math.abs(first - second);
        } else if (first < 0){
            difference = first + second;
        } else if (second < 0){
            difference = second + first;
        } else {
            difference = Math.abs(first - second);
        }
        double eps = 0.0000001;

        if (difference < eps){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
