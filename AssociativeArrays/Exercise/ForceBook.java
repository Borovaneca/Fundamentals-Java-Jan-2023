package Fundamentals.AssociativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine(); //валидна команда или Lumpawaroo

        //запис: група (side) -> списък с user-и
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {
            //валидна команда
            if (command.contains(" | ")) {
                //command = "{force_side} | {force_user}".split(" | ") -> ["{force_side}", "{force_user}"]
                String group = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];
                //1. дали нямаме такава група
                if (!map.containsKey(group)) {
                    //група -> празен списък
                    map.put(group, new ArrayList<>());
                }
                //2. имаме такава група -> добавяме към групата user, ако го няма в НИКОЯ ГРУПА
                boolean isExistUser = false; //user го има в даден група
                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        //user го има в някоя група
                        isExistUser = true;
                        break;
                    }
                }

                if (!isExistUser) {
                    //user го няма в никоя група
                    map.get(group).add(user);
                }
            } else if (command.contains(" -> ")) {
                //command = "{force_user} -> {force_side}".split(" -> ") -> ["{force_user}", "{force_side}"]
                String user = command.split("\\s+->\\s+")[0];
                String group = command.split("\\s+->\\s+")[1]; //група, в която отива

                //1. ако дадения user го има в дадена група -> премахваме го от текущата група
                //запис: група (key) -> списък с users (value)
                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                //2. проверяваме дали имаме такава група, в която отива
                if (map.containsKey(group)) {
                    map.get(group).add(user);
                } else {
                    //нямама такава група, в която иска да отиде -> създаваме
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }

                System.out.printf("%s joins the %s side!%n", user, group);
            }
            command = scanner.nextLine();
        }


        //запис: група -> списък с user-и
        //1. филтрирам записите -> бр. хората > 0
        map.entrySet()  //всички записи
                .stream().filter(entry -> entry.getValue().size() > 0) //оставяме само записите, които отговарят на условието да имат хора в групата
                //списък със записи, които отговарят на условието
                .forEach(entry -> {
                            //entry: groupName(key) -> list of users (value)
                            //"Side: {forceSide}, Members: {forceUsers.Count}
                            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(user -> System.out.println("! " + user));
                        }
                );
    }
}