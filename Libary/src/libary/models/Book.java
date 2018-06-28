package libary.models;

public class Book extends Item {
    private String author;
    private String title;

    public Book(int ID, boolean inStock, String author, String title){
        super(ID,inStock);
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
