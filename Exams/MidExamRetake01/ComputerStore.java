package Fundamentals.Exams.MidExamRetake01;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String parts = scanner.nextLine();
        double sum = 0;
        double taxes = 0;
        double total = 0;

        while (!parts.equals("special") && !parts.equals("regular")) {

            double currentPrice = Double.parseDouble(parts);
            if (currentPrice < 0) {
                System.out.println("Invalid price!");
                parts = scanner.nextLine();
                continue;
            } else {
                sum += currentPrice;
            }

            parts = scanner.nextLine();
        }

        switch (parts) {
            case "special":

                taxes = sum * 0.20;
                total = sum + taxes;
                total = total - (total * 0.10);
                execution(sum, taxes, total);

                break;
            case "regular":

                taxes = sum * 0.20;
                total = taxes + sum;
                execution(sum, taxes, total);

                break;
        }
    }

    private static void execution(double sum, double taxes, double total) {
        if (isNegative(total)) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        }
    }

    private static boolean isNegative(double total) {
        return total <= 0;
    }
}
