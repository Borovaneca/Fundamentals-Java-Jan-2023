package Fundamentals.List.Exercise.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double money = Double.parseDouble(scanner.nextLine());
        List<Integer> initialQuality = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> duringWork = new ArrayList<>(initialQuality);

        String command = scanner.nextLine();

        while (!command.equals("Hit it again, Gabsy!")){

            int currentPower = Integer.parseInt(command);
            for (int i = 0; i < duringWork.size(); i++) {
                duringWork.set(i, duringWork.get(i) - currentPower);
                if (duringWork.get(i) <= 0){
                    if (initialQuality.get(i) * 3 <= money){
                        duringWork.set(i, initialQuality.get(i));
                        money -= initialQuality.get(i) * 3;
                    } else {
                        if (i == duringWork.size()-1) {
                            duringWork.remove(i);
                            initialQuality.remove(i);
                        } else {
                            duringWork.remove(i);
                            initialQuality.remove(i);
                            i -= 1;
                        }
                    }
                }
            }



            command = scanner.nextLine();

        }
        for (Integer item : duringWork){
            System.out.printf("%d ", item);
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", money);
    }
}
