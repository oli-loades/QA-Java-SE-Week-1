package libary.models;

public abstract class Item implements Crudable {
    private int ID;
    private  boolean inStock;

    public Item(int ID, boolean inStock){
        this.ID = ID;
        this.inStock = inStock;
    }

    public int getID() {
        return ID;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }



}
