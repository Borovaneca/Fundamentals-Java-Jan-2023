    package Fundamentals.List;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.Scanner;
    import java.util.stream.Collectors;

    public class ListOfProducts {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int products = Integer.parseInt(scanner.nextLine());

            List<String> productsList = new ArrayList<>();
            for (int i = 1; i <= products; i++) {
                String currentProduct = scanner.nextLine();
                productsList.add(currentProduct);
            }
            List<String> sortedList = productsList.stream().sorted().collect(Collectors.toList());

            int article = 0;
            for (String product : sortedList){
                article++;
                System.out.printf("%d.%s%n", article, product);
            }
        }
    }
