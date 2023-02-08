package Fundamentals.List.Exercise.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> finalList = new ArrayList<>();
        List<Integer> borders = new ArrayList<>();

        int firstListLength = firstList.size();
        int secondListLength = secondList.size();
        if (firstListLength > secondListLength){
            finalList = LoopLists(firstList, secondList, "bigger");
            borders = calcBorders(firstList, "bigger");
        } else {
            finalList = LoopLists(secondList, firstList, "smaller");
            borders = calcBorders(secondList, "smaller");
        }

        Print(finalList, borders);

    }

    public static void Print(List<Integer>finalList, List<Integer> borders){

        List<Integer> sortedList = new ArrayList<>();
        sortedList = finalList.stream().sorted(Integer::compareTo).collect(Collectors.toList());

        for (Integer item : sortedList){
            if (item > borders.get(0) && item < borders.get(1) || item > borders.get(1) && item < borders.get(0)){
                System.out.printf("%d ", item);
            }
        }
    }

    public static List<Integer> calcBorders(List<Integer> list, String text){
        List<Integer> temporaryList = new ArrayList<>();

        if (text.equals("bigger")) {
            temporaryList.add(list.get(list.size() - 1));
            temporaryList.add(list.get(list.size() - 2));
        } else {
            temporaryList.add(list.get(0));
            temporaryList.add(list.get(1));
        }

        return temporaryList;
    }

    public static List<Integer> LoopLists(List<Integer> bigger, List<Integer> smaller, String text){
        List<Integer> temporaryList = new ArrayList<>();
        if (text.equals("bigger")) {
            int smallerIndex = smaller.size() - 1;

            for (int i = 0; i < bigger.size() - 2; i++) {
                temporaryList.add(bigger.get(i));
                temporaryList.add(smaller.get(smallerIndex));
                smallerIndex--;
            }
        } else {
            int smallerIndex = smaller.size() - 1;

            for (int i = 2; i < bigger.size(); i++) {
                temporaryList.add(bigger.get(i));
                if (smallerIndex == -1){
                    continue;
                }
                temporaryList.add(smaller.get(smallerIndex));
                smallerIndex--;
            }
        }
        return temporaryList;
    }
}
