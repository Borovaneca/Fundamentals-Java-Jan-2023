package Fundamentals.Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int planets = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanetsList = new ArrayList<>();
        List<String> destroyedPlanetsList = new ArrayList<>();

        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        int attacked = 0;
        int destroyed = 0;


        for (int i = 1; i <= planets; i++) {

            String input = scanner.nextLine();
            char[] charArr = input.toCharArray();
            int countSymbols = getCharCount(charArr);
            String newText = "";
            for (int j = 0; j < charArr.length; j++) {
                char newSymbol = (char) (charArr[j] - countSymbols);
                charArr[j] = newSymbol;
                newText += charArr[j];
            }

            Matcher matcher = pattern.matcher(newText);
            String name = "";
            String types = "";
            if (matcher.find()){
                name = matcher.group("planetName");
                types = matcher.group("attackType");
            }
            if (types.equals("A")){
                attacked++;
                attackedPlanetsList.add(name);
            } else if (types.equals("D")){
                destroyed++;
                destroyedPlanetsList.add(name);
            }
        }

        Collections.sort(attackedPlanetsList);
        System.out.println("Attacked planets: " + attacked);
        for (int i = 0; i < attackedPlanetsList.size(); i++) {
            System.out.println("-> " + attackedPlanetsList.get(i));
        }
        Collections.sort(destroyedPlanetsList);
        System.out.println("Destroyed planets: " + destroyed);
        for (int i = 0; i < destroyedPlanetsList.size(); i++) {
            System.out.println("-> " + destroyedPlanetsList.get(i));
        }
    }


    public static int getCharCount(char[] chars){
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'S' || chars[i] == 's' || chars[i] == 'T' || chars[i] == 't' || chars[i] == 'A' ||
            chars[i] == 'a' || chars[i] == 'R' || chars[i] == 'r'){
                count++;
            }
        }
        return count;
    }
}
