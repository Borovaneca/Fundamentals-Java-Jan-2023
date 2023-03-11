package Fundamentals.TextProcessing.Exercise.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] key = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String text;
        String out;
        boolean finished = false;

        while (!"find".equals(text = scanner.nextLine())) {
            out = "";

            for (int i = 0; i < text.length(); i++) {
                if (finished) {
                    break;
                }
                for (int j = 0; j < key.length; j++) {

                    if (j < text.length()) {
                        char current = (char) (text.charAt(j) - key[j]);
                        out += current;
                    }

                }
                if (key.length <= text.length()) {
                    text = text.substring(key.length);
                    i -= 1;
                } else {
                    finished = true;
                }
            }

            finished = false;

            Pattern pattern = Pattern.compile("&(?<type>[A-Za-z]*)&[A-Za-z0-9]*<(?<coordinates>[0-9A-Za-z]*)>");
            Matcher matcher = pattern.matcher(out);
            if (matcher.find()) {
                String type = matcher.group("type");
                String coordinates = matcher.group("coordinates");

                System.out.printf("Found %s at %s\n", type, coordinates);

            }

        }
    }
}
