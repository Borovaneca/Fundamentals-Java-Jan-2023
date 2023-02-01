package Fundamentals.Methods.Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int addedSum = sumNum(firstNum, secondNum);
        int subtractionResult = subtractNum(addedSum, thirdNum);

        System.out.println(subtractionResult);

    }

    public static int sumNum(int first, int second){

        int result = first + second;

        return result;
    }

    public static int subtractNum(int summedNum, int subtractionNum){

        return summedNum - subtractionNum;
    }
}
