package Fundamentals.OOP.Exercise.MoreExercise.CarSalesman;

import java.util.Objects;

public class Car {

    private String model;
    private String engine;
    private int weight;
    private String color;

    public Car(String model, String engine, int weight, String color){

        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, String engine){

        this.model = model;
        this.engine = engine;
    }

    public Car(String model, String engine, int weight){

        this.model = model;
        this.engine = engine;
        this.weight = weight;
    }

    public Car(String model, String engine, String color){

        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWeight() {
        if (weight == 0){
            return "n/a";
        } else {
            return String.valueOf(weight);
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return Objects.requireNonNullElse(color, "n/a");
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s: %s: %d: %s:", this.model, this.engine, this.weight, this.color);
    }
}
