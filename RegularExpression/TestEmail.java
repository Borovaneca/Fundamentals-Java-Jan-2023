package Fundamentals.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regex = "\\b[A-Z]+[a-z]+[0-9]+[@][a-z]+.com\\b";
        String email = scanner.nextLine();

        while (true) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                System.out.println("Successful registration of " + matcher.group());
                break;
            } else {
                System.out.println("Invalid email, try again!");
                email = scanner.nextLine();
            }
        }
    }
}
