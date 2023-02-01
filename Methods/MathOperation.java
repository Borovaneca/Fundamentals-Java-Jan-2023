package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = operation(firstNum, operator, secondNum);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double operation(int first, String operator, int second){
        double result = 0;
        switch (operator){
            case "/":
                result = (1.0 * first) / second;
                break;
            case "*":
                result = (1.0 * first) * second;
                break;
            case "+":
                result = first + second;
                break;
            case "-":
                result = Math.abs(first-second);
                break;
        }
        return result;
    }
}
