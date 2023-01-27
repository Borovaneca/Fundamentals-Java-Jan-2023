package Fundamentals.Exams.MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] commandArr = command.split(" ");
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                inputArr = swap(inputArr, index1, index2);

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                inputArr = multiply(inputArr, index1, index2);

            } else if (command.contains("decrease")) {
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i] = inputArr[i] - 1;
                }

            }
            command = scanner.nextLine();
        }
        String[] output = Arrays.toString(inputArr).split("[\\[\\]]")[1].split(", ");
        System.out.println(String.join(", ", output));
    }

    public static int[] multiply(int[] arr, int index1, int index2) {
        int first = arr[index1] * arr[index2];
        arr[index1] = first;
        return arr;
    }
    public static int[] swap(int[] arr, int index1, int index2) {

        int firstNum = arr[index2];
        int secondNum = arr[index1];
        arr[index1] = 0;
        arr[index2] = 0;
        arr[index1] = firstNum;
        arr[index2] = secondNum;
        return arr;
    }
}
