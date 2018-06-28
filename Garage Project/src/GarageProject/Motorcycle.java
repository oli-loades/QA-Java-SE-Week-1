package GarageProject;

public class Motorcycle extends Vehicle{
    private int numSeats;

    public Motorcycle(int numSeats, String colour, int ID){
        super(ID,colour,2);
        this.setNumSeats(numSeats);
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public int calcBill(){
        return 100;
    }
}
