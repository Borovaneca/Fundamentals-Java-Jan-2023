package Fundamentals.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] commands = input.split(" ");

            switch (commands[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commands[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commands[1]);
                    boolean find = false;
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNum = numbers.get(i);
                        if (currentNum == numberToRemove) {
                            numbers.remove(i);
                            find = true;
                        }
                    }
                    if (!find) {
                        numbers.remove(numberToRemove);
                    }
                    break;
                case "RemoveAt":
                    int numbersToRemove = Integer.parseInt(commands[1]);
                    numbers.remove(numbersToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commands[1]);
                    int indexToInsert = Integer.parseInt(commands[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
