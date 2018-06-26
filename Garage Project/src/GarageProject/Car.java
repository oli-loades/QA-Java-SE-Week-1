package GarageProject;

public class Car extends Vehicle {
    private int numDoors;

    protected Car(int numDoors, String colour,int ID) {
        super(ID,colour, 4);
        this.setNumDoors(numDoors);
    }


    protected int getNumDoors() {
        return numDoors;
    }

    protected void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    protected int calcBill(){
        return 50;
    }


}
