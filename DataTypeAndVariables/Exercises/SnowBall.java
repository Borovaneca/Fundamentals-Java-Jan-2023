package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class SnowBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());

        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        double calc = Double.MIN_VALUE;

        for (int i = 1; i <= input; i++) {
            int currentSnowballSnow = Integer.parseInt(scanner.nextLine());
            int currentSnowballTime = Integer.parseInt(scanner.nextLine());
            int currentSnowballQuality = Integer.parseInt(scanner.nextLine());

            double currentCalc = Math.pow((double)(currentSnowballSnow / currentSnowballTime), (double)currentSnowballQuality);
            if (currentCalc > calc){
                snowballSnow = currentSnowballSnow;
                snowballTime = currentSnowballTime;
                snowballQuality = currentSnowballQuality;
                calc = currentCalc;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, calc, snowballQuality);
    }
}
