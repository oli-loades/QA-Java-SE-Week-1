package libary.models;

public abstract class Item  {
    private static int counter = 0;
    private int ID;
    private boolean inStock;

    public Item(boolean inStock) {
        this.ID = ++counter;
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

    public static void setCounter(int x){
        counter = x;
    }

}
