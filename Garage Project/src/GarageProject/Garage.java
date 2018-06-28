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

    private boolean exists(int ID) {
        boolean exists = false;
        for (int i = 0; i < vehicleList.size() - 1; i++) {
            if (vehicleList.get(i).getID() == ID) {
                exists = true;
            }
        }
        return exists;
    }

    private int findPosByID(int ID) {
        int pos = 0;
        for (int i = 0; i < vehicleList.size() - 1; i++) {
            if (vehicleList.get(i).getID() == ID) {
                pos = i;
            }
        }
        return pos;
    }

    public void removeByID(int ID) {
        if (exists(ID)) {
            int pos = findPosByID(ID);
            vehicleList.remove(pos);
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
