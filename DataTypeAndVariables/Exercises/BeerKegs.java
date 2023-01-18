package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());

        String winner = "";
        float max = 0;
        for (int i = 1; i <= input; i++) {
            String model = scanner.nextLine();
            String radius = scanner.nextLine();
            String height = scanner.nextLine();
            float current = bigger(radius, height);
            if (current > max){
                max = current;
                winner = model;
            }
        }
        System.out.println(winner);
    }

    public static float bigger(String radius, String height){

        float convertedRadius = Float.parseFloat(radius);
        int convertedHeight = Integer.parseInt(height);

        float volume = (Float.parseFloat(String.valueOf(Math.PI))) * (Float.parseFloat(String.valueOf(Math.pow(convertedRadius, 2)))) * convertedHeight;
        return volume;
    }
}
