package Fundamentals.Methods.Exercises.MoreExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        CenterPoint(x1, y1, x2, y2);
    }

    static void CenterPoint(double x1, double y1, double x2, double y2){

        DecimalFormat df = new DecimalFormat("0.####");
        double firstPointDistance = Math.sqrt((x1 * x1) + (y1 * y1));
        double secondPointDistance = Math.sqrt((x2 * x2) + (y2 * y2));
        if (firstPointDistance > secondPointDistance){
            System.out.printf("(%s, %s)", df.format(x2), df.format(y2));
        } else {
            System.out.printf("(%s, %s)", df.format(x1), df.format(y1));
        }
    }
}