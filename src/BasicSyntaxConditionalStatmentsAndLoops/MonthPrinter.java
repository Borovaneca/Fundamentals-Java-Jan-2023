package BasicSyntaxConditionalStatmentsAndLoops;

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int month = Integer.parseInt(scanner.nextLine());
        String[] mounts = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (month > 12 || month < 1) {
            System.out.println("Error!");
        } else {
            int index = month - 1;
            System.out.println(mounts[index]);
        }
    }
}
