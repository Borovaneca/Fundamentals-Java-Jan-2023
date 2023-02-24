package FinalExam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String command;

        while (!"Done".equals(command = scanner.nextLine())) {
            String currentCommand = command.split(" ")[0];

            if (currentCommand.equals("TakeOdd")) {
                String temporary = takeOdd(sb.toString());
                sb = new StringBuilder(temporary);
                System.out.println(sb.toString());

            } else if (currentCommand.equals("Cut")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);

                String toRemove = sb.substring(index, index + length);
                String temporary = sb.toString().replaceFirst(toRemove, "");
                sb = new StringBuilder(temporary);
                System.out.println(sb.toString());

            } else if (currentCommand.equals("Substitute")) {
                String substring = command.split("\\s+")[1];
                String substitutes = command.split("\\s+")[2];

                if (sb.toString().contains(substring)) {
                    String temporary = sb.toString().replaceAll(substring, substitutes);
                    sb = new StringBuilder(temporary);
                    System.out.println(sb.toString());
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
        }
        System.out.println("Your password is: " + sb.toString());
    }

    private static String takeOdd(String text) {
        String temporary = "";
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                temporary += text.charAt(i);
            }
        }
        return temporary;
    }
}
