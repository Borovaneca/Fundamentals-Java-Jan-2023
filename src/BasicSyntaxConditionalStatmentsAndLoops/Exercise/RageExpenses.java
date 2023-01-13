package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double calcHeadset = (lostGameCount / 2) * priceHeadset;
        double calcMouse = (lostGameCount / 3) * mousePrice;
        double calcKeyboard = (lostGameCount / 6) * keyboardPrice;
        double calcDisplay = ((lostGameCount /6) / 2) * displayPrice;
        double totalSum = calcHeadset + calcMouse + calcKeyboard + calcDisplay;
        System.out.printf("Rage expenses: %.2f lv.%n", totalSum);
    }
}
