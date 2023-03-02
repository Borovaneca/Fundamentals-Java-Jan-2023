package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> itemsList = new LinkedHashMap<>();
        itemsList.put("shards", 0);
        itemsList.put("fragments", 0);
        itemsList.put("motes", 0);
        while (itemsList.get("shards") < 250 && itemsList.get("fragments") < 250 && itemsList.get("motes") < 250){
            String[] command = scanner.nextLine().split(" ");
            for (int i = 1; i < command.length; i+=2) {
                if (itemsList.get("shards") >= 250 || itemsList.get("fragments") >= 250 || itemsList.get("motes") >= 250){
                    break;
                }
                if (!itemsList.containsKey(command[i].toLowerCase())){
                    itemsList.put(command[i].toLowerCase(), 0);
                    itemsList.put(command[i].toLowerCase(), itemsList.get(command[i].toLowerCase())+Integer.parseInt(command[i-1]));
                    if (itemsList.get("shards") >= 250 || itemsList.get("fragments") >= 250 || itemsList.get("motes") >= 250){
                        break;
                    }
                } else {
                    itemsList.put(command[i].toLowerCase(), itemsList.get(command[i].toLowerCase())+Integer.parseInt(command[i-1]));
                    if (itemsList.get("shards") >= 250 || itemsList.get("fragments") >= 250 || itemsList.get("motes") >= 250){
                        break;
                    }
                }
            }
        }
        List<String> obtainedLegendaryItem = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : itemsList.entrySet()) {
            if (entry.getValue() >= 250 && entry.getKey().equals("shards") ||
                    entry.getValue() >= 250 && entry.getKey().equals("fragments") ||
                    entry.getValue() >= 250 && entry.getKey().equals("motes")){
                if (entry.getKey().equals("shards")){
                    obtainedLegendaryItem.add("Shadowmourne");
                } else if (entry.getKey().equals("fragments")){
                    obtainedLegendaryItem.add("Valanyr");
                } else {
                    obtainedLegendaryItem.add("Dragonwrath");
                }
                itemsList.put(entry.getKey(), entry.getValue() - 250);
            }
        }
        System.out.printf("%s obtained!%n", obtainedLegendaryItem.get(0));
        for (Map.Entry<String, Integer> entry : itemsList.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey().toLowerCase(), entry.getValue());
        }


    }
}
