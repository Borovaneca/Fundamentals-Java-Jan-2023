package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (inputNumbers.size() > 0){

            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= inputNumbers.size()-1){
                int indexValue = inputNumbers.get(index);
                sum += indexValue;
                inputNumbers.remove(index);
                modifiedList(inputNumbers, indexValue);
            } else if (index < 0){

                int firstElement = inputNumbers.get(0);
                sum += firstElement;
                inputNumbers.remove(0);
                int lastElement = inputNumbers.get(inputNumbers.size()-1);
                inputNumbers.add(0, lastElement);
                modifiedList(inputNumbers, firstElement);
            } else if (index > inputNumbers.size()-1){
                 int lastNum = inputNumbers.get(inputNumbers.size()-1);
                 sum += lastNum;
                 inputNumbers.remove(inputNumbers.size()-1);
                 int firstElement = inputNumbers.get(0);
                 inputNumbers.add(firstElement);
                 modifiedList(inputNumbers, lastNum);

            }
        }
        System.out.println(sum);
    }

    private static void modifiedList(List<Integer> inputNumbers, int firstElement) {
        for (int i = 0; i < inputNumbers.size(); i++) {
            int currentNumber = inputNumbers.get(i);
            if (currentNumber <= firstElement){
                currentNumber += firstElement;
            } else {
                currentNumber -= firstElement;
            }
            inputNumbers.set(i, currentNumber);
        }
    }
}
