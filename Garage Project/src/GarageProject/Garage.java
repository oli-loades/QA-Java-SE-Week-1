package GarageProject;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicleList;

    public Garage() {
        vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle newVehicle) {
        vehicleList.add(newVehicle);
    }

    public int calcBill() {
        int total = 0;
        for (Vehicle v : vehicleList) {
            total += v.calcBill();
        }
        return total;
    }

    public void emptyGarage() {
        vehicleList.clear();
    }



    public void removeByID(int ID) {
        for (int i = 0; i<= vehicleList.size()-1;i++){
            Vehicle v =vehicleList.get(i);
           if(v.getID()==ID) {
               vehicleList.remove(v);
               i--;
           }
        }
    }

    public void removedByType(String type) {
        for (int i = 0; i<= vehicleList.size()-1;i++){
            Vehicle v =vehicleList.get(i);
            switch (type) {
                case ("Car"):
                    if (v instanceof Car) {
                        vehicleList.remove(v);
                        i--;//go back so does not skip anything
                    }
                    break;
                case ("Motorcycle"):
                    if (v instanceof Motorcycle) {

                        vehicleList.remove(v);
                        i--;

                    }
                    break;
                case ("Lorry"):
                    if (v instanceof Lorry) {
                        vehicleList.remove(v);
                        i--;
                    }
                    break;
                default:
                    System.out.println("Invalid type");
                    break;
            }
        }
    }
}
