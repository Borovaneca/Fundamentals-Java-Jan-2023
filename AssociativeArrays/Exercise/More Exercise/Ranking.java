package Fundamentals.AssociativeArrays.Exercise.MoreExercise;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String firstInput = scanner.nextLine();
        LinkedHashMap<String, String> contestList = new LinkedHashMap<>();
        TreeMap<String, TreeMap<String, Integer>> userList = new TreeMap<>();
        while (!firstInput.equals("end of contests")) {
            contestList.put(firstInput.split(":")[0], firstInput.split(":")[1]);
            firstInput = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("end of submissions")) {
            String[] usersArr = secondInput.split("=>");
            String contest = usersArr[0];
            String password = usersArr[1];
            String username = usersArr[2];
            int points = Integer.parseInt(usersArr[3]);
            if (!contestList.containsKey(contest)) {
                secondInput = scanner.nextLine();
                continue;
            }

            if (!contestList.containsValue(password)) {
                secondInput = scanner.nextLine();
                continue;
            }

            if (!userList.containsKey(username)) {
                userList.put(username, new TreeMap<>());
                userList.get(username).put(contest, points);
            } else {
                if (!userList.get(username).containsKey(contest)) {
                    userList.get(username).put(contest, points);
                } else {
                    if (userList.get(username).get(contest) < points) {
                        userList.get(username).put(contest, points);
                    }
                }
            }
            secondInput = scanner.nextLine();
        }

        int maxPoints = 0;
        String maxName = "";
        for (Map.Entry<String, TreeMap<String, Integer>> entry : userList.entrySet()) {
            int currentPoints = 0;
            for (Map.Entry<String, Integer> item : entry.getValue().entrySet()) {
                currentPoints += item.getValue();
            }
            if (currentPoints > maxPoints){
                maxPoints = currentPoints;
                maxName = entry.getKey();
            }

        }

        System.out.println("Best candidate is " + maxName + " with total " + maxPoints + " points.");
        System.out.println("Ranking:");
        for (Map.Entry<String, TreeMap<String, Integer>> entry : userList.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
            entry.getValue().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
            for (Map.Entry<String, Integer> item : sortedMap.entrySet()) {
                System.out.printf("#  %s -> %d%n", item.getKey(), item.getValue());
            }


        }


    }
}
