package Fundamentals.Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();
        String regex = "%(?<name>[A-Z][a-z]*)%[^|'$%.]*<(?<item>\\w+)>[^|'$%.]*\\|(?<quantity>[0-9]+)\\|[^|'$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        double totalSum = 0;
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("name");
                String item = matcher.group("item");
                int count = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = count * price;
                totalSum += sum;
                System.out.printf("%s: %s - %.2f%n", name, item, sum);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f%n", totalSum);
    }
}
