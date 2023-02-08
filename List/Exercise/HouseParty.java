package Fundamentals.List.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> namesOfGuests = new ArrayList<>();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String[] currentCommand = scanner.nextLine().split(" ");
            if (currentCommand.length == 3){
                if (namesOfGuests.contains(currentCommand[0])){
                    System.out.printf("%s is already in the list!%n", currentCommand[0]);
                } else {
                    namesOfGuests.add(currentCommand[0]);
                }
            } else {
                if (!namesOfGuests.contains(currentCommand[0])){
                    System.out.printf("%s is not in the list!%n", currentCommand[0]);
                } else {
                    namesOfGuests.remove(currentCommand[0]);
                }
            }

        }
        for (String item : namesOfGuests){
            System.out.printf("%s%n", item);
        }
    }
}
