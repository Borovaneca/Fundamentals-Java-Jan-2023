package Fundamentals.Arrays.Exercise.MoreExercise;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] inputArr = new int[Integer.parseInt(scanner.nextLine())];

        if (inputArr.length <= 1) {
            System.out.println("1");
        } else {
            inputArr[0] = 1;
            inputArr[1] = 1;
            for (int i = 2; i < inputArr.length; i++) {
                inputArr[i] = inputArr[i-1] + inputArr[i-2];
            }
        }
        boolean fibonacci = false;
        int count = 0;
        for (int i = 2; i < inputArr.length; i++) {
            if (GetFibonacci(inputArr[i]) == GetFibonacci(inputArr[i-1]) + GetFibonacci(inputArr[i-2])) {
                count++;
            }
            if (count == inputArr.length - 2) {
                fibonacci = true;
            }
        }
        if (fibonacci) {
            System.out.println(inputArr[inputArr.length - 1]);
        }
    }

    public static int GetFibonacci(int number) {

        int first = 1;
        int second = 1;
        int sum = 1;
        for (int i = 1; i < number; i++) {
            sum = first + second;
            if (sum == number){
                return sum;
            }
            if (i % 2 == 0) {
                second = sum;
            } else {
                first = sum;
            }
        }
        if (sum <= 0) {
            return 1;
        } else {
            return sum;
        }
    }
}