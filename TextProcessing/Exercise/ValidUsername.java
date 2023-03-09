package Fundamentals.TextProcessing.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> inputData = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        for (String item : inputData) {
            if (isValid(item)) {
                System.out.println(item);
            }
        }

    }

    private static boolean isValid(String item) {
        boolean length = item.length() >= 3 && item.length() <= 16;
        boolean checker = true;
        for (char current : item.toCharArray()) {
            if (!Character.isLetterOrDigit(current) && current != '-' && current != '_') {
                checker = false;
            }
        }
        return length && checker;
    }
}
