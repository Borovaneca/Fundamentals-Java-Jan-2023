package BasicSyntaxConditionalStatmentsAndLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String userName = scanner.nextLine();
        String password = "";
        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }
        String inputPassword = scanner.nextLine();
        int count = 0;
        while (!inputPassword.equals(password)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!%n", userName);
                break;
            }
            System.out.printf("Incorrect password. Try again.%n");
            inputPassword = scanner.nextLine();
        }

        if (inputPassword.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
