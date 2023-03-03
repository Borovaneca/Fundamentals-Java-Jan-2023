package Fundamentals.AssociativeArrays.Exercise.MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> storedValues = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] array = input.split(" -> ");
            String username = array[0];
            String contest = array[1];
            int points = Integer.parseInt(array[2]);

            if (!storedValues.containsKey(contest)) {
                storedValues.put(contest, new LinkedHashMap<>());
                storedValues.get(contest).put(username, points);
            } else {
                if (storedValues.get(contest).containsKey(username)) {
                    if (points > storedValues.get(contest).get(username)) {
                        storedValues.get(contest).put(username, points);
                    }
                } else {
                    storedValues.get(contest).put(username, points);
                }
            }

            input = scanner.nextLine();
        }


        AtomicInteger num = new AtomicInteger();
        storedValues.forEach((k, v) -> {
            num.set(0);
            System.out.printf("%s: %d participants%n", k, v.size());
            v.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(e -> System.out.printf("%d. %s <::> %d%n", num.incrementAndGet(), e.getKey(), e.getValue()));
        });

        System.out.println("Individual standings:");

        Map<String, Integer> results = new LinkedHashMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : storedValues.entrySet()) {
            for (Map.Entry<String, Integer> mapEntry : entry.getValue().entrySet()) {
                results.putIfAbsent(mapEntry.getKey(), 0);
                results.put(mapEntry.getKey(), results.get(mapEntry.getKey()) + mapEntry.getValue());
            }
        }

        num.set(0);
        results.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%d. %s -> %d%n", num.incrementAndGet(), e.getKey(), e.getValue()));
    }
}
