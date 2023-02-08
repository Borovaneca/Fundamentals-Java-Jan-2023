package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> passengers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] currentCommand = command.split(" ");
            if (currentCommand.length == 1){
                int passengersToDistribute = Integer.parseInt(command);
                for (int i = 0; i < passengers.size(); i++) {
                    if (passengersToDistribute + passengers.get(i) <= maxCapacity){
                        int people = passengersToDistribute + passengers.get(i);
                        passengers.remove(i);
                        passengers.add(i, people);
                        break;
                    }
                }
            } else {
                int numberOfPassengersToAdd = Integer.parseInt(currentCommand[1]);
                passengers.add(numberOfPassengersToAdd);
            }

            command = scanner.nextLine();
        }
        for (int item : passengers){
            System.out.printf("%d ", item);
        }
    }
}
