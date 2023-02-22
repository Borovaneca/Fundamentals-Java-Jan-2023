package Fundamentals.OOP.Exercise.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private int capacity;
    private List<Pet> data;


    public GroomingSalon(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;

    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(item -> item.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return this.data.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The grooming salon has the following clients:").append(System.lineSeparator());
        for (Pet pet : data) {
            sb.append(pet.getName());
            sb.append(" ");
            sb.append(pet.getOwner());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
