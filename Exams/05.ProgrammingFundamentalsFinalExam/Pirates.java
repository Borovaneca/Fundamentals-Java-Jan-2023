package PracticeFinalExam;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> cities = new LinkedHashMap<>();

        String sail;
        while (!"Sail".equals(sail = scanner.nextLine())) {
            String[] data = sail.split("\\|\\|");
            String cityName = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            if (!cities.containsKey(cityName)) {
                cities.put(cityName, new LinkedHashMap<>());
                cities.get(cityName).put("population", population);
                cities.get(cityName).put("gold", gold);
            } else {
                cities.get(cityName).put("population", cities.get(cityName).get("population") + population);
                cities.get(cityName).put("gold", cities.get(cityName).get("gold") + gold);
            }
        }

        String end;
        while (!"End".equals(end = scanner.nextLine())) {
            String[] tokens = end.split("=>");
            String command = tokens[0];
            String cityName = tokens[1];

            if (command.equals("Plunder")) {
                int people = Integer.parseInt(tokens[2]);
                int gold = Integer.parseInt(tokens[3]);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", cityName, gold, people);
                cities.get(cityName).put("population", cities.get(cityName).get("population") - people);
                cities.get(cityName).put("gold", cities.get(cityName).get("gold") - gold);
                if (cities.get(cityName).get("population") <= 0 || cities.get(cityName).get("gold") <= 0) {
                    cities.remove(cityName);
                    System.out.println(cityName + " has been wiped off the map!");
                }
            } else if (command.equals("Prosper")) {
                int gold = Integer.parseInt(tokens[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    cities.get(cityName).put("gold", cities.get(cityName).get("gold") + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold, cityName, cities.get(cityName).get("gold"));
                }
            }
        }

        if (cities.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cities.size());
            cities.forEach((k, v) -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", k, v.get("population"), v.get("gold")));
        }
    }
}
