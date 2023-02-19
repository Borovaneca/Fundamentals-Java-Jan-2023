import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        
        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] commandArr = command.split(" - ");
            String actualCommand = commandArr[0];

            switch (actualCommand) {

                case "Add":
                    if (!phones.contains(commandArr[1])) {
                        phones.add(commandArr[1]);
                    }
                    break;

                case "Remove":
                    if (phones.contains(commandArr[1])) {
                        phones.remove(commandArr[1]);
                    }
                    break;

                case "Bonus phone":
                    String[] newPhones = commandArr[1].split(":");
                    if (phones.contains(newPhones[0])) {
                        int oldPhoneIndex = phones.indexOf(newPhones[0]);
                        phones.add(oldPhoneIndex + 1, newPhones[1]);
                    }
                    break;

                case "Last":
                    if (phones.contains(commandArr[1])) {
                        phones.remove(commandArr[1]);
                        phones.add(commandArr[1]);
                    }
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", phones));


    }
}
