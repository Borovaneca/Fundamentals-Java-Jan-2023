package Fundamentals.Regex.Exercise.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int key = Integer.parseInt(scanner.nextLine());

        String command;
        String regex = "\\@(?<name>[A-Za-z]+)[^\\@\\-\\!\\:\\>]+[\\!](?<behaviour>[G|N])[\\!]";
        Pattern pattern = Pattern.compile(regex);
        List<String> good = new ArrayList<>();
        while (!"end".equals(command = scanner.nextLine())) {
            StringBuilder decryptedText = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                char currentChar = command.charAt(i);
                currentChar -= key;
                decryptedText.append(currentChar);
            }
            Matcher matcher = pattern.matcher(decryptedText.toString());
            while (matcher.find()) {
               String name = matcher.group("name");
               String behavior = matcher.group("behaviour");
                if ("G".equals(behavior)) {
                    good.add(name);
                }
            }
        }
        good.forEach(System.out::println);


    }
}
