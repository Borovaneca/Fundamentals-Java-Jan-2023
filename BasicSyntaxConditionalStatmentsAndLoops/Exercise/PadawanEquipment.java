package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double availableMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double calcLightSabersPrice = Math.ceil(countOfStudents + (countOfStudents * 0.10));

        double calcLightSabers = calcLightSabersPrice * priceOfLightSabers;
        int countByDividing = countOfStudents / 6;
        double calcBelts = (countOfStudents - countByDividing) * priceOfBelts;
        double calcRobes = countOfStudents * priceOfRobes;
        double totalSum = calcBelts + calcRobes + calcLightSabers;

        if (totalSum <= availableMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalSum - availableMoney));
        }
    }
}
