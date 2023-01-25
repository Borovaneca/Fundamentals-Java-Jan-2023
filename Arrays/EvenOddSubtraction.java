package Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int odd = 0;
        int even = 0;
        for (int i = 0; i < input.length; i++) {
            int currentNum = Integer.parseInt(input[i]);
            if (currentNum % 2 == 0){
                even += currentNum;
            } else {
                odd += currentNum;
            }
        }
        System.out.println(even - odd);
    }
}
