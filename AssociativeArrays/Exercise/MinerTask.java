package Fundamentals.AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> resourceList = new LinkedHashMap<>();
        String command = scanner.nextLine();
        while (!command.equals("stop")){

            String resource = command;
            String quantity = scanner.nextLine();
            if (resourceList.containsKey(resource)){
                int addedQuantity = Integer.parseInt(quantity);
                resourceList.put(resource, resourceList.get(resource) + addedQuantity);
            } else {
                resourceList.put(resource, Integer.parseInt(quantity));
            }
            command = scanner.nextLine();
        }

        resourceList.entrySet().forEach(item -> System.out.printf("%s -> %d%n", item.getKey(), item.getValue()));
    }
}
