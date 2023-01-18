package BasicSyntaxConditionalStatmentsAndLoops;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] studentInfo = new String[3];
        studentInfo[0] = "Name: " + scanner.nextLine();
        studentInfo[1] = "Age: " + scanner.nextLine();
        studentInfo[2] = "Grade: " + scanner.nextLine();
        System.out.println(String.join(", ", studentInfo));
    }
}
