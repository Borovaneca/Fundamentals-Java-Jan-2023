package Fundamentals.Exams.FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String regex = "(=|/)(?<name>[A-Z][a-zA-Z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> list = new ArrayList<>();
        int sum = 0;
        while (matcher.find()) {
            String current = "";
            if (matcher.group().charAt(0) == matcher.group().charAt(matcher.group().length() - 1)) {


                for (int i = 0; i < matcher.group().length(); i++) {
                    if (Character.isLetter(matcher.group().charAt(i))) {
                        current += matcher.group().charAt(i);
                    }
                }
                list.add(current);
                sum += current.length();
            }
        }
        System.out.println("Destinations: " + String.join(", ", list));
        System.out.println("Travel Points: " + sum);

    }
}
