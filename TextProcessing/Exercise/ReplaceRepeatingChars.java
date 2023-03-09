package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1 && input.charAt(i) == input.charAt(i - 1)) {
                sb.append(input.charAt(i));
                break;
            } else if (i == input.length() - 1 && input.charAt(i) != input.charAt(i - 1)) {
                sb.append(input.charAt(i));
            } else {
                if (input.charAt(i) != input.charAt(i+1)) {
                    sb.append(input.charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}
