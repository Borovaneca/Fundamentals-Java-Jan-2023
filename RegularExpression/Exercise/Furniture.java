package Fundamentals.Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> furnitureList = new ArrayList<>();
        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";

        double totalSum = 0;


        while (!input.equals("Purchase")){

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furniture);
                totalSum += price * quantity;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (int i = 0; i < furnitureList.size(); i++) {
            System.out.println(furnitureList.get(i));
        }
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
