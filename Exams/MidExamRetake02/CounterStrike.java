import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int counter = 0;
        boolean endOfEnergy = false;
        while (!"End of battle".equals(command)) {

            int distance = Integer.parseInt(command);

            if (energy - distance < 0) {
                endOfEnergy = true;
                break;
            }
            energy -= distance;
            counter++;
            if (counter % 3 == 0) {
                energy += counter;
            }


            command = scanner.nextLine();
        }

        if (endOfEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", counter, energy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d%n", counter, energy);
        }
    }
}
