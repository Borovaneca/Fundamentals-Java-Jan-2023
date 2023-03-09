package Fundamentals.TextProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String current = "";
            for (int i = command.length() - 1; i >= 0; i--) {
                current += command.charAt(i);
            }
            System.out.println(command + " = " + current);
            command = scanner.nextLine();
        }
    }
}
