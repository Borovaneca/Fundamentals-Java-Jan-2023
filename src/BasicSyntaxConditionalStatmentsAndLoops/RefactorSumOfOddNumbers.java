package BasicSyntaxConditionalStatmentsAndLoops;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 1;
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(1);
                totalSum += i;
            } else {
                sum += 2;
                totalSum += sum;
                System.out.println(sum);
            }
        }

        System.out.printf("Sum: %d%n", totalSum);
    }
}
