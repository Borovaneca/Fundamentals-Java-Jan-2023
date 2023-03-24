package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[#]{1}(?<one>[A-Za-z][A-Za-z][A-Za-z]+)[#]{1}[#]{1}(?<two>[A-Za-z][A-Za-z][A-Za-z]+)[#]{1}|[@]{1}(?<three>[A-Za-z][A-Za-z][A-Za-z]+)[@]{1}[@]{1}(?<four>[A-Za-z][A-Za-z][A-Za-z]+)[@]{1}";
        Pattern pattern = Pattern.compile(regex);

        StringBuilder sbuinder = new StringBuilder(scanner.nextLine());
        List<String> container = new ArrayList<>();
        Matcher matcher = pattern.matcher(sbuinder);
        int pairs = 0;
        while (matcher.find()) {
            String textOne = matcher.group("one");
            String textTwo = matcher.group("two");
            String textThree = matcher.group("three");
            String textFour = matcher.group("four");
            if (textOne != null) {
                container.add(textOne);
            }
            if (textTwo != null) {
                container.add(textTwo);
            }
            if (textThree != null) {
                container.add(textThree);
            }
             if (textFour != null) {
                 container.add(textFour);
             }

                pairs++;
        }

        List<String> output = new ArrayList<>();

        for (int i = 0; i < container.size(); i++) {
            String normal = container.get(i);
            container.remove(i);
            String reversed = new StringBuilder(normal).reverse().toString();
            if (container.contains(reversed)) {
                output.add(normal + " <=> " + container.get(container.lastIndexOf(reversed)));
                container.remove(reversed);
            }
            i--;

        }
        if (pairs != 0) {
            System.out.printf("%d word pairs found!\n", pairs);
        } else {
            System.out.println("No word pairs found!");
        }
        if (output.size() != 0) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", output));
        } else {
            System.out.println("No mirror words!");
        }
    }
}
