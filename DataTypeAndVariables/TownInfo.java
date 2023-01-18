package Fundamentals.DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        System.out.printf("%s%s%s", arr[0], arr[2], arr[1]);
    }
}
