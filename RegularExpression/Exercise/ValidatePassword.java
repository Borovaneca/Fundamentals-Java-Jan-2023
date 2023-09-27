package Fundamentals.Regex.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

    private static final String REGEX = "(?<before>\\.*\\_*(\\_\\.)\\.*\\_*)(?<expression>([A-Z][A-Za-z0-9]{4,}[A-Z]))(?<after>\\.*\\_*(\\_\\.)\\.*\\_*)";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    private static Matcher MATCHER;

    private static String GROUP;
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int amountOfPasswords = Integer.parseInt(reader.readLine());

        for (int i = 0; i < amountOfPasswords; i++) {
            String currentPassword = reader.readLine();
            MATCHER = PATTERN.matcher(currentPassword);
            if (MATCHER.matches()) {
                findGroup(MATCHER.group("expression"));
            } else {
                System.out.println("Invalid pass!");
            }
        }

    }


    private static void findGroup(String text) {
        StringBuilder output = new StringBuilder();
        char[] textChar = text.toCharArray();
        for (char c : textChar) {
            if (c >= 48 && c <= 57) {
                output.append(c);
            }
        }
        printOutput(output.toString());
    }

    private static void printOutput(String output) {
        System.out.println((output.length() == 0) ? "Group: default" : "Group: " + output);
    }
}
