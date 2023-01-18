package Fundamentals.DataTypeAndVariables.Exercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOFRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.nextLine());
        BigDecimal number = new BigDecimal(0);
        for (int i = 1; i <= nums; i++) {
            BigDecimal n = new BigDecimal(scanner.nextLine());
            number = number.add(n);
        }

        System.out.println(number);

    }
}
