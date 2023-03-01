package Fundamentals.AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : inputArr){

            word = word.toLowerCase();
            if (!wordsMap.containsKey(word)){
                wordsMap.put(word, 1);
            } else {
                wordsMap.put(word, wordsMap.get(word) + 1);
            }
        }

        ArrayList<String> keyList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (!(entry.getValue() % 2 == 0)){
                keyList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", keyList));

    }
}
