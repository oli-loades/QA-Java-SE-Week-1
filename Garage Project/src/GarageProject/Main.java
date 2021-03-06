package GarageProject;

public class Main {

    public static void main(String[] args) {
        Car c = new Car(3,"red",1);
        Car c2 = new Car(3,"red",2);

        System.out.println(c.getID());

        Motorcycle m = new Motorcycle(1,"red",3);
        m.setColour("blue");
        System.out.println(m.getColour());

        Lorry l = new Lorry(300,"red",10);
        Lorry l2 = new Lorry(120,"red",12);

        Garage g = new Garage();
        g.addVehicle(c);
        g.addVehicle(c2);
        g.addVehicle(m);
        g.addVehicle(l);
        g.addVehicle(l2);

        System.out.println(g.calcBill());//600

        g.removedByType("Motorcycle");
        System.out.println(g.calcBill());//500

        g.removeByID(2);
        System.out.println(g.calcBill());//450

        g.emptyGarage();
        System.out.println(g.calcBill());//0
    }
}
