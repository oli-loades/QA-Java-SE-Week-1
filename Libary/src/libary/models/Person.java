package libary.models;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private static int counter = 0;
    private  int ID;
    private String name;
    private List<Item> items;

    public Person(String name) {
        this.ID = ++counter;
        this.name = name;
        items = new ArrayList<>();
    }

    public void addItem(Item newItem) {
        items.add(newItem);
    }

    public List<Item> getItemList() {
        return items;
    }

    public void removeItem(int ID) {
        int pos = 0;
        int found = -1;

        for (Item i : items) {
            if (i.getID() == ID) {
                found = pos;
            }
            pos++;
        }

        if (found != -1) {
            items.remove(found);
        }
    }

    public void clearItemList() {
        items.clear();
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " name: " + name;
    }

    public static void retCounter(int x){
        counter = x;
    }

}
