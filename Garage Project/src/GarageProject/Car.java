package GarageProject;

public class Car extends Vehicle {
    private int numDoors;

    public Car(int numDoors, String colour,int ID) {
        super(ID,colour, 4);
        this.numDoors = numDoors;;
    }


    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public int calcBill(){
        return 50;
    }


}
