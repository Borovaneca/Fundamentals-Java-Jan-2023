package Fundamentals.Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String demons = scanner.nextLine();

        Pattern pattern = Pattern.compile("[^,\\s+]+");
        Matcher matcher = pattern.matcher(demons);

        while (matcher.find()) {
            String demonName = matcher.group();
            int demonHealth = getDemonHealth(demonName);
            double demonDamage = getDemonDamage(demonName);

            System.out.printf("%s - %d health, %.2f damage%n", demonName, demonHealth, demonDamage);
        }
    }

    private static double getDemonDamage(String name) {
        Pattern damagePattern = Pattern.compile("[-|+]?(\\d+\\.?\\d+|\\d+)");
        Matcher damageMatcher = damagePattern.matcher(name);

        double damage = 0.0;
        while (damageMatcher.find()) {
            damage += Double.parseDouble(damageMatcher.group());
        }

        Pattern pattern = Pattern.compile("[*/]");
        damageMatcher = pattern.matcher(name);

        while (damageMatcher.find()) {
            String symbol = damageMatcher.group();
            if (symbol.equals("*")) {
                damage *= 2;
            } else if (symbol.equals("/")) {
                damage /= 2;
            }
        }


        return damage;
    }

    private static int getDemonHealth(String name) {
        Pattern healthPattern = Pattern.compile("[^-+0-9*/.]");
        Matcher healthMatcher = healthPattern.matcher(name);
        int sumOfCharCodes = 0;
        while (healthMatcher.find()) {
            int symbolAsciiCode = healthMatcher.group().charAt(0);
            sumOfCharCodes += symbolAsciiCode;
        }

        return sumOfCharCodes;
    }
}
