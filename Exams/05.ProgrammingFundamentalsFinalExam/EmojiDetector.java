package PracticeFinalExam;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[:][:][A-Z][a-z]{2,}[:][:]|[*][*][A-Z][a-z]{2,}[*][*]");
        int threshold = getThreshold(input);
        int countEmoji = 0;

        LinkedHashMap<String, Integer> coolEmoji = new LinkedHashMap<>();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String currentEmoji = matcher.group();
            int emojiSum = emojiSum(currentEmoji);
            if (emojiSum > threshold) {
                coolEmoji.put(currentEmoji, emojiSum);
            }
            countEmoji++;
        }

        System.out.println("Cool threshold: " + threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", countEmoji);
        coolEmoji.forEach((key, value) -> System.out.println(key));
    }

    private static Integer emojiSum(String currentEmoji) {
        int sum = 0;
        for (int i = 0; i < currentEmoji.length(); i++) {
            if (currentEmoji.charAt(i) != ':' && currentEmoji.charAt(i) != '*') {
                sum += currentEmoji.charAt(i);
            }
        }
        return sum;
    }

    private static int getThreshold(String input) {
        int sum = 1;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                sum *= Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }
}
