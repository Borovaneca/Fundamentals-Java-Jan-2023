package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] players = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> playersDeque = new ArrayDeque<>();

        Collections.addAll(playersDeque, players);

        int countPrime = 1;

        while (playersDeque.size() > 1) {

            for (int i = 0; i < number - 1; i++) {
                String current = playersDeque.poll();
                playersDeque.offer(current);
            }

            if (Checker(countPrime)) {
                String primePlayer = playersDeque.peek();
                System.out.println("Prime " + primePlayer);
            } else {
                String playerName = playersDeque.poll();
                System.out.println("Removed " + playerName);
            }
            countPrime++;
        }

        System.out.println("Last is " + playersDeque.poll());
    }



    public static boolean Checker(int number){
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
