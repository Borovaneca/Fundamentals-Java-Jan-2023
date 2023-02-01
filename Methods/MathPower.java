package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(mathPower(number, power)));
    }

    public static double mathPower(double num, int power){

        return Math.pow(num, power);
    }
}
