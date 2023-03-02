package Fundamentals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int registration = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> userList = new LinkedHashMap<>();

        for (int i = 1; i <= registration; i++) {
            String[] command = scanner.nextLine().split(" ");
            String currentCommand = command[0];
            String name = command[1];
            String plate = "";
            if (command.length > 2) {
                plate = command[2];
            }
            switch (currentCommand) {
                case "register":
                if (!userList.containsKey(name)) {
                    userList.put(name, plate);
                    System.out.println(name + " registered " + plate + " successfully");
                } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", userList.get(name));
                }
                break;
                case "unregister":
                    if (!userList.containsKey(name)){
                        System.out.println("ERROR: user " + name + " not found");
                    } else {
                        userList.remove(name);
                        System.out.println(name + " unregistered successfully");
                    }
                    break;
            }
        }

        userList.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
