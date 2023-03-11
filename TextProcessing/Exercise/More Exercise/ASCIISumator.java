package Fundamentals.TextProcessing.Exercise.MoreExercise;

import java.util.Scanner;

public class ASCIISumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (one > input.charAt(i) && two < input.charAt(i) ||
                two > input.charAt(i) && one < input.charAt(i)) {
                sum += input.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
