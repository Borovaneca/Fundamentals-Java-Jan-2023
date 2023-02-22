package Fundamentals.OOP.Exercise.MoreExercise.rawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int carsAmount = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        for (int i = 1; i <= carsAmount; i++) {
            String car = scanner.nextLine();
            String[] carArr = car.split(" ");
            String model = carArr[0];
            int engineSpeed = Integer.parseInt(carArr[1]);
            int enginePower = Integer.parseInt(carArr[2]);
            int cargoWeight = Integer.parseInt(carArr[3]);
            String cargoType = carArr[4];
            double t1Pressure = Double.parseDouble(carArr[5]);
            int t1Age = Integer.parseInt(carArr[6]);
            double t2Pressure = Double.parseDouble(carArr[7]);
            int t2Age = Integer.parseInt(carArr[8]);
            double t3Pressure = Double.parseDouble(carArr[9]);
            int t3Age = Integer.parseInt(carArr[10]);
            double t4Pressure = Double.parseDouble(carArr[11]);
            int t4Age = Integer.parseInt(carArr[12]);

            Car currentCar = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, t1Pressure, t1Age, t2Pressure, t2Age,
                    t3Pressure, t3Age, t4Pressure, t4Age);

            carList.add(currentCar);
        }
        String command = scanner.nextLine();

        if (command.equals("fragile")){
            printFragile(command, carList);
        } else {
            printFlamable(command, carList);
        }
    }

    public static void printFragile(String command, List<Car> carList) {
        for (Car item : carList) {
            if (item.getCargoType().equals(command) && item.getTire1Pressure() < 1 || item.getTire2Pressure() < 1 || item.getTire3Pressure() < 1 || item.getTire4Pressure() < 1) {
                System.out.println(item.getModel());
            }
        }
    }

    public static void printFlamable(String command, List<Car> carList) {

        for (Car item : carList){
            if (item.getCargoType().equals(command) && item.getEnginePower() > 250){
                System.out.println(item.getModel());
            }
        }
    }
}