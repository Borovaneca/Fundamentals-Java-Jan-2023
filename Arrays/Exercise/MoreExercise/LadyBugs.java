package Fundamentals.Arrays.Exercise.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] fieldArr = new int[fieldSize];

        int[] ladyBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ladyBugsSize = ladyBugs.length;
        for (int i = 0; i < fieldArr.length; i++) {
            if (ladyBugsSize > fieldSize){
                ladyBugsSize = fieldSize;
            }
            for (int j = 0; j < ladyBugsSize; j++) {
                if (i == ladyBugs[j]){
                    fieldArr[i] = 1;
                }
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandArr = command.split(" ");
            String currentCommand = commandArr[1];

            if (currentCommand.equals("right")) {
                int leftNum = Integer.parseInt(commandArr[0]);
                int rightNum = leftNum + Integer.parseInt(commandArr[2]);
                fieldArr = moveRight(fieldArr, leftNum, rightNum);

            } else {
                int leftNum = Integer.parseInt(commandArr[0]);
                int rightNum = leftNum - Integer.parseInt(commandArr[2]);
                if (leftNum > rightNum){
                    fieldArr = moveLeft(fieldArr, leftNum, rightNum);
                } else {
                    fieldArr = moveRight(fieldArr, leftNum, rightNum);
                }
            }


            command = scanner.nextLine();
        }

        for (Integer item : fieldArr) {
            System.out.printf("%d ", item);
        }


    }

    public static int[] moveLeft(int[] arr, int start, int end){
        for (int i = start; i >= end; i--) {
            if (end < 0){
                arr[i] = 0;
                break;
            }
            arr[start] = 0;
            if (i == end && arr[i] == 0){
                arr[i] = 1;
            } else if (i == end && arr[i] == 1){
                start -= 1;
            }
        }
        return arr;
    }

    public static int[] moveRight(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            arr[start] = 0;
            if (end > arr.length - 1) {
                break;
            }
            if (i == end) {
                if (arr[i] == 1){
                    end++;
                } else {
                    arr[i] = 1;
                }
            }

        }
        return arr;
    }
}