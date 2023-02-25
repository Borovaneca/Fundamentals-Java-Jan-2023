package PracticeFinalExam;

import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String rawKey = scanner.nextLine();

        String generate;
        while (!"Generate".equals(generate = scanner.nextLine())) {
            String[] input = generate.split(">>>");
            String command = input[0];

            switch (command) {
                case "Contains":
                    if (rawKey.contains(input[1])) {
                        System.out.printf("%s contains %s\n", rawKey, input[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(input[2]);
                    int endIndex = Integer.parseInt(input[3]);
                    switch (input[1]) {
                        case "Upper": {
                            String substring = rawKey.substring(startIndex, endIndex);
                            String substringToUpper = rawKey.substring(startIndex, endIndex).toUpperCase();
                            rawKey = rawKey.replace(substring, substringToUpper);
                            System.out.println(rawKey);
                        }
                            break;
                        case "Lower":
                            String substring = rawKey.substring(startIndex, endIndex);
                            String substringToLower = substring.toLowerCase();
                            rawKey = rawKey.replace(substring, substringToLower);
                            System.out.println(rawKey);
                            break;
                    }
                    break;
                case "Slice":
                    int start = Integer.parseInt(input[1]);
                    int end = Integer.parseInt(input[2]);

                    String substring = rawKey.substring(start, end);
                    rawKey = rawKey.replace(substring, "");
                    System.out.println(rawKey);
            }


        }
        System.out.println("Your activation key is: " + rawKey);
    }
}
