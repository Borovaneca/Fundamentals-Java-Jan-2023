import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int shotTargets = 0;

        while (!"End".equals(command)) {
            int index = Integer.parseInt(command);
            if (isInRange(index, targets) && targets[index] != -1) {
                shotTargets++;
                int currentNumber = targets[index];
                targets[index] = -1;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] != -1 && targets[i] <= currentNumber) {
                        targets[i] = targets[i] + currentNumber;
                    } else if (targets[i] != -1 && targets[i] > currentNumber) {
                        targets[i] = targets[i] - currentNumber;
                    }
                }

            }


            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", shotTargets);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }

    private static boolean isInRange(int index, int[] targets) {
        return index >= 0 && index < targets.length;
    }
}
