package BasicSyntaxConditionalStatmentsAndLoops;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println((grade >= 3) ? "Passed!" : "Failed!");
    }
}
