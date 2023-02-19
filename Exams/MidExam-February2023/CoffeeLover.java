import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffees = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotation; i++) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("Include")) {
                coffees.add(command[1]);

            } else if (command[0].equals("Remove")) {
                int amountToRemove = Integer.parseInt(command[2]);
                if (coffees.size() < amountToRemove) {
                    continue;
                }
                if (command[1].equals("first")) {
                    for (int j = 0; j < amountToRemove; j++) {
                        coffees.remove(0);
                    }
                } else if (command[1].equals("last")) {
                    for (int j = 0; j < amountToRemove; j++) {
                        coffees.remove(coffees.size() - 1);
                    }
                }

            } else if (command[0].equals("Prefer")) {
                int firstIndex = Integer.parseInt(command[1]);
                int secondIndex = Integer.parseInt(command[2]);
                if (firstIndex >= 0 && firstIndex <= coffees.size() - 1 && secondIndex >= 0 && secondIndex <= coffees.size() - 1) {
                    String firstCoffee = coffees.get(firstIndex);
                    String secondCoffee = coffees.get(secondIndex);
                    coffees.set(firstIndex, secondCoffee);
                    coffees.set(secondIndex, firstCoffee);
                }

            } else if (command[0].equals("Reverse")) {
                Collections.reverse(coffees);
            }
        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffees));


    }
}
