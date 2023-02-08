package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumRemovedItems = 0;
        while (inputNumbers.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                int valueToReplace = inputNumbers.get(0);
                //this was swapped with the last index

                sumRemovedItems += inputNumbers.get(0);
                inputNumbers.set(0,inputNumbers.get(inputNumbers.size()-1));
                //setting the element was missing
                for (int i = 0; i < inputNumbers.size(); i++) {
                    if (valueToReplace < inputNumbers.get(i)) {
                        inputNumbers.set(i, inputNumbers.get(i) - valueToReplace);
                    } else {
                        inputNumbers.set(i, inputNumbers.get(i) + valueToReplace);
                    }
                }

            } else if (index >= inputNumbers.size()) {
                int valueToReplace = inputNumbers.get(inputNumbers.size() - 1);
                //this was swapped with the first index
                sumRemovedItems += inputNumbers.get(inputNumbers.size() - 1);
                inputNumbers.set((inputNumbers.size()-1),inputNumbers.get(0));
                //setting the element was missing
                for (int i = 0; i < inputNumbers.size(); i++) {
                    if (valueToReplace < inputNumbers.get(i)) {
                        inputNumbers.set(i, inputNumbers.get(i) - valueToReplace);
                    } else {
                        inputNumbers.set(i, inputNumbers.get(i) + valueToReplace);
                    }
                }

            } else {
                int indexValue = inputNumbers.get(index);
                sumRemovedItems += inputNumbers.get(index);
                inputNumbers.remove(index);

                for (int i = 0; i < inputNumbers.size(); i++) {
                    if (indexValue < inputNumbers.get(i)) {
                        inputNumbers.set(i, inputNumbers.get(i) - indexValue);
                    } else {
                        inputNumbers.set(i, inputNumbers.get(i) + indexValue);
                    }
                }
            }
        }
        System.out.printf("%d", sumRemovedItems);
    }
}