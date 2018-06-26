package GarageProject;

public class Motorcycle extends Vehicle{
    private int numSeats;

    protected Motorcycle(int numSeats, String colour, int ID){
        super(ID,colour,2);
        this.setNumSeats(numSeats);
    }

    protected int getNumSeats() {
        return numSeats;
    }

    protected void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    protected int calcBill(){
        return 100;
    }
}
