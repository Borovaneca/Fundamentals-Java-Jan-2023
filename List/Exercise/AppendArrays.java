package Fundamentals.List.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String[] currentArray = input[i].split("\\s+");

            for (int j = currentArray.length - 1; j >= 0; j--) {
                if (!currentArray[j].equals("")) {
                    outputList.add(0, currentArray[j]);
                }
            }
        }
        outputList.forEach(e -> System.out.print(e + " "));
    }
}
//        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
//        for (int i = 0; i < input.size(); i++) {
//            String currentItem = input.get(i);
//            if (currentItem.contains(" ")) {
//                currentItem = currentItem.replaceAll("\\s+", "");
//            }
//            for (int j = currentItem.length() - 1; j >= 0; j--) {
//                outputList.add(0, String.valueOf(currentItem.charAt(j)));
//            }
//        }