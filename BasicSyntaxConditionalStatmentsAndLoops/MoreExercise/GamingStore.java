package BasicSyntaxConditionalStatmentsAndLoops.MoreExercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        double spendMoney = 0;
        String input = scanner.nextLine();

        while (!"Game Time".equals(input)) {
                if (input.equals("OutFall 4")) {
                    if (availableMoney < 39.99) {
                        System.out.println("Too Expensive");
                        input = scanner.nextLine();
                        continue;
                    } else {
                        availableMoney -= 39.99;
                        spendMoney += 39.99;
                        System.out.printf("Bought %s%n", input);
                    }
                } else if (input.equals("CS: OG")) {
                    if (availableMoney < 15.99) {
                        System.out.println("Too Expensive");
                        input = scanner.nextLine();
                        continue;
                    } else {
                        availableMoney -= 15.99;
                        spendMoney += 15.99;
                        System.out.printf("Bought %s%n", input);
                    }
                } else if (input.equals("Zplinter Zell")) {
                    if (availableMoney < 19.99) {
                        System.out.println("Too Expensive");
                        input = scanner.nextLine();
                        continue;
                    } else {
                        availableMoney -= 19.99;
                        spendMoney += 19.99;
                        System.out.printf("Bought %s%n", input);
                    }
                } else if (input.equals("Honored 2")) {
                    if (availableMoney < 59.99) {
                        System.out.println("Too Expensive");
                        input = scanner.nextLine();
                        continue;
                    } else {
                        availableMoney -= 59.99;
                        spendMoney += 59.99;
                        System.out.printf("Bought %s%n", input);
                    }
                } else if (input.equals("RoverWatch")) {
                    if (availableMoney < 29.99) {
                        System.out.println("Too Expensive");
                        input = scanner.nextLine();
                        continue;
                    } else {
                        availableMoney -= 29.99;
                        spendMoney += 29.99;
                        System.out.printf("Bought %s%n", input);
                    }
                } else if (input.equals("RoverWatch Origins Edition")) {
                    if (availableMoney < 39.99) {
                        System.out.println("Too Expensive");
                        input = scanner.nextLine();
                        continue;
                    } else {
                        availableMoney -= 39.99;
                        spendMoney += 39.99;
                        System.out.printf("Bought %s%n", input);
                    }
                } else {
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
                }
                
                if (availableMoney == 0) {
                    System.out.println("Out of money!");
                    break;
                }

                input = scanner.nextLine();
            }

            if (availableMoney > 0) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, availableMoney);
            }
        }
    }
