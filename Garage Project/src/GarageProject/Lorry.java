package GarageProject;

public class Lorry extends Vehicle{
    private int maxLoad;

    public Lorry(int maxLoad, String colour,int ID){
        super(ID,colour,8);
        this.maxLoad = maxLoad ;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public int calcBill(){
        return 200;
    }
}
