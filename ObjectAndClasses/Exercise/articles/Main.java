package Fundamentals.OOP.Exercise.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String[] articleArr = articleData.split(", ");
        Article article = new Article(articleArr[0], articleArr[1], articleArr[2]);


        int rotation = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rotation; i++) {
            String command = scanner.nextLine();
            if (command.contains("Rename")) {
                article.rename(command.split(": ")[1]);
            } else if (command.contains("Edit")) {
                article.edit(command.split(": ")[1]);
            } else if (command.contains("ChangeAuthor")) {
                article.changeAuthor(command.split(": ")[1]);
            }
        }
        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}