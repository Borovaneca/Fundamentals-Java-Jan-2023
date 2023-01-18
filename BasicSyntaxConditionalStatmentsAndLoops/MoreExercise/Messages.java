package BasicSyntaxConditionalStatmentsAndLoops.MoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Character> digitToCharMap = new HashMap<>();
        // Ако не искате да го решавате по този начин защото технологията не ви е позната.
        // Можете в фор цикъла да си направите отделни проверки за всеки един възможен вариант.
        // Примерно:
        // if (currentInput.equals("2")) {
        //     output += a
        // }
        // и т.н

        int numberLines = Integer.parseInt(scanner.nextLine());

        digitToCharMap.put("2", 'a');
        digitToCharMap.put("22", 'b');
        digitToCharMap.put("222", 'c');
        digitToCharMap.put("3", 'd');
        digitToCharMap.put("33", 'e');
        digitToCharMap.put("333", 'f');
        digitToCharMap.put("4", 'g');
        digitToCharMap.put("44", 'h');
        digitToCharMap.put("444", 'i');
        digitToCharMap.put("5", 'j');
        digitToCharMap.put("55", 'k');
        digitToCharMap.put("555", 'l');
        digitToCharMap.put("6", 'm');
        digitToCharMap.put("66", 'n');
        digitToCharMap.put("666", 'o');
        digitToCharMap.put("7", 'p');
        digitToCharMap.put("77", 'q');
        digitToCharMap.put("777", 'r');
        digitToCharMap.put("7777", 's');
        digitToCharMap.put("8", 't');
        digitToCharMap.put("88", 'u');
        digitToCharMap.put("888", 'v');
        digitToCharMap.put("9", 'w');
        digitToCharMap.put("99", 'x');
        digitToCharMap.put("999", 'y');
        digitToCharMap.put("9999", 'z');
        digitToCharMap.put("0", ' ');


        String output = "";
        for (int i = 1; i <= numberLines; i++) {
            String currentInput = scanner.nextLine();

            if (digitToCharMap.containsKey(currentInput)) {
                output += digitToCharMap.get(currentInput);
            }

        }
        System.out.println(output);
    }
}

