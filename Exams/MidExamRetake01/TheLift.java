package Fundamentals.Exams.MidExamRetake01;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    int people = Integer.parseInt(scanner.nextLine());
    int[] spaces = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < spaces.length; i++) {
        for (int j = 1; j <= 4; j++) {
            if (people == 0 || spaces[i] == 4) {
                break;
            }
            spaces[i] += 1;
            people -= 1;
        }
    }

        if (people == 0) {
        if (checkForSpots(spaces, people)) {
            if (!isFull(spaces, people)) {

                System.out.println("The lift has empty spots!");
                for (int i = 0; i < spaces.length; i++) {
                    System.out.printf("%d ", spaces[i]);
                }
            }
        } else {
            for (int i = 0; i < spaces.length; i++) {
                System.out.printf("%d ", spaces[i]);
            }
        }
    } else {
        System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        for (int i = 0; i < spaces.length; i++) {
            System.out.printf("%d ", spaces[i]);
        }
    }
}


    private static boolean isFull(int[] seats, int people) {
        boolean checker = true;
        if (people == 0) {
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] != 4) {
                    checker = false;
                    break;
                }
            }
        }
        return checker;
    }

    private static boolean checkForSpots(int[] seats, int people) {
        if (people == 0) {
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] != 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
