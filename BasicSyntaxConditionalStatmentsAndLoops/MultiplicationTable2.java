package BasicSyntaxConditionalStatmentsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int first = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            System.out.printf("%d X %d = %d", first, multiplier, first*multiplier);
        } else {
            for (int i = multiplier; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", first, i, first * i);
            }
        }
    }
}
