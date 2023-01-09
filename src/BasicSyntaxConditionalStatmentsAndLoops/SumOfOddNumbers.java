package BasicSyntaxConditionalStatmentsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(current);
            } else {
                current += 2;
                sum += current;
                System.out.println(current);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
