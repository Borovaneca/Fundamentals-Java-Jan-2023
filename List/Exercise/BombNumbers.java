package Fundamentals.List.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] powerAndPowers = scanner.nextLine().split(" ");
        int power = Integer.parseInt(powerAndPowers[0]);
        int powerSize = Integer.parseInt(powerAndPowers[1]);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == power) {
                if (i == numbers.size() - 1) {
                    for (int j = 1; j <= powerSize; j++) {
                        numbers.remove(i - 1);
                        i -= 1;
                    }
                } else if (i == 0) {
                    for (int j = 1; j <= powerSize; j++) {
                        numbers.remove(i + 1);
                    }
                } else {
                    for (int j = 1; j <= powerSize; j++) {
                        if (i + 1 == numbers.size()) {
                            break;
                        }
                        numbers.remove(i + 1);
                    }
                    for (int j = 1; j <= powerSize; j++) {
                        if (i - 1 < 0) {
                            break;
                        }
                        numbers.remove(i - 1);
                        i -= 1;
                    }
                }
                numbers.remove(i);
                i -= 1;
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
