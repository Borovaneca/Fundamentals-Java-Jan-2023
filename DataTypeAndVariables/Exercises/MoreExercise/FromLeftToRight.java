package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises.MoreMore;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {

            String first = scanner.nextLine();

            String[] firstArr = first.split(" ");
            System.out.println(calculate(firstArr[0], firstArr[1]));
        }
    }

    public static int calculate(String left, String right) {
        int sum = 0;
        long leftInt = Long.parseLong(left);
        long rightInt = Long.parseLong(right);

        if (leftInt > rightInt) {
            for (int i = 0; i < left.length(); i++) {
                if (left.charAt(i) == '-'){
                    continue;
                }
                int currentInt = Integer.parseInt(String.valueOf(left.charAt(i)));
                sum += currentInt;
            }
        } else {
            for (int i = 0; i < right.length(); i++) {
                if (right.charAt(i) == '-'){
                    continue;
                }
                int currentInt = Integer.parseInt(String.valueOf(right.charAt(i)));
                sum += currentInt;
            }
        }
        return sum;

    }
}
