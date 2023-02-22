package Fundamentals.OOP.Exercise;

import java.util.*;

public class AdvertisementMessage {

    private static class Advertisement {
        String[] phrasesArr = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product." };
        String[] eventsArr = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!" };
        String[] authorsArr = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva" };
        String[] citiesArr = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse" };

        Random rnd = new Random();

        public String getAdvertisement(){
            String output =phrasesArr[rnd.nextInt(phrasesArr.length)] + " " + eventsArr[rnd.nextInt(eventsArr.length)] + " " + authorsArr[rnd.nextInt(authorsArr.length)]
                     + " " + citiesArr[rnd.nextInt(citiesArr.length)];

            return output;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int printTimes = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= printTimes; i++) {
            Advertisement advert = new Advertisement();
            System.out.println(advert.getAdvertisement());
        }
    }
}
