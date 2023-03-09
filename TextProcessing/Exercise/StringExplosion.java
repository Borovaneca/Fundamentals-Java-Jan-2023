package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean bomb = false;
        int bomber = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (bomb && count != bomber) {
                count++;
                if (input.charAt(i) == '>') {
                    bomber = (bomber - (count - 1)) + Integer.parseInt(String.valueOf(input.charAt(i+1)));
                    count = 0;
                    sb.append(input.charAt(i));
                    continue;
                } else if (count == bomber) {
                    bomb = false;
                    bomber = 0;
                    count = 0;
                    continue;
                }
                continue;
            }
            if (input.charAt(i) == '>') {
                if (i != input.length() -1) {
                    bomber = bomber + Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                    bomb = true;
                    count = 0;
                    sb.append(input.charAt(i));
                }
            } else {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
