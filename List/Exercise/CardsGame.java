package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstPlayer = Arrays
                .stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays
                .stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!(firstPlayer.size() < 1) && !(secondPlayer.size() < 1)){
            if (firstPlayer.get(0) > secondPlayer.get(0)){
                int firstHand = firstPlayer.get(0);
                int secondHand = secondPlayer.get(0);
                secondPlayer.remove(0);
                firstPlayer.remove(0);
                firstPlayer.add(firstHand);
                firstPlayer.add(secondHand);
            } else if (secondPlayer.get(0) > firstPlayer.get(0)){
                int firstHand = firstPlayer.get(0);
                int secondHand = secondPlayer.get(0);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                secondPlayer.add(secondHand);
                secondPlayer.add(firstHand);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }
        }
        int sum = 0;
        if (firstPlayer.size() > secondPlayer.size()){
            for (Integer item : firstPlayer){
                sum += item;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (Integer item : secondPlayer){
                sum += item;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
