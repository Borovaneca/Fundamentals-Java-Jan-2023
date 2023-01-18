package Fundamentals.DataTypeAndVariables.Exercises.MoreExercises.MoreMore;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rotations = Integer.parseInt(scanner.nextLine());
        boolean opening = false;
        boolean closing = false;
        boolean balanced = false;

        for (int i = 1; i <= rotations ; i++) {

            String input = scanner.nextLine();
            if (input.charAt(0) == ')'){
                if (!opening){
                    balanced = true;
                } else {
                    closing = true;
                    opening = false;
                }
            }
            if (input.charAt(0)== '('){
                if (opening){
                    balanced = true;
                } else {
                    if (closing){
                        closing = false;
                    }
                    opening = true;
                }
            }
        }
        if (balanced || opening){
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
