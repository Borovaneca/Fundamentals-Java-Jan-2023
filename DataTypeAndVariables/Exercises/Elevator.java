package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int persons = Integer.parseInt(scanner.nextLine());
        int total = number / persons;

        boolean remainder = number % persons != 0;
        if (remainder){
            total += 1;
        }
        System.out.println(total);
    }
}
