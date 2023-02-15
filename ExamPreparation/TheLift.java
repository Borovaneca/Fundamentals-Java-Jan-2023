package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] outPut = new String[lift.length];
        boolean full = true;

        for (int i = 0; i < lift.length; i++) {
            for (int j = lift[i]; j < 4; j++) {
                if (people == 0) {
                    full = false;
                    break;
                } else {
                    lift[i] += 1;
                    people -= 1;
                }
            }
            outPut[i] = String.valueOf(lift[i]);
        }
        if (full && people == 0) {
            System.out.println(String.join(" ", outPut));
        } else if (!full) {
            System.out.println("The lift has empty spots!");
            System.out.println(String.join(" ", outPut));
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            System.out.println(String.join(" ", outPut));
        }
    }
}
