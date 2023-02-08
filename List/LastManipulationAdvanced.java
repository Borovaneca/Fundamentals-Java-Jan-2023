package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (true) {
            if (input.equals("end")) {
                break;
            }

            String[] command = input.split(" ");

            switch (command[0]) {
                case "Contains":
                    int numberToCheck = Integer.parseInt(command[1]);
                    boolean checker = false;
                    for (Integer current : numbers) {
                        if (current == numberToCheck) {
                            checker = true;
                        }
                    }
                    if (checker) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        for (Integer current : numbers) {
                            if (current % 2 == 0) {
                                System.out.print(current + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (Integer num : numbers) {
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer current : numbers) {
                        sum += current;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (command[1]) {
                        case "<":
                            for (Integer current : numbers) {
                                if (current < Integer.parseInt(command[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (Integer current : numbers) {
                                if (current > Integer.parseInt(command[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (Integer current : numbers) {
                                if (current >= Integer.parseInt(command[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (Integer current : numbers) {
                                if (current <= Integer.parseInt(command[2])) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
            }
            input = scanner.nextLine();
        }
    }
}
