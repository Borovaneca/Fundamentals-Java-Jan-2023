package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class PokeMon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        double initialPokePower = pokePower;

        int pokedTargets = 0;

        while (pokePower >= distance) {
            pokedTargets++;
            pokePower -= distance;

            if (pokePower == initialPokePower * 0.5 && exhaustionFactor > 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.printf("%d%n", pokePower);
        System.out.println(pokedTargets);
    }
}
