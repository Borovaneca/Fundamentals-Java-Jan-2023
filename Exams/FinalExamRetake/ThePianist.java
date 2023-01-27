package Fundamentals.Exams.FinalExamRetake;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int musicalPieces = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> musicalPiecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= musicalPieces; i++) {
            String[] piecesData = scanner.nextLine().split("\\|");
            String pieceName = piecesData[0];
            String composer = piecesData[1];
            String key = piecesData[2];
            musicalPiecesMap.putIfAbsent(pieceName, new ArrayList<>());
            musicalPiecesMap.get(pieceName).add(composer);
            musicalPiecesMap.get(pieceName).add(key);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] commandData = input.split("\\|");
            String action = commandData[0];

            switch (action) {
                case "Add":
                    String pieceToAdd = commandData[1];
                    if (musicalPiecesMap.containsKey(pieceToAdd)) {
                        System.out.printf("%s is already in the collection!%n", pieceToAdd);
                    } else {
                        String composerToAdd = commandData[2];
                        String keyToAdd = commandData[3];
                        musicalPiecesMap.put(pieceToAdd, new ArrayList<>());
                        musicalPiecesMap.get(pieceToAdd).add(composerToAdd);
                        musicalPiecesMap.get(pieceToAdd).add(keyToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n", pieceToAdd, composerToAdd, keyToAdd);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = commandData[1];
                    if (!musicalPiecesMap.containsKey(pieceToRemove)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                    } else {
                        musicalPiecesMap.remove(pieceToRemove);
                        System.out.printf("Successfully removed %s!%n", pieceToRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceToKeyChange = commandData[1];
                    String newKey = commandData[2];
                    if (musicalPiecesMap.containsKey(pieceToKeyChange)) {
                        musicalPiecesMap.get(pieceToKeyChange).remove(musicalPiecesMap.get(pieceToKeyChange).size() - 1);
                        musicalPiecesMap.get(pieceToKeyChange).add(newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceToKeyChange, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToKeyChange);
                    }

                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry <String, List<String>> entry : musicalPiecesMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
