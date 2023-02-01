package Fundamentals.Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int even = evenSum(Math.abs(number));
        int odds = oddSum(Math.abs(number));
        int total = even * odds;
        System.out.println(total);
    }

    public static int evenSum (int num){
        String toString = String.valueOf(num);
        int even = 0;
        int odds = 0;
        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 == 0){
                even += currentNum;
            } else {
                odds += currentNum;
            }
        }
        return even;
    }

    public static int oddSum (int num){
        String toString = String.valueOf(num);
        int even = 0;
        int odds = 0;
        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 == 0){
                even += currentNum;
            } else {
                odds += currentNum;
            }
        }
        return odds;
    }
}
