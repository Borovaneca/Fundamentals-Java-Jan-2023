package Fundamentals.AssociativeArrays.Exercise.MoreExercise;

import java.util.*;

public class DragonArmy {
    private static final int DEFAULT_DMG = 45;
    private static final int DEFAULT_HEALTH = 250;
    private static final int DEFAULT_ARMOR = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String type = tokens[0];
            String name = tokens[1];
            int damage = tokens[2].equals("null") ? DEFAULT_DMG : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? DEFAULT_HEALTH : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? DEFAULT_ARMOR : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }
            if (!dragons.get(type).containsKey(name)) {
                dragons.get(type).put(name, new int[3]);
            }

            dragons.get(type).get(name)[0] = damage;
            dragons.get(type).get(name)[1] = health;
            dragons.get(type).get(name)[2] = armor;
        }

        for (Map.Entry<String, TreeMap<String, int[]>> typeInfo : dragons.entrySet()) {
            double[] average = calculateAverage(typeInfo.getValue());
            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", typeInfo.getKey(), average[0], average[1], average[2]);
            for (Map.Entry<String, int[]> dragonInfo : typeInfo.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n",
                        dragonInfo.getKey(),
                        dragonInfo.getValue()[0],
                        dragonInfo.getValue()[1],
                        dragonInfo.getValue()[2]);
            }
        }
    }

    private static double[] calculateAverage(TreeMap<String, int[]> map) {
        double totalEntries = map.size();
        int totalDamage = 0;
        int totalHealth = 0;
        int totalArmor = 0;

        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            totalDamage += entry.getValue()[0];
            totalHealth += entry.getValue()[1];
            totalArmor += entry.getValue()[2];
        }

        return new double[] {
                totalDamage / totalEntries,
                totalHealth / totalEntries,
                totalArmor / totalEntries
        };
    }
}
