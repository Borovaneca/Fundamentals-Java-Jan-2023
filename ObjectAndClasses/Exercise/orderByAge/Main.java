package Fundamentals.OOP.Exercise.orderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Order> orderList = new ArrayList<>();
        while (!command.equals("End")) {
            String[] currentCommand = command.split(" ");
            String name = currentCommand[0];
            String id = currentCommand[1];
            int age = Integer.parseInt(currentCommand[2]);
            Order order = new Order(name, id, age);
            orderList.add(order);

            command = scanner.nextLine();
        }
        orderList.sort(Comparator.comparing(Order::getAge));
        for (Order current : orderList){
            System.out.println(current);
        }
    }
}
