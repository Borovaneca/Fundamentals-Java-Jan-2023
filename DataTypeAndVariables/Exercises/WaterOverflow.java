package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int total = 0;

        for (int i = 1; i <= number; i++) {

            int pouredLiters = Integer.parseInt(scanner.nextLine());
            total += pouredLiters;
            if (total > capacity){
                System.out.println("Insufficient capacity!");
                total -= pouredLiters;
            }
            if (i == number){
                System.out.println(total);
            }

        }
    }
}
