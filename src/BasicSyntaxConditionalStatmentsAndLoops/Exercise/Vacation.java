package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalSum = 0;
        switch (day) {
            case "Friday":
                if (type.equals("Students")) {
                    totalSum = people * 8.45;
                } else if (type.equals("Business")) {
                    totalSum = people * 10.90;
                    if (people >= 100) {
                        totalSum = totalSum - (10 * 10.90);
                    }
                } else {
                    totalSum = people * 15;
                }
                break;

            case "Saturday":
                if (type.equals("Students")) {
                    totalSum = people * 9.80;
                } else if (type.equals("Business")) {
                    totalSum = people * 15.60;
                    if (people >= 100) {
                        totalSum = totalSum - (10 * 15.60);
                    }
                } else {
                    totalSum = people * 20;
                }
                break;

            case "Sunday":
                if (type.equals("Students")) {
                    totalSum = people * 10.46;
                } else if (type.equals("Business")) {
                    totalSum = people * 16;
                    if (people >= 100) {
                        totalSum = totalSum - (10 * 16);
                    }
                } else {
                    totalSum = people * 22.50;
                }
                break;
        }
        if (type.equals("Students") && people >= 30) {
            totalSum = totalSum - (totalSum * 0.15);

        } else if (type.equals("Regular") && people >= 10 && people <= 20) {
                totalSum = totalSum - (totalSum * 0.05);
        }
        System.out.printf("Total price: %.2f", totalSum);
    }
}
