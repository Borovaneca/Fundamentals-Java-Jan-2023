
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTargets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String currentCommand = command.split("\\s+")[0];
            int index = Integer.parseInt(command.split("\\s+")[1]);

            switch (currentCommand) {

                case "Shoot":
                    int power = Integer.parseInt(command.split("\\s+")[2]);
                    if (isInRange(targets, index)) {
                        shooting(targets, index, power);
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(command.split("\\s+")[2]);
                    if (isInRange(targets, index)) {
                        add(targets, index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(command.split("\\s+")[2]);
                    if (isInRange(targets, index) && index + radius < targets.size() && index - radius >= 0) {
                        strike(targets, index, radius);
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(targets.stream().map(String::valueOf).collect(Collectors.joining("|")));
}

    private static void strike(List<Integer> targets, int index, int radius) {
        int rotation = radius + radius + 1;
        for (int i = 0; i < rotation; i++) {
            targets.remove(index-radius);
        }
    }



    private static void add(List<Integer> targets, int index, int value) {
        targets.add(index, value);
    }

    private static boolean isInRange(List<Integer> targets, int index) {
        return index <= targets.size() - 1 && index >= 0;
    }

    private static void shooting(List<Integer> targets, int index, int power) {
        targets.set(index, targets.get(index) - power);
        if (targets.get(index) <= 0) {
            targets.remove(index);
        }
    }
    }
