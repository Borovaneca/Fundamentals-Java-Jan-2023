package Fundamentals.Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(inputString, repeatTimes));
    }
    public static String repeatString(String input, int times){

        String inputCalc = "";
        for (int i = 1; i <= times; i++) {

            inputCalc += input;
        }

        return inputCalc;
    }
}
