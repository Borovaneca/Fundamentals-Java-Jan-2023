package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises;

import java.util.Scanner;

public class IntegerOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = 0;
        for (int i = 1; i <= 4; i++) {

            if (i == 1){
                num = Integer.parseInt(scanner.nextLine());
            } else if (i == 2){
                num += Integer.parseInt(scanner.nextLine());
            } else if (i == 3){
                num = num / Integer.parseInt(scanner.nextLine());
            } else if (i == 4){
                num = num * Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(num);
    }
}
