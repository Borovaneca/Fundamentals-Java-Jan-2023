package Fundamentals.Arrays;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] days = new String[] { "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};


        int numDays = Integer.parseInt(scanner.nextLine());

        if (numDays < 1 || numDays > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(days[numDays - 1]);
        }
    }
}
