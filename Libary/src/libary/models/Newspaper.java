package libary.models;

public class Newspaper extends Item {
    private String publisher;
    private NewspaperType type;

    public Newspaper( boolean inStock, String publisher, NewspaperType type){
        super(inStock);
        this.publisher = publisher;
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public NewspaperType getType() {
        return type;
    }

    public void setType(NewspaperType type) {
        this.type = type;
    }
}
