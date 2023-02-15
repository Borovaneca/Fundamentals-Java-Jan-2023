package ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberArr = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < numberArr.size(); i++) {
            sum += numberArr.get(i);
        }
        double average = 1.0 * sum / numberArr.size();
        numberArr.sort(Collections.reverseOrder());

        int count = 0;
        for (int i = 0; i < numberArr.size(); i++) {
            if (numberArr.get(i) > average) {
                count++;
                System.out.printf("%d ", numberArr.get(i));
            } else if (i == numberArr.size() -1 && count == 0) {
                System.out.println("No");
            }
            if (count == 5) {
                break;
            }
        }
    }
}
