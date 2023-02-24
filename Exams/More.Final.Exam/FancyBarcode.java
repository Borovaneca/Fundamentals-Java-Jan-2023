package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int products = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@#+(?<product>[A-Z][A-Za-z0-9*]{4,}[A-Z])@#+");

        for (int i = 1; i <= products; i++) {
            String currentProduct = scanner.nextLine();
            Matcher matcher = pattern.matcher(currentProduct);

            if (matcher.find()) {
                currentProduct = matcher.group("product");
                System.out.println("Product group: " + productBarcode(currentProduct));
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    private static String productBarcode(String currentProduct) {
        String barcode = "";
        boolean containsDigits = false;
        for (int i = 0; i < currentProduct.length(); i++) {
            if (Character.isDigit(currentProduct.charAt(i))) {
                barcode += currentProduct.charAt(i);
                containsDigits = true;
            }
        }
        return (containsDigits) ? barcode : "00";
    }
}
