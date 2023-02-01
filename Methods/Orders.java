package Fundamentals.Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", calcNum(type, num));


    }

    public static Double calcNum(String type,int number){

        double price = 0;
        switch (type){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        price = number * price;
        return price;
    }
}
