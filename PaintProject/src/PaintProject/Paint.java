package PaintProject;

public class Paint {
    private int coverage;
    private double price;
    private int volume;
    private String name;
    
    protected Paint(int coverage, double price, int volume, String name){
        this.coverage = coverage;
        this.price = price;
        this.volume = volume;
        this.name = name;
    }

    protected int getCoverage() {
        return coverage;
    }

    protected String getName(){
        return name;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getVolume() {
        return volume;
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected double pricePerLitre(){
        return price/(double) volume;
    }

    @Override
    public String toString(){
        return name + " coverage: " + coverage + "m2 price: £" + price + " volume: " + volume;
    }
}
