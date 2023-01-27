package Fundamentals.Exams.MidExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum += Integer.parseInt(scanner.nextLine());
        }
        int students = Integer.parseInt(scanner.nextLine());

        int hours = 0;
        int count = 0;
        while (students > 0) {
            hours++;
            count++;
            students -= sum;
            if (students <= 0) {
                break;
            } else if (count % 3 == 0) {
                hours++;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
