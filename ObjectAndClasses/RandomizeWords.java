package Fundamentals.OOP;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] formatted = input.split(" ");

        Random random = new Random();

        for (int i = 0; i < formatted.length; i++) {
            int index = random.nextInt(formatted.length);
            int index2 = random.nextInt(formatted.length);

            String oldWord = formatted[index];
            formatted[index] = formatted[index2];
            formatted[index2] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), formatted));
    }
}
