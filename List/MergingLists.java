package Fundamentals.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> lastList = new ArrayList<>();
        boolean full = false;
        int count = -1;

        while (!full){
            count++;
            if (!(count < firstList.size()) && !(count < secondList.size())){
                full = true;
            } else {
                if (count < firstList.size()) {
                    lastList.add(firstList.get(count));
                }
                if (count < secondList.size()) {
                    lastList.add(secondList.get(count));
                }
            }
        }
        for (Integer element : lastList){
            System.out.print(element + " ");
        }
    }
}
