package GarageProject;

public abstract class Vehicle {
    private String colour;
    private int numWheels;
    private int ID;

    public  Vehicle(int ID,String colour, int numWheels){
        this.setID(ID);
        this.setColour(colour);
        this.setNumWheels(numWheels);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public  abstract int calcBill();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
