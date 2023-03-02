package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        LinkedHashMap<String, Double> quantityList = new LinkedHashMap<>();
        LinkedHashMap<String, Double> priceList = new LinkedHashMap<>();

        while (!command.equals("buy")){
            String[] commandArr = command.split(" ");
            String item = commandArr[0];
            double prize = Double.parseDouble(commandArr[1]);
            double quantity = Integer.parseInt(commandArr[2]);

            if (!quantityList.containsKey(item)){
                quantityList.put(item, quantity);
                priceList.put(item, prize);
            } else {
                    double oldQuantity = quantityList.get(item);
                    quantityList.put(item, oldQuantity + quantity);
                    priceList.put(item, prize);
            }


            command = scanner.nextLine();
        }

        for (Map.Entry<String, Double> quantity : quantityList.entrySet()) {
            for (Map.Entry<String, Double> price : priceList.entrySet()) {

                if (quantity.getKey().equals(price.getKey())){
                    System.out.printf("%s -> %.2f%n", price.getKey(), quantity.getValue() * price.getValue());
                    break;
                }
            }

        }


    }
}
