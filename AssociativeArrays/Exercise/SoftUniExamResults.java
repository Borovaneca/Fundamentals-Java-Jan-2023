package Fundamentals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> userList = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageList = new LinkedHashMap<>();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("exam finished")){
            String[] command = inputLine.split("-");
            if (command[1].equals("banned")){
                userList.remove(command[0]);
                inputLine = scanner.nextLine();
                continue;
            }

            String name = command[0];
            String language = command[1];
            int points = Integer.parseInt(command[2]);
            if (!userList.containsKey(name)){
                userList.put(name, points);
            } else {
                if (userList.get(name) < points){
                    userList.put(name, points);
                }
            }

            if (!languageList.containsKey(language)){
                languageList.put(language, 1);
            } else {
                languageList.put(language, languageList.get(language)+1);
            }

            inputLine = scanner.nextLine();
        }

        System.out.println("Results:");
        userList.forEach((key, value) -> System.out.printf("%s | %d%n", key, value));
        System.out.println("Submissions:");
        languageList.forEach((key, value) -> System.out.printf("%s - %d%n", key, value));
    }
}
