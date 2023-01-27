package Fundamentals.Exams.FinalExamRetake;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandArr = command.split("\\|");

            if (command.contains("Move")) {

                int charToMove = Integer.parseInt(command.split("\\|")[1]);
                String lettersToMove = message.substring(0, charToMove);
                String remainingLetters = message.substring(charToMove);
                message = remainingLetters + lettersToMove;

            } else if (command.contains("Insert")) {

                int index = Integer.parseInt(commandArr[1]);
                String symbolToInput = commandArr[2];
                String newMessage = "";
                if (index == message.length()) {
                    for (int i = 0; i <= message.length(); i++) {
                        if (i == index) {
                            newMessage += symbolToInput;
                            break;
                        }
                        newMessage += message.charAt(i);
                    }
                    message = newMessage;
                } else {
                    for (int i = 0; i < message.length(); i++) {
                        if (i == index) {
                            newMessage += symbolToInput;
                        }
                        newMessage += message.charAt(i);
                    }
                    message = newMessage;
                }

            } else if (command.contains("ChangeAll")) {

                String currentSymbol = commandArr[1];
                String newSymbol = commandArr[2];
                message = message.replace(currentSymbol.charAt(0), newSymbol.charAt(0));

            }


            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);
    }
}
