package GarageProject;

public class Vehicle {
    private String colour;
    private int numWheels;
    private int ID;

    protected Vehicle(int ID,String colour, int numWheels){
        this.setID(ID);
        this.setColour(colour);
        this.setNumWheels(numWheels);
    }

    protected String getColour() {
        return colour;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    protected int getNumWheels() {
        return numWheels;
    }

    protected void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    protected  int calcBill(){
        return 0;
    };

    protected int getID() {
        return ID;
    }

    protected void setID(int ID) {
        this.ID = ID;
    }
}
