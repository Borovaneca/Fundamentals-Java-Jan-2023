package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.Scanner;

public class Orders {

    private static double sum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int amountOfOrders = Integer.parseInt(scanner.nextLine());

        while (amountOfOrders > 0) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int amountOFCapsules = Integer.parseInt(scanner.nextLine());

            double cal = (amountOFCapsules * price) * days;
            sum += cal;
            System.out.printf("The price for the coffee is: $%.2f%n", cal);
            amountOfOrders--;
        }
        System.out.printf("Total: $%.2f%n", sum);
    }
}
