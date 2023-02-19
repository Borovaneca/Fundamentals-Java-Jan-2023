import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());
        double priceOfSingleEgg = Double.parseDouble(scanner.nextLine());
        double priceOfSingleApron = Double.parseDouble(scanner.nextLine());

        int countPackage = 0;
        for (int i = 1; i <= students; i++) {
            if (i % 5 == 0) {
                countPackage++;
            }
        }

        double calcApron = priceOfSingleApron * Math.ceil(students * 1.20);
        double calcEggs = students * (10 * priceOfSingleEgg);
        double calcFreePackage = priceOfFlour * (students - countPackage);
        double sum = calcApron + calcEggs + calcFreePackage;

        if (budget >= sum) {
            System.out.printf("Items purchased for %.2f$.\n", sum);
        } else {
            System.out.printf("%.2f$ more needed.\n", Math.abs(budget - sum));
        }
    }
}
