package Fundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTruck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < list.size() - 1; i++) {
            int first = list.get(i);
            int second = list.get(list.size() - 1);
            list.set(i, first+second);
            list.remove(list.size()-1);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        }
    }
}
