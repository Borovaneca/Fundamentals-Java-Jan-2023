package Demo;

import java.util.*;

public class NeedForSpeedIII {

    private static class Car {

        private String model;
        private int mileage;
        private int fuel;

        public Car(String car, int mileage, int fuel) {
            this.model = car;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public void drive(int distance, int fuel) {
            if (fuel <= this.fuel) {
                setFuel(this.fuel - fuel);
                setMileage(getMileage() + distance);
                System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", this.model, distance, fuel);

            } else {
                System.out.println("Not enough fuel to make that ride");
            }
        }

        public void reFuel(int fuel) {
            int fueledLiters = 0;
            if (fuel + this.fuel <= 75) {
                fueledLiters += fuel;
                setFuel(getFuel() + fueledLiters);
            } else {
                fueledLiters = fuel - ((fuel + this.fuel) - 75);
                setFuel(getFuel() + fueledLiters);
            }

            System.out.printf("%s refueled with %d liters\n", getModel(), fueledLiters);
        }

        public void revert(int kilometers) {
            if (getMileage() - kilometers <= 10000) {
                setMileage(10000);
            } else {
                setMileage(getMileage() - kilometers);
                System.out.printf("%s mileage decreased by %d kilometers\n", getModel(), kilometers);
            }
        }
        public boolean isOld() {
            return this.mileage >= 100000;
        }
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", this.model, this.mileage, this.fuel);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        int amountOfCars = Integer.parseInt(scanner.nextLine());

        while (amountOfCars-- > 0) {
            String[] tokens = scanner.nextLine().split("\\|");
            String carModel = tokens[0];
            int mileage = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);
            Car currentCar = new Car(carModel,mileage, fuel);
            carList.add(currentCar);
        }

        String command;

        while (!"Stop".equals(command = scanner.nextLine())) {

            String[] commandArr = command.split(" : ");
            String currentCommand = commandArr[0];

            if (currentCommand.equals("Drive")) {
                if (findCarIndex(carList, commandArr[1]) != -1) {
                    carList.get(findCarIndex(carList, commandArr[1])).drive(Integer.parseInt(commandArr[2]), Integer.parseInt(commandArr[3]));

                    if (carList.get(findCarIndex(carList, commandArr[1])).getMileage() >= 100000) {
                        System.out.printf("Time to sell the %s!\n", commandArr[1]);
                        Car carToRemove = carList.get(findCarIndex(carList, commandArr[1]));
                        carList.remove(carToRemove);
                    }
                }

            } else if (currentCommand.equals("Refuel")) {
                if (findCarIndex(carList, commandArr[1]) != -1) {
                    carList.get(findCarIndex(carList, commandArr[1])).reFuel(Integer.parseInt(commandArr[2]));
                }
            } else if (currentCommand.equals("Revert")) {
                if (findCarIndex(carList, commandArr[1]) != -1) {
                    carList.get(findCarIndex(carList, commandArr[1])).revert(Integer.parseInt(commandArr[2]));
                }
            }
        }

        carList.forEach(System.out::println);


    }

    private static int findCarIndex(List<Car> carList, String carModel) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getModel().equals(carModel)) {
                return i;
            }
        }
        return -1;
    }
}
