package FinalExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Integer>> heroes = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String name = inputData[0];
            int health = Math.min(Integer.parseInt(inputData[1]), 100);
            int mana = Math.min(Integer.parseInt(inputData[2]), 200);

            heroes.put(name, new ArrayList<>());
            heroes.get(name).add(health);
            heroes.get(name).add(mana);

        }

        String command;
        while (!"End".equals(command = scanner.nextLine())) {
            String[] commandsArr = command.split(" - ");
            String currentCommand = commandsArr[0];
            String heroName = commandsArr[1];

            switch (currentCommand) {
                case "CastSpell": {
                    int mpNeeded = Integer.parseInt(commandsArr[2]);
                    String spell = commandsArr[3];
                    if (heroes.get(heroName).get(1) >= mpNeeded) {
                        heroes.get(heroName).set(1, heroes.get(heroName).get(1) - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spell, heroes.get(heroName).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spell);
                    }
                }
                break;
                case "TakeDamage": {
                    int damage = Integer.parseInt(commandsArr[2]);
                    String attacker = commandsArr[3];
                    heroes.get(heroName).set(0, heroes.get(heroName).get(0) - damage);
                    if (heroes.get(heroName).get(0) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, heroes.get(heroName).get(0));
                    } else {
                        heroes.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }
                }
                break;
                case "Recharge": {
                    int amount = Integer.parseInt(commandsArr[2]);
                    int recovered = 0;
                    if (amount + heroes.get(heroName).get(1) > 200) {
                        recovered = 200 - heroes.get(heroName).get(1);
                        heroes.get(heroName).set(1, 200);
                    } else {
                        heroes.get(heroName).set(1, heroes.get(heroName).get(1) + amount);
                        recovered = amount;
                    }
                    System.out.printf("%s recharged for %d MP!\n", heroName, recovered);

                }
                break;
                case "Heal": {
                    int healAmount = Integer.parseInt(commandsArr[2]);
                    int recovered = 0;
                    if (healAmount + heroes.get(heroName).get(0) > 100) {
                        recovered = 100 - heroes.get(heroName).get(0);
                        heroes.get(heroName).set(0, 100);
                    } else {
                        recovered = healAmount;
                        heroes.get(heroName).set(0, healAmount + heroes.get(heroName).get(0));
                    }
                    System.out.printf("%s healed for %d HP!\n", heroName, recovered);
                }
                break;
            }
        }

        heroes.forEach((key, value) -> {
            System.out.println(key);
            System.out.println("  HP: " + value.get(0));
            System.out.println("  MP: " + value.get(1));
        });
    }
}
