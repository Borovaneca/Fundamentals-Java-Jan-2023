package Fundamentals.Arrays.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        int[] peopleInTrain = new int[input];
        int sumPeople = 0;
        for (int i = 0; i < input; i++) {
                peopleInTrain[i] = Integer.parseInt(scanner.nextLine());
                sumPeople += peopleInTrain[i];
        }

        for (int i = 0; i < peopleInTrain.length; i++) {
            System.out.print(peopleInTrain[i] + " ");
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
