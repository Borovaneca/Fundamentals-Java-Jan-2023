package Fundamentals.TextProcessing.Exercise.MoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int beginName = input.indexOf('@');
            int endName = input.indexOf('|');
            int beginAge = input.indexOf('#');
            int endAge = input.indexOf('*');
            System.out.printf(String.format("%s is %s years old.\n", input.substring(beginName + 1, endName), input.substring(beginAge + 1, endAge)));
        }

//        String currentName = "";
//        String currentAge = "";
//        boolean start = false;
//        boolean end = false;
//        for (int i = 0; i < n; i++) {
//            String input = scanner.nextLine();
//            currentName = "";
//            currentAge = "";
//            for (int j = 0; j < input.length(); j++) {
//                if (input.charAt(j) == '@' || start) {
//                    start = true;
//                    if (input.charAt(j) == '@')  {
//                        continue;
//                    }
//                    if (!(input.charAt(j) == '|')) {
//                        currentName += input.charAt(j);
//                    } else {
//                        start = false;
//                    }
//
//                } else if (input.charAt(j) == '#' || end) {
//                    end = true;
//                    if (input.charAt(j) == '#') {
//                        continue;
//                    }
//                    if (!(input.charAt(j) == '*')) {
//                        currentAge += input.charAt(j);
//                    } else {
//                        end = false;
//                    }
//                }
//            }
//
//            System.out.printf("%s is %s years old.\n", currentName, currentAge);
    }
}
