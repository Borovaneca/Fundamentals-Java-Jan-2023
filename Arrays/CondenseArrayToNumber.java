package Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 1){
                break;
            }

            if (i == nums.length - 1){
                int[] condensedNew = new int[condensed.length - 1];
                i = -1;
                nums = condensed;
                condensed = condensedNew;
            } else {
                condensed[i] = nums[i] + nums[i + 1];
            }
        }
        System.out.println(nums[0]);
    }
}
