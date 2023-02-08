package Fundamentals.List.Exercise.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> raceTime = Arrays
                .stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int finishTime = raceTime.get(raceTime.size()/2);
        int finishTimeIndex = (raceTime.size()-1)/2;

        double leftRacer = GetLeft(raceTime, finishTimeIndex);
        double rightRacer = GetRight(raceTime, finishTimeIndex);
        if (leftRacer - finishTime > rightRacer - finishTime){
            System.out.printf("The winner is right with total time: %.1f", rightRacer);
        } else {
            System.out.printf("The winner is left with total time: %.1f", leftRacer);
        }

    }


    private static double GetRight(List<Integer> list, int start){
        double racerTime = 0;
        for (int i = list.size()-1; i > start; i--) {
            racerTime += list.get(i);
            if (list.get(i) == 0){
                racerTime = racerTime * 0.80;
            }
        }
        return racerTime;
    }

    private static double GetLeft(List<Integer> start, int end){
        double racerTime = 0;
        for (int i = 0; i < end; i++) {
            racerTime += start.get(i);
            if (start.get(i) == 0){
                racerTime = racerTime * 0.80;
            }
        }
        return racerTime;
    }
}
