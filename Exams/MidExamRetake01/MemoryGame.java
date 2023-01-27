package Fundamentals.Exams.MidExamRetake01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        String[] inputArr = scanner.nextLine().split(" ");
        List<String> charList = new ArrayList<>(Arrays.asList(inputArr));

        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("end")) {
            count++;

            int firstIndex = Integer.parseInt(command.split(" ")[0]);
            int secondIndex = Integer.parseInt(command.split(" ")[1]);

            if (firstIndex >= 0 && secondIndex >= 0 && firstIndex <= charList.size() - 1 &&
                    secondIndex <= charList.size() - 1 && firstIndex != secondIndex) {

                String firstChar = charList.get(firstIndex);
                String secondChar = charList.get(secondIndex);
                if (firstChar.equals(secondChar)) {
                    System.out.println("Congrats! You have found matching elements - " + firstChar + "!");
                    charList.remove(firstChar);
                    charList.remove(secondChar);
                } else {
                    System.out.println("Try again!");
                }
            } else {

                System.out.println("Invalid input! Adding additional elements to the board");
                int midIndex = charList.size() / 2;
                charList.add(midIndex, "-"+count+"a");
                charList.add(midIndex, "-"+count+"a");

            }

            if (charList.size() == 0) {
                System.out.printf("You have won in %d turns!%n", count);
                break;
            }


            command = scanner.nextLine();
        }

        if (charList.size() > 0) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", charList));
        }
    }
}
