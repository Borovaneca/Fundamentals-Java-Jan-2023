package Fundamentals.OOP.Exercise.MoreExercise.CarSalesman;

public class Engine {

    private String model;
    private String power;
    private int displacement;
    private String efficiency;


    public Engine(String model, String power){

        this.model = model;
        this.power = power;
    }

    public Engine(String model, String power, int displacement){

        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    public Engine(String model, String power, String efficiency){

        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, String power, int displacement, String efficiency){

        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDisplacement() {
        if (displacement == 0){
            return "n/a";
        } else {
            return String.valueOf(displacement);
        }
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        if (efficiency == null){
            return "n/a";
        } else {
            return efficiency;
        }
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s: %s: %d: %s:", model, power, displacement, efficiency);
    }
}
