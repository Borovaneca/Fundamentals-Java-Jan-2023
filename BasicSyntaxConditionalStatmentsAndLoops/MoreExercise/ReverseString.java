package BasicSyntaxConditionalStatmentsAndLoops.MoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String reversedInput = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            reversedInput = currentChar+reversedInput;
        }
        System.out.println(reversedInput);
    }
}
