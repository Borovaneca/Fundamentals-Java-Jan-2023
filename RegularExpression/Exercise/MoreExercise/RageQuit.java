package Fundamentals.Regex.Exercise.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine().trim();
        String regex = "(?<letters>[\\D]+)(?<numbers>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            String letters = matcher.group("letters").toUpperCase();
            int n = Integer.parseInt(matcher.group("numbers"));
            for (int i = 0; i < n; i++) {
                sb.append(letters);
            }
        }
        System.out.printf("Unique symbols used: %d\n", sb.chars().distinct().count());
        System.out.println(sb.toString());
    }
}
