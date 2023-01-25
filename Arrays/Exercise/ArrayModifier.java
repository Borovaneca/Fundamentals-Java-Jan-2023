package Fundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] original = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] modified = new int[original.length];

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("swap")){
                int first = Integer.parseInt(command.split(" ")[1]);
                int second = Integer.parseInt(command.split(" ")[2]);
                int element1 = original[first];
                int element2 = original[second];
                original[first] = element2;
                original[second] = element1;
                //modified = Swaps(original, first, second);
                //original = modified;
                //modified = new int[original.length];
            } else if (command.contains("multiply")){
                int first = Integer.parseInt(command.split(" ")[1]);
                int second = Integer.parseInt(command.split(" ")[2]);
                int element1 = original[first];
                int element2 = original[second];
                int multiply = element1 * element2;
                original[first] = multiply;
                //original = Multiply(original, first, second);
            } else if (command.equals("decrease")){
                modified = Decrease(original);
                original = modified;
                modified = new int[original.length];
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < original.length; i++) {
            if (i == original.length - 1){
                System.out.printf("%d", original[i]);
            } else {
                System.out.printf("%d, ", original[i]);
            }
        }
    }

    public static int[] Swaps(int[] old, int first, int second){

        int[] newArr = new int[old.length];
        int new1 = old[second];
        int new2 = old[first];

        for (int i = 0; i < newArr.length; i++) {
            if (i == first){
                newArr[i] = new1;
            } else if (i == second){
                newArr[i] = new2;
            } else {
                newArr[i] = old[i];
            }
        }

        return newArr;
    }

    public static int[] Multiply(int[] original, int firstIndex, int secondIndex){

        int[] modified = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            if (i == firstIndex){
                modified[i] = original[i] * original[secondIndex];
            } else {
                modified[i] = original[i];
            }
        }
        return modified;
    }

    public static int[] Decrease(int[] original){
        int[] modified = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            modified[i] = original[i] - 1;
        }
        return modified;
    }
}
