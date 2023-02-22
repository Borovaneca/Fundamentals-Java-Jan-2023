package Fundamentals.OOP.Exercise.articles;

public class Article {

    private String title;
    private String content;
    private String author;


    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent){
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void rename(String newTitle){
        this.title = newTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
