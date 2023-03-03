package Fundamentals.AssociativeArrays.Exercise.MoreExercise;

import java.util.*;

public class SnowWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, LinkedHashMap<String, Integer>> dwarfs = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"Once upon a time".equals(input)) {

            String name = input.split(" <:> ")[0];
            String hatColor = input.split(" <:> ")[1];
            int physics = Integer.parseInt(input.split(" <:> ")[2]);

            dwarfs.putIfAbsent(hatColor, new LinkedHashMap<>());
            dwarfs.get(hatColor).putIfAbsent(name, physics);

            if (dwarfs.get(hatColor).get(name) < physics) {
                dwarfs.get(hatColor).put(name, physics);
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> print = new LinkedHashMap<>();

        for(Map.Entry<String, LinkedHashMap<String, Integer>> entry : dwarfs.entrySet()) {
            for(Map.Entry<String, Integer> subEntry : entry.getValue().entrySet()) {
                print.put(entry.getKey() + " " + subEntry.getKey() + " " + entry.getValue().size(), subEntry.getValue());
            }
        }

        print.entrySet().stream().sorted((pair2, pair1) -> {
            int sort = Integer.compare(pair1.getValue(), pair2.getValue());
            if (sort == 0) {
                String[] sort1 = pair1.getKey().split(" ");
                String[] sort2 = pair2.getKey().split(" ");
                sort = sort1[2].compareTo(sort2[2]);
            }
            return sort;
        }).forEach(pair -> {
            String[] printing = pair.getKey().split(" ");
            System.out.printf("(%s) %s <-> %d\n", printing[0], printing[1], pair.getValue());
        });

    }
}
