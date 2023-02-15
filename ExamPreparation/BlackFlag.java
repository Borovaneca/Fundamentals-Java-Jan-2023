package ExamPreparation;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plunderDays = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double sumPlunder = 0;

        for (int i = 1; i <= plunderDays; i++) {
            if (i % 3 == 0) {
                sumPlunder += dailyPlunder * 1.50;
            } else {
                sumPlunder += dailyPlunder;
            }

            if (i % 5 == 0) {
                sumPlunder -= sumPlunder * 0.30;
            }
        }
        if (expectedPlunder <= sumPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.%n", sumPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", sumPlunder / expectedPlunder * 100);
        }
    }
}
