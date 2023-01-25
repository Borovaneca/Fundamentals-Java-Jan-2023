package Fundamentals.Arrays.Exercise.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] bugsArr = new int[Integer.parseInt(scanner.nextLine())];
        Arrays.fill(bugsArr, 0);
        int[] indexOfLadyBugs = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int indexes : indexOfLadyBugs) {
            if (indexes < 0 || indexes >= bugsArr.length) {
                continue;
            } else {
                bugsArr[indexes] = 1;
            }
        }

        String move = scanner.nextLine();

        while (!"end".equals(move)) {
            String[] indexesToMove = move.split("\\s+");
            int initialPosition = Integer.parseInt(indexesToMove[0]);
            String direction = indexesToMove[1];
            int countOfMoves = Integer.parseInt(indexesToMove[2]);

            int newPosition = 0;

            if (countOfMoves < 0)
            {
                if (direction.equals("left")) {
                    direction = "right";
                    countOfMoves = Math.abs(countOfMoves);
                }
                else if (direction.equals("right")) {
                    direction = "left";
                    countOfMoves = Math.abs(countOfMoves);
                }
            }

            if (initialPosition < 0 || initialPosition >= bugsArr.length || bugsArr[initialPosition] == 0) {
                move = scanner.nextLine();
                continue;
            } else if (countOfMoves == 0 && initialPosition <= bugsArr.length - 1) {
                if (bugsArr[initialPosition] == 1) {
                    bugsArr[initialPosition] = 0;
                }
            }


            switch (direction) {
                case "right":
                    newPosition = initialPosition + countOfMoves;
                    bugsArr[initialPosition] = 0;
                    if (newPosition > bugsArr.length - 1) {
                        bugsArr[initialPosition] = 0;
                        break;
                    } else {
                        for (int i = newPosition; i < bugsArr.length; i += countOfMoves) {
                            if (bugsArr[i] == 0) {
                                bugsArr[i] = 1;
                                break;
                            }

                        }
                    }
                    break;

                case "left":

                    newPosition = initialPosition - countOfMoves;
                    bugsArr[initialPosition] = 0;
                    if (newPosition < 0) {
                        bugsArr[initialPosition] = 0;
                        break;
                    } else {
                        for (int i = newPosition; i >= 0; i-= countOfMoves) {
                            if (bugsArr[i] == 0) {
                                bugsArr[i] = 1;
                                break;
                            }
                        }
                    }

                    break;
            }


            move = scanner.nextLine();
        }

        Arrays.stream(bugsArr).forEach(item -> System.out.print(item + " "));
    }
}
