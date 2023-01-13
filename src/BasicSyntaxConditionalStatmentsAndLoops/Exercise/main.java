package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] children = scan.nextLine().split("\\s+");
        int n = Integer.valueOf(scan.nextLine());
        int round = 1;

        ArrayDeque<String> childrens = new ArrayDeque<>();

        Collections.addAll(childrens, children);

        while (childrens.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                String currentChild = childrens.poll();
                childrens.offer(currentChild);
            }
            if (isPrime(round)) {
                String child = childrens.peek();
                System.out.println("Prime " + child);
            } else {
                String child = childrens.poll();
                System.out.println("Removed " + child);
            }
            round++;

        }
        System.out.println("Last is " + childrens.poll());
    }

    private static boolean isPrime(int number) {
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

