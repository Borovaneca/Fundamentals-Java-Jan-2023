package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsList = new LinkedHashMap<>();

        for (int i = 1; i <= number; i++) {

            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsList.containsKey(studentName)) {
                studentsList.put(studentName, new ArrayList<>());
            }
            studentsList.get(studentName).add(grade);
        }

        LinkedHashMap<String, Double> average = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsList.entrySet()) {

            double sum = getAverage(entry.getValue());
            if (sum >= 4.50){
                average.put(entry.getKey(), sum);
            }
        }

        average.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));

    }

    private static double getAverage(List<Double> grades) {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
}