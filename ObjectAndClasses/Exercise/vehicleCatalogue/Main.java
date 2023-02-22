package Fundamentals.OOP.Exercise.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Float.NaN;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Catalogue> catalogueList = new ArrayList<>();
        double carAverageHorsepower = 0.00;
        int countCar = 0;
        int countTruck = 0;
        double truckAverageHorsepower = 0.00;
        while (!command.equals("End")){

            String[] commandArr = command.split(" ");
            String type = commandArr[0];
            String model = commandArr[1];
            String color = commandArr[2];
            int horsePower = Integer.parseInt(commandArr[3]);
            if (type.equals("car")){
                type = "Car";
                carAverageHorsepower += horsePower;
                countCar++;
            } else {
                type = "Truck";
                truckAverageHorsepower += horsePower;
                countTruck++;
            }
            Catalogue catalogue = new Catalogue(type, model, color, horsePower);
            catalogueList.add(catalogue);


            command = scanner.nextLine();
        }

        String printingCommand = scanner.nextLine();

        while (!printingCommand.equals("Close the Catalogue")){

            for (Catalogue item : catalogueList){
                if (printingCommand.equals(item.getModel())){
                    System.out.printf("Type: %s%n", item.getType());
                    System.out.printf("Model: %s%n", item.getModel());
                    System.out.printf("Color: %s%n", item.getColor());
                    System.out.printf("Horsepower: %d%n", item.getHorsePower());
                }
            }

            printingCommand = scanner.nextLine();
        }

        double averageCar = carAverageHorsepower / countCar;
        double averageTruck = truckAverageHorsepower / countTruck;
        if (Double.isNaN(averageTruck)){
            averageTruck = 0.00;
        } else if (Double.isNaN(averageCar)){
            averageCar = 0.00;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCar);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruck);
    }
}
