package Fundamentals.Exams.FinalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputData = scanner.nextLine();

        String regex = "(?<index>[\\|\\#]{1})(?<item>[A-z\\s+]+)\\1(?<date>[0-9]{2}[\\/]{1}[0-9]{2}[\\/]{1}[0-9]{2})\\1(?<calories>\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputData);
        Matcher matcher2 = pattern.matcher(inputData);

        int days = 0;
        while (matcher.find()) {
            int current = Integer.parseInt(matcher.group("calories"));
            days += current;
        }
        System.out.printf("You have food to last you for: %d days!%n", days / 2000);

        while (matcher2.find()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", matcher2.group("item"), matcher2.group("date"), matcher2.group("calories"));
        }

    }
}
