package Fundamentals.AssociativeArrays;

import java.util.*;

public class WordsSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();
        List<String> synonyms = new ArrayList<>();
        for (int i = 1; i <= rotation; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordsMap.containsKey(word)){
                wordsMap.put(word, new ArrayList<>());
            }
            wordsMap.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {

            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

    }
}
