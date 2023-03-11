package Fundamentals.TextProcessing.Exercise.MoreExercise;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String title = scanner.nextLine();
        System.out.println("<h1>");
        System.out.println("    " + title);
        System.out.println("</h1>");

        String article = scanner.nextLine();

        System.out.println("<article>");
        System.out.println("    " + article);
        System.out.println("</article>");

        String comment;

        while (!"end of comments".equals(comment = scanner.nextLine())) {
            System.out.println("<div>");
            System.out.println("    " + comment);
            System.out.println("</div>");

        }
    }
}
