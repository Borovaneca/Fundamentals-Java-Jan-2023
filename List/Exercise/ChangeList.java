package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] currentCommand = command.split(" ");

            switch (currentCommand[0]){
                case "Delete":
                    int currentNum = Integer.parseInt(currentCommand[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (currentNum == numbers.get(i)){
                            numbers.remove(i);
                            i = 0;
                        }
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(currentCommand[1]);
                    int index = Integer.parseInt(currentCommand[2]);
                    numbers.add(index, element);
            }

            command = scanner.nextLine();
        }

        for (Integer print : numbers){
            System.out.print(print + " ");
        }
    }
}
