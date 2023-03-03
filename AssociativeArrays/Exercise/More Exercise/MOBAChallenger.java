package Fundamentals.AssociativeArrays.Exercise.MoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Map<String, Integer>> playersMap = new HashMap<>();

        String playerData = scanner.nextLine();

        while (!"Season end".equals(playerData)) {

            if (playerData.contains("->")) {
                String player = playerData.split(" -> ")[0];
                String position = playerData.split(" -> ")[1];
                int skillPoint = Integer.parseInt(playerData.split(" -> ")[2]);

                if (!playersMap.containsKey(player)) {
                    playersMap.put(player, new HashMap<>());
                    playersMap.get(player).put(position, skillPoint);
                } else if (!playersMap.get(player).containsKey(position)) {
                    playersMap.get(player).put(position, skillPoint);
                } else if (playersMap.get(player).get(position) < skillPoint) {
                    playersMap.get(player).put(position, skillPoint);
                }

            } else if (playerData.contains("vs")) {
                String firstPlayer = playerData.split(" vs ")[0];
                String secondPlayer = playerData.split(" vs ")[1];

                if (playersMap.containsKey(firstPlayer)) {
                    if (playersMap.containsKey(secondPlayer)) {

                        for (Map.Entry<String, Integer> first : playersMap.get(firstPlayer).entrySet()) {
                            String currentPosition = first.getKey();
                            for (Map.Entry<String, Integer> second : playersMap.get(secondPlayer).entrySet()) {
                                if (currentPosition.equals(second.getKey())) {
                                    int firstPoints = playersMap.get(firstPlayer).values().stream().mapToInt(integer -> integer).sum();
                                    int secondPoints = playersMap.get(secondPlayer).values().stream().mapToInt(integer -> integer).sum();
                                    if (firstPoints > secondPoints) {
                                        playersMap.remove(secondPlayer);
                                    } else if (secondPoints > firstPoints) {
                                        playersMap.remove(firstPlayer);
                                    }
                                }
                            }

                        }
                    }
                }
            }
            playerData = scanner.nextLine();
        }


        playersMap.entrySet().stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().values().stream().mapToInt(Integer::intValue).sum(),
                            p1.getValue().values().stream().mapToInt(Integer::intValue).sum());
                    if (result == 0) {
                        result = p1.getKey().compareTo(p2.getKey());
                    }
                 return result;
                })
                .forEach(overall -> {
                    System.out.printf("%s: %d skill%n", overall.getKey(), overall.getValue().values().stream().mapToInt(Integer::intValue).sum());
                    overall.getValue()
                            .entrySet()
                            .stream()
                            .sorted((p1, p2) -> {
                                int result = Integer.compare(p2.getValue(), p1.getValue());
                                if (result == 0) {
                                    result = p1.getKey().compareTo(p2.getKey());
                                }
                                return result;
                            })
                            .forEach(item -> {
                                System.out.printf("- %s <::> %d%n", item.getKey(), item.getValue());
                            });
                });
    }
}
