package GarageProject;

public class Lorry extends Vehicle{
    private int maxLoad;

    protected Lorry(int maxLoad, String colour,int ID){
        super(ID,colour,8);
        this.setMaxLoad(maxLoad);
    }

    protected int getMaxLoad() {
        return maxLoad;
    }

    protected void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    protected int calcBill(){
        return 200;
    }
}
