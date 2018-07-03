package libary.models;

public class Book extends Item {
    private String author;
    private String title;

    public Book(boolean inStock, String author, String title){
        super(inStock);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
