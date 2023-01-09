package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputNumber = scanner.nextLine();
        int number = Integer.parseInt(inputNumber);
        int factorialSum = 0;
        int totalSum = 0;
        for (int i = 0; i < inputNumber.length(); i++) {
            int current = Integer.parseInt(String.valueOf(inputNumber.charAt(i)));
            factorialSum = 0;
            if (current == 0) {
                totalSum += 1;
                continue;
            }
            for (int j = current; j >= 1; j--) {
                if (j == current) {
                    factorialSum = j;
                } else {
                    factorialSum *= j;
                }
            }
            totalSum += factorialSum;
        }
        System.out.println((number == totalSum) ? "yes" : "no");
    }
}
