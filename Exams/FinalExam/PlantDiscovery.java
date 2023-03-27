import java.util.*;

public class Plant_Discovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> plants = new HashMap<>();
        HashMap<String, List<Double>> ratings = new HashMap<>();

        while (number-- > 0) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);

            plants.put(plant, rarity);
            ratings.putIfAbsent(plant, new ArrayList<>());
        }

        String input;
        while (!"Exhibition".equals(input = scanner.nextLine())) {
            String[] tokens = input.split(": ");
            String command = tokens[0];
            String[] data = tokens[1].split(" - ");
            String name = data[0];

            if (!plants.containsKey(data[0])) {
                System.out.println("error");
                continue;
            }

            switch (command) {
                case "Rate": {
                    double rating = Double.parseDouble(data[1]);
                    ratings.get(name).add(rating);
                    break;
                }
                case "Update": {
                    int updatedRarity = Integer.parseInt(data[1]);
                    plants.put(name, updatedRarity);
                    break;
                }
                case "Reset": {
                    ratings.get(name).clear();
                    break;
                }
                default:
                    System.out.println("error");
            }
        }

        System.out.println("Plants for the exhibition:");


for (Map.Entry<String, Integer> entry : plants.entrySet()) {
    String plant = entry.getKey();
    int rarity = entry.getValue();
    double averageRating = ratings.get(plant).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f", plant, rarity, averageRating));
}


    }
}
