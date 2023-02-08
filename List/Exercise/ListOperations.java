package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){

            if (command.contains("Add")){
                numbers.add(Integer.parseInt(command.split(" ")[1]));

            } else if (command.contains("Insert")){
                if (Integer.parseInt(command.split(" ")[2]) <= numbers.size()-1 && Integer.parseInt(command.split(" ")[2]) >= 0) {
                    int number = Integer.parseInt(command.split(" ")[1]);
                    int index = Integer.parseInt(command.split(" ")[2]);
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")){
                if (Integer.parseInt(command.split(" ")[1]) <= numbers.size()-1 && Integer.parseInt(command.split(" ")[1]) >= 0) {
                    numbers.remove(Integer.parseInt(command.split(" ")[1]));
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")){
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= count; i++) {
                    int currentFirst = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(currentFirst);
                }

            } else if (command.contains("Shift right")){
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= count; i++) {
                    int currentLast = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0, currentLast);
                }
            }

            command = scanner.nextLine();
        }

        for (Integer item : numbers){
            System.out.printf("%d ", item);
        }
    }
}
