package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char current = (char) (input.charAt(i) + 3);
            sb.append(current);
        }
        System.out.println(sb.toString());
    }
}
