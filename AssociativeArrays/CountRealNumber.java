package Fundamentals.AssociativeArrays;

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> numberOfOccurrences = new TreeMap<>();

        for (int i = 0; i < number.length; i++) {
            double currentNumber = number[i];
            if (numberOfOccurrences.containsKey(currentNumber)){
                for (Map.Entry<Double, Integer> doubleIntegerEntry : numberOfOccurrences.entrySet()) {
                    if (doubleIntegerEntry.getKey().equals(currentNumber)){
                        int oldValue = doubleIntegerEntry.getValue();
                        doubleIntegerEntry.setValue(oldValue+1);
                    }
                }
            } else {
                numberOfOccurrences.put(currentNumber, 1);
            }
        }

        DecimalFormat df = new DecimalFormat("0.####");
        for (Map.Entry<Double, Integer> doubleIntegerEntry : numberOfOccurrences.entrySet()) {
            double current = doubleIntegerEntry.getKey();
            System.out.printf("%s -> %d%n", df.format(current), doubleIntegerEntry.getValue());

        }

    }
}
