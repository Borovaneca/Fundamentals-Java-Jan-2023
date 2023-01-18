package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises.MoreMore;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            Scanner type = new Scanner(input);
            if (type.hasNextBoolean()){
                System.out.println(input + " is boolean type");
            } else if (type.hasNextInt()){
                System.out.println(input + " is integer type");
            } else if (type.hasNextDouble()){
                System.out.println(input + " is floating point type");
            } else if (input.length() == 1){
                System.out.println(input + " is character type");
            } else if (type.hasNextLine()) {
                System.out.println(input + " is string type");
            }

            input = scanner.nextLine();
        }
    }
}
