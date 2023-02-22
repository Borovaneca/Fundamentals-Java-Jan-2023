package Fundamentals.OOP.Exercise.MoreExercise.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int engineModels = Integer.parseInt(scanner.nextLine());

        List<Engine> engineList = new ArrayList<>();
        for (int i = 1; i <= engineModels; i++) {

            String currentEngine = scanner.nextLine();
            String[] engineArr = currentEngine.split(" ");
            String model = engineArr[0];
            String power = engineArr[1];
            int displacement;
            String efficiency = "";

            if (engineArr.length == 4){
                displacement = Integer.parseInt(engineArr[2]);
                efficiency = engineArr[3];
                Engine engine = new Engine(model, power, displacement, efficiency);
                engineList.add(engine);
            } else if (engineArr.length == 3){
                if (Character.isDigit(engineArr[2].charAt(0))){
                    displacement = Integer.parseInt(engineArr[2]);
                    Engine engine = new Engine(model, power, displacement);
                    engineList.add(engine);
                } else {
                    efficiency = engineArr[2];
                    Engine engine = new Engine(model, power, efficiency);
                    engineList.add(engine);
                }
            } else {
                Engine engine = new Engine(model, power);
                engineList.add(engine);
            }
        }

        int carRotation = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 1; i <= carRotation; i++) {

            String currentCar = scanner.nextLine();
            String[] carArr = currentCar.split(" ");
            String model = carArr[0];
            String engine = carArr[1];
            int weight;
            String color;
            if (carArr.length == 4){
                weight = Integer.parseInt(carArr[2]);
                color = carArr[3];
                Car current = new Car(model, engine, weight, color);
                carList.add(current);
            } else if (carArr.length == 3){
                if (Character.isDigit(carArr[2].charAt(0))){
                    weight = Integer.parseInt(carArr[2]);
                    Car current = new Car(model, engine, weight);
                    carList.add(current);
                } else {
                    color = carArr[2];
                    Car current = new Car(model, engine, color);
                    carList.add(current);
                }
            } else {
                Car current = new Car(model, engine);
                carList.add(current);
            }
        }

        for (Car car : carList){
            System.out.printf("%s:%n", car.getModel());
            for (Engine engine : engineList){
                if (car.getEngine().equals(engine.getModel())){
                    System.out.printf("  %s:%n", engine.getModel());
                    System.out.printf("    Power: %s%n", engine.getPower());
                    System.out.printf("    Displacement: %s%n", engine.getDisplacement());
                    System.out.printf("    Efficiency: %s%n", engine.getEfficiency());
                    break;
                }
            }
            System.out.printf("  Weight: %s%n", car.getWeight());
            System.out.printf("  Color: %s%n", car.getColor());
        }
    }
}
