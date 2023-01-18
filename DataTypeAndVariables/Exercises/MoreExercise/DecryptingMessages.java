package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises.MoreMore;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int charRotation = Integer.parseInt(scanner.nextLine());
        String decryptedText = "";
        char lastChar = 0;

        for (int i = 1; i <= charRotation; i++) {
            
            char currentChar = scanner.nextLine().charAt(0);
            for (char j = currentChar; j <= currentChar + key; j++) {
                lastChar = j;
            }
            decryptedText += lastChar;
        }
        System.out.println(decryptedText);
    }
}
