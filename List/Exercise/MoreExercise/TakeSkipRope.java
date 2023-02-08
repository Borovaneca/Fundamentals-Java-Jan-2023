package Fundamentals.List.Exercise.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        List<Integer> numberList = getNumbers(inputText);
        List<String> nonNumberList = getNonNumbers(inputText);

        List<Integer> takeList = getTakeList(numberList);
        List<Integer> skipList = getSkipList(numberList);

        String modifiedText;
        String finalText = "";

        for (int i = 0; i < takeList.size(); i++) {
            int amountOfLetters = takeList.get(i);
            int skippedAmount = skipList.get(i);
            int firstIndex = 0;
            int secondIndex = 0;
            for (int j = 0; j < amountOfLetters; j++) {
                if (j > nonNumberList.size()-1){
                    break;
                }
                finalText += nonNumberList.get(j);
                firstIndex++;
                nonNumberList.remove(j);
                if (firstIndex == amountOfLetters ) {
                    break;
                }
                j -= 1;
            }
            for (int j = 0; j < skippedAmount; j++) {
                if (j == 0 && nonNumberList.size() == 0){
                    break;
                }
                nonNumberList.remove(j);
                if (secondIndex == skippedAmount){
                    break;
                }
                secondIndex++;
                if (secondIndex == skippedAmount ){
                    break;
                }
                j -= 1;
            }
        }
        System.out.println(finalText);
    }

    private static List<Integer> getSkipList(List<Integer> numList) {
        List<Integer> skipped = new ArrayList<>();

        for (int i = 0; i < numList.size(); i++) {
            if (i % 2 != 0) {
                skipped.add(numList.get(i));
            }
        }
        return skipped;
    }

    private static List<Integer> getTakeList(List<Integer> numList) {
        List<Integer> takenList = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            if (i % 2 == 0) {
                takenList.add(numList.get(i));
            }
        }
        return takenList;
    }

    private static List<String> getNonNumbers(String text) {
        List<String> letters = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (!(Character.isDigit(text.charAt(i)))) {
                letters.add(String.valueOf(text.charAt(i)));
            }
        }
        return letters;
    }

    private static List<Integer> getNumbers(String text) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                numbers.add(Integer.parseInt(String.valueOf(text.charAt(i))));
            }
        }
        return numbers;
    }
}
