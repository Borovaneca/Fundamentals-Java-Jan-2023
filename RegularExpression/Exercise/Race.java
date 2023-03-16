package Fundamentals.Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String participants = scanner.nextLine();
        List<String> racers = Arrays.stream(participants.split(", ")).collect(Collectors.toList());
        String regexLetters = "[A-Za-z]*";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String timeRegex = "[0-9]*";
        Pattern patternTime = Pattern.compile(timeRegex);

        String input = scanner.nextLine();
        Map<String, Integer> racerDistance = new LinkedHashMap<>();
        racers.forEach(name -> racerDistance.put(name, 0));

        while (!input.equals("end of race")){

            StringBuilder racerName = new StringBuilder();
            StringBuilder racerTime = new StringBuilder();

            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()){
                racerName.append(matcherLetters.group());
            }
            String name = String.valueOf(racerName);

            Matcher matcherTime = patternTime.matcher(input);
            while (matcherTime.find()){
                racerTime.append(matcherTime.group());
            }
            String numbers = String.valueOf(racerTime);

            int sumTime = 0;
            for (int i = 0; i < numbers.length(); i++) {
                sumTime += Integer.parseInt(String.valueOf(numbers.charAt(i)));
            }

            if (racerDistance.containsKey(name)){
                racerDistance.put(name, sumTime + racerDistance.get(name));
            }


            input = scanner.nextLine();
        }

        System.out.println("1st place: " + racers.get(0));
        System.out.println("2nd place: " + racers.get(1));
        System.out.println("3rd place: " + racers.get(2));

    }
}
