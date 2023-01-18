package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int yield = Integer.parseInt(scanner.nextLine());
        int remainingSpice = yield;
        int workedDays = 0;
        int workersDailyEat = 26;


        while (yield >= 100){

            workedDays++;
            if (workedDays > 1) {
                remainingSpice += yield - workersDailyEat;
            } else {
                remainingSpice -= workersDailyEat;
            }
            if (remainingSpice < 0){
                remainingSpice = 0;
            }


            yield -= 10;
        }
        if (workedDays == 0){
            remainingSpice = 0;
        } else {
            remainingSpice -= 26;
        }

        System.out.println(workedDays);
        System.out.println(remainingSpice);
    }
}
