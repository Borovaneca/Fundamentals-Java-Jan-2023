package BasicSyntaxConditionalStatmentsAndLoops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("00.####");

        for (int i = 1; i <= 30; i++) {
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        System.out.printf("%d:%s", hour, df.format(minutes));
    }
}
