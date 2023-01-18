package Fundamentals.DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short meters = scanner.nextShort();
        double kilometers = meters / 1000.0;

        System.out.printf("%.2f", kilometers);
    }
}
