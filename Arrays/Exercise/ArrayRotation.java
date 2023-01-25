package Fundamentals.Arrays.Exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] originalArr = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        String[] secondArr = new String[originalArr.length];

        for (int k = 0; k < rotations; k++) {

            for (int i = 0; i < secondArr.length; i++) {

                if (i == 0){
                    secondArr[0] = originalArr[1];
                } else if (i == secondArr.length - 1){
                    secondArr[i] = originalArr[0];
                } else {
                    secondArr[i] = originalArr[i + 1];
                }
            }
            originalArr = secondArr;
            secondArr = new String[originalArr.length];
        }

        for (String s : originalArr) {
            System.out.print(s + " ");
        }
    }
}