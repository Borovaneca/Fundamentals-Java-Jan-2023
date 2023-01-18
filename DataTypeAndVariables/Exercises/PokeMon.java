package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        double originalValue = pokePower;
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokes = 0;
        double percent = ((originalValue / 2) / originalValue) * 100;

        while (pokePower >= distanceBetweenTargets) {
            pokePower -= distanceBetweenTargets;
            pokes++;

            if (percent == (pokePower / originalValue) * 100 && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokes);
    }
}
