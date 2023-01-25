package Fundamentals.Arrays.Exercise.MoreExercise;

import java.util.Scanner;

public class LadyBugs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] ladyBugsIndexes = scanner.nextLine().split(" ");
        int[] field = new int[fieldSize];

        for (String index : ladyBugsIndexes) {
            int currentIndex = Integer.parseInt(index);
            if (currentIndex < field.length && currentIndex >= 0) {
                field[currentIndex] = 1;
            }
        }

        String input = scanner.nextLine();
        while (!"end".equals(input)) {

            String[] tokens = input.split(" ");
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int movementLength = Integer.parseInt(tokens[2]);

            if (index >= 0 && index < field.length && field[index] == 1) {

                field[index] = 0;

                if (direction.equals("right")) {
                    index += movementLength;

                    while (index < field.length && field[index] == 1) {
                        index += movementLength;
                    }
                    if (index < field.length && index >= 0) {
                        field[index] = 1;
                    }
                } else {
                    index -= movementLength;

                    while (index >= 0 && field[index] == 1) {
                        index -= movementLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }

                input = scanner.nextLine();
            }
        }
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}
