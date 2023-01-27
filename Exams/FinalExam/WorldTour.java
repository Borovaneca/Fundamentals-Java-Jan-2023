package Fundamentals.Exams.FinalExam;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] commandArr = command.split(":");
            String newInputData = "";

            if (command.contains("Add")) {
                int index = Integer.parseInt(commandArr[1]);
                String textToAdd = commandArr[2];
                if (index >= 0 && index <= inputData.length() - 1) {
                    for (int i = 0; i < inputData.length(); i++) {
                        if (i == index) {
                            for (int j = 0; j < textToAdd.length(); j++) {
                                newInputData += textToAdd.charAt(j);
                            }
                            newInputData += inputData.charAt(i);
                        } else {
                            newInputData += inputData.charAt(i);
                        }
                    }
                    inputData = newInputData;
                    System.out.println(inputData);
                } else {
                    System.out.println(inputData);
                }
            } else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);
                if (startIndex >= 0 && endIndex >= 0 && startIndex <= inputData.length() - 1 && endIndex <= inputData.length() -1 ) {
                    for (int i = 0; i < inputData.length(); i++) {
                        if (i >= startIndex && i <= endIndex) {
                            continue;
                        } else {
                            newInputData += inputData.charAt(i);
                        }
                    }
                    inputData = newInputData;
                    System.out.println(inputData);
                } else {
                    System.out.println(inputData);
                }

            } else if (command.contains("Switch")) {
                String newAddress = commandArr[2];
                String oldAddress = commandArr[1];
                if (inputData.contains(oldAddress)) {
                    inputData = inputData.replace(oldAddress, newAddress);
                    System.out.println(inputData);
                } else {
                    System.out.println(inputData);
                }

            }
            command = scanner.nextLine();

        }
        System.out.println("Ready for world tour! Planned stops: " + inputData);
    }
}
